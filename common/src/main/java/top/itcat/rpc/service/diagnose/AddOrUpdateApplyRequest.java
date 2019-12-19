/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package top.itcat.rpc.service.diagnose;

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
public class AddOrUpdateApplyRequest implements org.apache.thrift.TBase<AddOrUpdateApplyRequest, AddOrUpdateApplyRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AddOrUpdateApplyRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddOrUpdateApplyRequest");

  private static final org.apache.thrift.protocol.TField BEAN_FIELD_DESC = new org.apache.thrift.protocol.TField("bean", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AddOrUpdateApplyRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AddOrUpdateApplyRequestTupleSchemeFactory());
  }

  public top.itcat.rpc.service.model.Apply bean; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BEAN((short)1, "bean");

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
        case 1: // BEAN
          return BEAN;
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
  private static final _Fields optionals[] = {_Fields.BEAN};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BEAN, new org.apache.thrift.meta_data.FieldMetaData("bean", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, top.itcat.rpc.service.model.Apply.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddOrUpdateApplyRequest.class, metaDataMap);
  }

  public AddOrUpdateApplyRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddOrUpdateApplyRequest(AddOrUpdateApplyRequest other) {
    if (other.isSetBean()) {
      this.bean = new top.itcat.rpc.service.model.Apply(other.bean);
    }
  }

  public AddOrUpdateApplyRequest deepCopy() {
    return new AddOrUpdateApplyRequest(this);
  }

  @Override
  public void clear() {
    this.bean = null;
  }

  public top.itcat.rpc.service.model.Apply getBean() {
    return this.bean;
  }

  public AddOrUpdateApplyRequest setBean(top.itcat.rpc.service.model.Apply bean) {
    this.bean = bean;
    return this;
  }

  public void unsetBean() {
    this.bean = null;
  }

  /** Returns true if field bean is set (has been assigned a value) and false otherwise */
  public boolean isSetBean() {
    return this.bean != null;
  }

  public void setBeanIsSet(boolean value) {
    if (!value) {
      this.bean = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BEAN:
      if (value == null) {
        unsetBean();
      } else {
        setBean((top.itcat.rpc.service.model.Apply)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BEAN:
      return getBean();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BEAN:
      return isSetBean();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AddOrUpdateApplyRequest)
      return this.equals((AddOrUpdateApplyRequest)that);
    return false;
  }

  public boolean equals(AddOrUpdateApplyRequest that) {
    if (that == null)
      return false;

    boolean this_present_bean = true && this.isSetBean();
    boolean that_present_bean = true && that.isSetBean();
    if (this_present_bean || that_present_bean) {
      if (!(this_present_bean && that_present_bean))
        return false;
      if (!this.bean.equals(that.bean))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_bean = true && (isSetBean());
    list.add(present_bean);
    if (present_bean)
      list.add(bean);

    return list.hashCode();
  }

  @Override
  public int compareTo(AddOrUpdateApplyRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBean()).compareTo(other.isSetBean());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBean()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bean, other.bean);
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
    StringBuilder sb = new StringBuilder("AddOrUpdateApplyRequest(");
    boolean first = true;

    if (isSetBean()) {
      sb.append("bean:");
      if (this.bean == null) {
        sb.append("null");
      } else {
        sb.append(this.bean);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (bean != null) {
      bean.validate();
    }
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

  private static class AddOrUpdateApplyRequestStandardSchemeFactory implements SchemeFactory {
    public AddOrUpdateApplyRequestStandardScheme getScheme() {
      return new AddOrUpdateApplyRequestStandardScheme();
    }
  }

  private static class AddOrUpdateApplyRequestStandardScheme extends StandardScheme<AddOrUpdateApplyRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AddOrUpdateApplyRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BEAN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.bean = new top.itcat.rpc.service.model.Apply();
              struct.bean.read(iprot);
              struct.setBeanIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AddOrUpdateApplyRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.bean != null) {
        if (struct.isSetBean()) {
          oprot.writeFieldBegin(BEAN_FIELD_DESC);
          struct.bean.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddOrUpdateApplyRequestTupleSchemeFactory implements SchemeFactory {
    public AddOrUpdateApplyRequestTupleScheme getScheme() {
      return new AddOrUpdateApplyRequestTupleScheme();
    }
  }

  private static class AddOrUpdateApplyRequestTupleScheme extends TupleScheme<AddOrUpdateApplyRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddOrUpdateApplyRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBean()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetBean()) {
        struct.bean.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddOrUpdateApplyRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.bean = new top.itcat.rpc.service.model.Apply();
        struct.bean.read(iprot);
        struct.setBeanIsSet(true);
      }
    }
  }

}

