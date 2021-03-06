package org.springframework.social.evernote.api.impl;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Proxy interceptor that wraps a returned thrift object to have null-safe-collections.
 *
 * @author Tadaya Tsuyukubo
 */
public class ThriftWrapperInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		final Object result = invocation.proceed();  // can be AfterAdvice
		return ThriftWrapper.makeNullSafe(result);
	}
}
