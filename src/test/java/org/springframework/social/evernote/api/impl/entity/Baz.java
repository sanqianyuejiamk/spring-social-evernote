/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.springframework.social.evernote.api.impl.entity;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Baz implements org.apache.thrift.TBase<Baz, Baz._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Baz");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BAZ_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("bazList", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField BAZ_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("bazSet", org.apache.thrift.protocol.TType.SET, (short)3);
  private static final org.apache.thrift.protocol.TField BAZ_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("bazMap", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BazStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BazTupleSchemeFactory());
  }

  public String name; // optional
  public List<String> bazList; // optional
  public Set<String> bazSet; // optional
  public Map<String,String> bazMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    BAZ_LIST((short)2, "bazList"),
    BAZ_SET((short)3, "bazSet"),
    BAZ_MAP((short)4, "bazMap");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // BAZ_LIST
          return BAZ_LIST;
        case 3: // BAZ_SET
          return BAZ_SET;
        case 4: // BAZ_MAP
          return BAZ_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.NAME,_Fields.BAZ_LIST,_Fields.BAZ_SET,_Fields.BAZ_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BAZ_LIST, new org.apache.thrift.meta_data.FieldMetaData("bazList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.BAZ_SET, new org.apache.thrift.meta_data.FieldMetaData("bazSet", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.BAZ_MAP, new org.apache.thrift.meta_data.FieldMetaData("bazMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Baz.class, metaDataMap);
  }

  public Baz() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Baz(Baz other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetBazList()) {
      List<String> __this__bazList = new ArrayList<String>();
      for (String other_element : other.bazList) {
        __this__bazList.add(other_element);
      }
      this.bazList = __this__bazList;
    }
    if (other.isSetBazSet()) {
      Set<String> __this__bazSet = new HashSet<String>();
      for (String other_element : other.bazSet) {
        __this__bazSet.add(other_element);
      }
      this.bazSet = __this__bazSet;
    }
    if (other.isSetBazMap()) {
      Map<String,String> __this__bazMap = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.bazMap.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__bazMap_copy_key = other_element_key;

        String __this__bazMap_copy_value = other_element_value;

        __this__bazMap.put(__this__bazMap_copy_key, __this__bazMap_copy_value);
      }
      this.bazMap = __this__bazMap;
    }
  }

  public Baz deepCopy() {
    return new Baz(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.bazList = null;
    this.bazSet = null;
    this.bazMap = null;
  }

  public String getName() {
    return this.name;
  }

  public Baz setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getBazListSize() {
    return (this.bazList == null) ? 0 : this.bazList.size();
  }

  public java.util.Iterator<String> getBazListIterator() {
    return (this.bazList == null) ? null : this.bazList.iterator();
  }

  public void addToBazList(String elem) {
    if (this.bazList == null) {
      this.bazList = new ArrayList<String>();
    }
    this.bazList.add(elem);
  }

  public List<String> getBazList() {
    return this.bazList;
  }

  public Baz setBazList(List<String> bazList) {
    this.bazList = bazList;
    return this;
  }

  public void unsetBazList() {
    this.bazList = null;
  }

  /** Returns true if field bazList is set (has been assigned a value) and false otherwise */
  public boolean isSetBazList() {
    return this.bazList != null;
  }

  public void setBazListIsSet(boolean value) {
    if (!value) {
      this.bazList = null;
    }
  }

  public int getBazSetSize() {
    return (this.bazSet == null) ? 0 : this.bazSet.size();
  }

  public java.util.Iterator<String> getBazSetIterator() {
    return (this.bazSet == null) ? null : this.bazSet.iterator();
  }

  public void addToBazSet(String elem) {
    if (this.bazSet == null) {
      this.bazSet = new HashSet<String>();
    }
    this.bazSet.add(elem);
  }

  public Set<String> getBazSet() {
    return this.bazSet;
  }

  public Baz setBazSet(Set<String> bazSet) {
    this.bazSet = bazSet;
    return this;
  }

  public void unsetBazSet() {
    this.bazSet = null;
  }

  /** Returns true if field bazSet is set (has been assigned a value) and false otherwise */
  public boolean isSetBazSet() {
    return this.bazSet != null;
  }

  public void setBazSetIsSet(boolean value) {
    if (!value) {
      this.bazSet = null;
    }
  }

  public int getBazMapSize() {
    return (this.bazMap == null) ? 0 : this.bazMap.size();
  }

  public void putToBazMap(String key, String val) {
    if (this.bazMap == null) {
      this.bazMap = new HashMap<String,String>();
    }
    this.bazMap.put(key, val);
  }

  public Map<String,String> getBazMap() {
    return this.bazMap;
  }

  public Baz setBazMap(Map<String,String> bazMap) {
    this.bazMap = bazMap;
    return this;
  }

  public void unsetBazMap() {
    this.bazMap = null;
  }

  /** Returns true if field bazMap is set (has been assigned a value) and false otherwise */
  public boolean isSetBazMap() {
    return this.bazMap != null;
  }

  public void setBazMapIsSet(boolean value) {
    if (!value) {
      this.bazMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case BAZ_LIST:
      if (value == null) {
        unsetBazList();
      } else {
        setBazList((List<String>)value);
      }
      break;

    case BAZ_SET:
      if (value == null) {
        unsetBazSet();
      } else {
        setBazSet((Set<String>)value);
      }
      break;

    case BAZ_MAP:
      if (value == null) {
        unsetBazMap();
      } else {
        setBazMap((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case BAZ_LIST:
      return getBazList();

    case BAZ_SET:
      return getBazSet();

    case BAZ_MAP:
      return getBazMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case BAZ_LIST:
      return isSetBazList();
    case BAZ_SET:
      return isSetBazSet();
    case BAZ_MAP:
      return isSetBazMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Baz)
      return this.equals((Baz)that);
    return false;
  }

  public boolean equals(Baz that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_bazList = true && this.isSetBazList();
    boolean that_present_bazList = true && that.isSetBazList();
    if (this_present_bazList || that_present_bazList) {
      if (!(this_present_bazList && that_present_bazList))
        return false;
      if (!this.bazList.equals(that.bazList))
        return false;
    }

    boolean this_present_bazSet = true && this.isSetBazSet();
    boolean that_present_bazSet = true && that.isSetBazSet();
    if (this_present_bazSet || that_present_bazSet) {
      if (!(this_present_bazSet && that_present_bazSet))
        return false;
      if (!this.bazSet.equals(that.bazSet))
        return false;
    }

    boolean this_present_bazMap = true && this.isSetBazMap();
    boolean that_present_bazMap = true && that.isSetBazMap();
    if (this_present_bazMap || that_present_bazMap) {
      if (!(this_present_bazMap && that_present_bazMap))
        return false;
      if (!this.bazMap.equals(that.bazMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Baz other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Baz typedOther = (Baz)other;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBazList()).compareTo(typedOther.isSetBazList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBazList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bazList, typedOther.bazList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBazSet()).compareTo(typedOther.isSetBazSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBazSet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bazSet, typedOther.bazSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBazMap()).compareTo(typedOther.isSetBazMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBazMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bazMap, typedOther.bazMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Baz(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetBazList()) {
      if (!first) sb.append(", ");
      sb.append("bazList:");
      if (this.bazList == null) {
        sb.append("null");
      } else {
        sb.append(this.bazList);
      }
      first = false;
    }
    if (isSetBazSet()) {
      if (!first) sb.append(", ");
      sb.append("bazSet:");
      if (this.bazSet == null) {
        sb.append("null");
      } else {
        sb.append(this.bazSet);
      }
      first = false;
    }
    if (isSetBazMap()) {
      if (!first) sb.append(", ");
      sb.append("bazMap:");
      if (this.bazMap == null) {
        sb.append("null");
      } else {
        sb.append(this.bazMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BazStandardSchemeFactory implements SchemeFactory {
    public BazStandardScheme getScheme() {
      return new BazStandardScheme();
    }
  }

  private static class BazStandardScheme extends StandardScheme<Baz> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Baz struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BAZ_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.bazList = new ArrayList<String>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  String _elem2; // optional
                  _elem2 = iprot.readString();
                  struct.bazList.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setBazListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BAZ_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set3 = iprot.readSetBegin();
                struct.bazSet = new HashSet<String>(2*_set3.size);
                for (int _i4 = 0; _i4 < _set3.size; ++_i4)
                {
                  String _elem5; // optional
                  _elem5 = iprot.readString();
                  struct.bazSet.add(_elem5);
                }
                iprot.readSetEnd();
              }
              struct.setBazSetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BAZ_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map6 = iprot.readMapBegin();
                struct.bazMap = new HashMap<String,String>(2*_map6.size);
                for (int _i7 = 0; _i7 < _map6.size; ++_i7)
                {
                  String _key8; // required
                  String _val9; // required
                  _key8 = iprot.readString();
                  _val9 = iprot.readString();
                  struct.bazMap.put(_key8, _val9);
                }
                iprot.readMapEnd();
              }
              struct.setBazMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Baz struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.bazList != null) {
        if (struct.isSetBazList()) {
          oprot.writeFieldBegin(BAZ_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.bazList.size()));
            for (String _iter10 : struct.bazList)
            {
              oprot.writeString(_iter10);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.bazSet != null) {
        if (struct.isSetBazSet()) {
          oprot.writeFieldBegin(BAZ_SET_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.bazSet.size()));
            for (String _iter11 : struct.bazSet)
            {
              oprot.writeString(_iter11);
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.bazMap != null) {
        if (struct.isSetBazMap()) {
          oprot.writeFieldBegin(BAZ_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.bazMap.size()));
            for (Map.Entry<String, String> _iter12 : struct.bazMap.entrySet())
            {
              oprot.writeString(_iter12.getKey());
              oprot.writeString(_iter12.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BazTupleSchemeFactory implements SchemeFactory {
    public BazTupleScheme getScheme() {
      return new BazTupleScheme();
    }
  }

  private static class BazTupleScheme extends TupleScheme<Baz> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Baz struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetBazList()) {
        optionals.set(1);
      }
      if (struct.isSetBazSet()) {
        optionals.set(2);
      }
      if (struct.isSetBazMap()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetBazList()) {
        {
          oprot.writeI32(struct.bazList.size());
          for (String _iter13 : struct.bazList)
          {
            oprot.writeString(_iter13);
          }
        }
      }
      if (struct.isSetBazSet()) {
        {
          oprot.writeI32(struct.bazSet.size());
          for (String _iter14 : struct.bazSet)
          {
            oprot.writeString(_iter14);
          }
        }
      }
      if (struct.isSetBazMap()) {
        {
          oprot.writeI32(struct.bazMap.size());
          for (Map.Entry<String, String> _iter15 : struct.bazMap.entrySet())
          {
            oprot.writeString(_iter15.getKey());
            oprot.writeString(_iter15.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Baz struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list16 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.bazList = new ArrayList<String>(_list16.size);
          for (int _i17 = 0; _i17 < _list16.size; ++_i17)
          {
            String _elem18; // optional
            _elem18 = iprot.readString();
            struct.bazList.add(_elem18);
          }
        }
        struct.setBazListIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TSet _set19 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.bazSet = new HashSet<String>(2*_set19.size);
          for (int _i20 = 0; _i20 < _set19.size; ++_i20)
          {
            String _elem21; // optional
            _elem21 = iprot.readString();
            struct.bazSet.add(_elem21);
          }
        }
        struct.setBazSetIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map22 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.bazMap = new HashMap<String,String>(2*_map22.size);
          for (int _i23 = 0; _i23 < _map22.size; ++_i23)
          {
            String _key24; // required
            String _val25; // required
            _key24 = iprot.readString();
            _val25 = iprot.readString();
            struct.bazMap.put(_key24, _val25);
          }
        }
        struct.setBazMapIsSet(true);
      }
    }
  }

}

