package org.springframework.social.evernote.api.impl;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.social.evernote.api.EvernoteExceptionUtils;
import org.springframework.social.evernote.api.StoreClientHolder;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * Call a corresponding method in underlying ~StoreClient instance from ~Operations interface
 *
 * @author Tadaya Tsuyukubo
 */
public class ClientStoreMethodInterceptor implements MethodInterceptor {

	private static Method GET_STORE_CLIENT_METHOD = ReflectionUtils.findMethod(StoreClientHolder.class, "getStoreClient");

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		final Object target = invocation.getThis();  // target client store instance
		final Class<?> targetClass = target.getClass();
		final Method invokedMethod = invocation.getMethod();  // invoked method in ~Operations

		// for StoreClientHolder.getStoreClient()
		if (GET_STORE_CLIENT_METHOD.equals(invokedMethod)) {
			return target;  // return underlying store instance
		}

		// From invoked method in ~Operations, find corresponding method in actual ~StoreClient class
		final Method targetMethod =
				ReflectionUtils.findMethod(targetClass, invokedMethod.getName(), invokedMethod.getParameterTypes());

		ReflectionUtils.makeAccessible(targetMethod);

		try {
			final Object result = ReflectionUtils.invokeMethod(targetMethod, target, invocation.getArguments());

			// to call other chained advices, it has to proceed the invocation.
			try {
				// since invocation.getThis() == store client, invocation.getMethod() == ~Operations class's method
				// this proceed() should fail due to incompatible method invocation.
				invocation.proceed();  // for just triggering other chained advices
			} catch (Throwable throwable) {
			}

			return result;
		} catch (Exception e) {
			// retrieve original exception.
			// ReflectionUtils wraps checked exception to UndeclaredThrowableException.
			Throwable original = getOriginalException(e);
			throw EvernoteExceptionUtils.convert((Exception) original);
		}

	}

	private static Throwable getOriginalException(Throwable e) {
		Throwable original = e;
		// for checked exception, it is wrapped by UndeclaredThrowableException.
		if (e instanceof UndeclaredThrowableException) {
			original = getOriginalException(e.getCause());
		}
		return original;
	}

}
