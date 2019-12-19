/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package top.itcat.rpc.service.hospital;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2019-7-3")
public class AddOrUpdateDepartmentRequest implements org.apache.thrift.TBase<AddOrUpdateDepartmentRequest, AddOrUpdateDepartmentRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AddOrUpdateDepartmentRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddOrUpdateDepartmentRequest");

  private static final org.apache.thrift.protocol.TField BEAN_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("beanList", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AddOrUpdateDepartmentRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AddOrUpdateDepartmentRequestTupleSchemeFactory());
  }

  public List<top.itcat.rpc.service.model.Department> beanList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BEAN_LIST((short)1, "beanList");

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
        case 1: // BEAN_LIST
          return BEAN_LIST;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BEAN_LIST, new org.apache.thrift.meta_data.FieldMetaData("beanList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, top.itcat.rpc.service.model.Department.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddOrUpdateDepartmentRequest.class, metaDataMap);
  }

  public AddOrUpdateDepartmentRequest() {
  }

  public AddOrUpdateDepartmentRequest(
    List<top.itcat.rpc.service.model.Department> beanList)
  {
    this();
    this.beanList = beanList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddOrUpdateDepartmentRequest(AddOrUpdateDepartmentRequest other) {
    if (other.isSetBeanList()) {
      List<top.itcat.rpc.service.model.Department> __this__beanList = new ArrayList<top.itcat.rpc.service.model.Department>(other.beanList.size());
      for (top.itcat.rpc.service.model.Department other_element : other.beanList) {
        __this__beanList.add(new top.itcat.rpc.service.model.Department(other_element));
      }
      this.beanList = __this__beanList;
    }
  }

  public AddOrUpdateDepartmentRequest deepCopy() {
    return new AddOrUpdateDepartmentRequest(this);
  }

  @Override
  public void clear() {
    this.beanList = null;
  }

  public int getBeanListSize() {
    return (this.beanList == null) ? 0 : this.beanList.size();
  }

  public java.util.Iterator<top.itcat.rpc.service.model.Department> getBeanListIterator() {
    return (this.beanList == null) ? null : this.beanList.iterator();
  }

  public void addToBeanList(top.itcat.rpc.service.model.Department elem) {
    if (this.beanList == null) {
      this.beanList = new ArrayList<top.itcat.rpc.service.model.Department>();
    }
    this.beanList.add(elem);
  }

  public List<top.itcat.rpc.service.model.Department> getBeanList() {
    return this.beanList;
  }

  public AddOrUpdateDepartmentRequest setBeanList(List<top.itcat.rpc.service.model.Department> beanList) {
    this.beanList = beanList;
    return this;
  }

  public void unsetBeanList() {
    this.beanList = null;
  }

  /** Returns true if field beanList is set (has been assigned a value) and false otherwise */
  public boolean isSetBeanList() {
    return this.beanList != null;
  }

  public void setBeanListIsSet(boolean value) {
    if (!value) {
      this.beanList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BEAN_LIST:
      if (value == null) {
        unsetBeanList();
      } else {
        setBeanList((List<top.itcat.rpc.service.model.Department>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BEAN_LIST:
      return getBeanList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BEAN_LIST:
      return isSetBeanList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AddOrUpdateDepartmentRequest)
      return this.equals((AddOrUpdateDepartmentRequest)that);
    return false;
  }

  public boolean equals(AddOrUpdateDepartmentRequest that) {
    if (that == null)
      return false;

    boolean this_present_beanList = true && this.isSetBeanList();
    boolean that_present_beanList = true && that.isSetBeanList();
    if (this_present_beanList || that_present_beanList) {
      if (!(this_present_beanList && that_present_beanList))
        return false;
      if (!this.beanList.equals(that.beanList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_beanList = true && (isSetBeanList());
    list.add(present_beanList);
    if (present_beanList)
      list.add(beanList);

    return list.hashCode();
  }

  @Override
  public int compareTo(AddOrUpdateDepartmentRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBeanList()).compareTo(other.isSetBeanList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBeanList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.beanList, other.beanList);
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
    StringBuilder sb = new StringBuilder("AddOrUpdateDepartmentRequest(");
    boolean first = true;

    sb.append("beanList:");
    if (this.beanList == null) {
      sb.append("null");
    } else {
      sb.append(this.beanList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (beanList == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'beanList' was not present! Struct: " + toString());
    }
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

  private static class AddOrUpdateDepartmentRequestStandardSchemeFactory implements SchemeFactory {
    public AddOrUpdateDepartmentRequestStandardScheme getScheme() {
      return new AddOrUpdateDepartmentRequestStandardScheme();
    }
  }

  private static class AddOrUpdateDepartmentRequestStandardScheme extends StandardScheme<AddOrUpdateDepartmentRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AddOrUpdateDepartmentRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BEAN_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.beanList = new ArrayList<top.itcat.rpc.service.model.Department>(_list16.size);
                top.itcat.rpc.service.model.Department _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = new top.itcat.rpc.service.model.Department();
                  _elem17.read(iprot);
                  struct.beanList.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setBeanListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AddOrUpdateDepartmentRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.beanList != null) {
        oprot.writeFieldBegin(BEAN_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.beanList.size()));
          for (top.itcat.rpc.service.model.Department _iter19 : struct.beanList)
          {
            _iter19.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddOrUpdateDepartmentRequestTupleSchemeFactory implements SchemeFactory {
    public AddOrUpdateDepartmentRequestTupleScheme getScheme() {
      return new AddOrUpdateDepartmentRequestTupleScheme();
    }
  }

  private static class AddOrUpdateDepartmentRequestTupleScheme extends TupleScheme<AddOrUpdateDepartmentRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddOrUpdateDepartmentRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.beanList.size());
        for (top.itcat.rpc.service.model.Department _iter20 : struct.beanList)
        {
          _iter20.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddOrUpdateDepartmentRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.beanList = new ArrayList<top.itcat.rpc.service.model.Department>(_list21.size);
        top.itcat.rpc.service.model.Department _elem22;
        for (int _i23 = 0; _i23 < _list21.size; ++_i23)
        {
          _elem22 = new top.itcat.rpc.service.model.Department();
          _elem22.read(iprot);
          struct.beanList.add(_elem22);
        }
      }
      struct.setBeanListIsSet(true);
    }
  }

}

