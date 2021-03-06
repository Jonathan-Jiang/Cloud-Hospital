/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package top.itcat.rpc.service.user;

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
public class GetUserByUsernameAndPasswordResponse implements org.apache.thrift.TBase<GetUserByUsernameAndPasswordResponse, GetUserByUsernameAndPasswordResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetUserByUsernameAndPasswordResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetUserByUsernameAndPasswordResponse");

  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField BASE_RESP_FIELD_DESC = new org.apache.thrift.protocol.TField("BaseResp", org.apache.thrift.protocol.TType.STRUCT, (short)255);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetUserByUsernameAndPasswordResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetUserByUsernameAndPasswordResponseTupleSchemeFactory());
  }

  public top.itcat.rpc.service.model.PackedUser user; // optional
  public top.itcat.rpc.base.BaseResp BaseResp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER((short)1, "user"),
    BASE_RESP((short)255, "BaseResp");

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
        case 1: // USER
          return USER;
        case 255: // BASE_RESP
          return BASE_RESP;
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
  private static final _Fields optionals[] = {_Fields.USER};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, top.itcat.rpc.service.model.PackedUser.class)));
    tmpMap.put(_Fields.BASE_RESP, new org.apache.thrift.meta_data.FieldMetaData("BaseResp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, top.itcat.rpc.base.BaseResp.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetUserByUsernameAndPasswordResponse.class, metaDataMap);
  }

  public GetUserByUsernameAndPasswordResponse() {
  }

  public GetUserByUsernameAndPasswordResponse(
    top.itcat.rpc.base.BaseResp BaseResp)
  {
    this();
    this.BaseResp = BaseResp;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetUserByUsernameAndPasswordResponse(GetUserByUsernameAndPasswordResponse other) {
    if (other.isSetUser()) {
      this.user = new top.itcat.rpc.service.model.PackedUser(other.user);
    }
    if (other.isSetBaseResp()) {
      this.BaseResp = new top.itcat.rpc.base.BaseResp(other.BaseResp);
    }
  }

  public GetUserByUsernameAndPasswordResponse deepCopy() {
    return new GetUserByUsernameAndPasswordResponse(this);
  }

  @Override
  public void clear() {
    this.user = null;
    this.BaseResp = null;
  }

  public top.itcat.rpc.service.model.PackedUser getUser() {
    return this.user;
  }

  public GetUserByUsernameAndPasswordResponse setUser(top.itcat.rpc.service.model.PackedUser user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public top.itcat.rpc.base.BaseResp getBaseResp() {
    return this.BaseResp;
  }

  public GetUserByUsernameAndPasswordResponse setBaseResp(top.itcat.rpc.base.BaseResp BaseResp) {
    this.BaseResp = BaseResp;
    return this;
  }

  public void unsetBaseResp() {
    this.BaseResp = null;
  }

  /** Returns true if field BaseResp is set (has been assigned a value) and false otherwise */
  public boolean isSetBaseResp() {
    return this.BaseResp != null;
  }

  public void setBaseRespIsSet(boolean value) {
    if (!value) {
      this.BaseResp = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((top.itcat.rpc.service.model.PackedUser)value);
      }
      break;

    case BASE_RESP:
      if (value == null) {
        unsetBaseResp();
      } else {
        setBaseResp((top.itcat.rpc.base.BaseResp)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER:
      return getUser();

    case BASE_RESP:
      return getBaseResp();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER:
      return isSetUser();
    case BASE_RESP:
      return isSetBaseResp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetUserByUsernameAndPasswordResponse)
      return this.equals((GetUserByUsernameAndPasswordResponse)that);
    return false;
  }

  public boolean equals(GetUserByUsernameAndPasswordResponse that) {
    if (that == null)
      return false;

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_BaseResp = true && this.isSetBaseResp();
    boolean that_present_BaseResp = true && that.isSetBaseResp();
    if (this_present_BaseResp || that_present_BaseResp) {
      if (!(this_present_BaseResp && that_present_BaseResp))
        return false;
      if (!this.BaseResp.equals(that.BaseResp))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_user = true && (isSetUser());
    list.add(present_user);
    if (present_user)
      list.add(user);

    boolean present_BaseResp = true && (isSetBaseResp());
    list.add(present_BaseResp);
    if (present_BaseResp)
      list.add(BaseResp);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetUserByUsernameAndPasswordResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBaseResp()).compareTo(other.isSetBaseResp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBaseResp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.BaseResp, other.BaseResp);
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
    StringBuilder sb = new StringBuilder("GetUserByUsernameAndPasswordResponse(");
    boolean first = true;

    if (isSetUser()) {
      sb.append("user:");
      if (this.user == null) {
        sb.append("null");
      } else {
        sb.append(this.user);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("BaseResp:");
    if (this.BaseResp == null) {
      sb.append("null");
    } else {
      sb.append(this.BaseResp);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (BaseResp == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'BaseResp' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (user != null) {
      user.validate();
    }
    if (BaseResp != null) {
      BaseResp.validate();
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

  private static class GetUserByUsernameAndPasswordResponseStandardSchemeFactory implements SchemeFactory {
    public GetUserByUsernameAndPasswordResponseStandardScheme getScheme() {
      return new GetUserByUsernameAndPasswordResponseStandardScheme();
    }
  }

  private static class GetUserByUsernameAndPasswordResponseStandardScheme extends StandardScheme<GetUserByUsernameAndPasswordResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetUserByUsernameAndPasswordResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.user = new top.itcat.rpc.service.model.PackedUser();
              struct.user.read(iprot);
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 255: // BASE_RESP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.BaseResp = new top.itcat.rpc.base.BaseResp();
              struct.BaseResp.read(iprot);
              struct.setBaseRespIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetUserByUsernameAndPasswordResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user != null) {
        if (struct.isSetUser()) {
          oprot.writeFieldBegin(USER_FIELD_DESC);
          struct.user.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.BaseResp != null) {
        oprot.writeFieldBegin(BASE_RESP_FIELD_DESC);
        struct.BaseResp.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetUserByUsernameAndPasswordResponseTupleSchemeFactory implements SchemeFactory {
    public GetUserByUsernameAndPasswordResponseTupleScheme getScheme() {
      return new GetUserByUsernameAndPasswordResponseTupleScheme();
    }
  }

  private static class GetUserByUsernameAndPasswordResponseTupleScheme extends TupleScheme<GetUserByUsernameAndPasswordResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetUserByUsernameAndPasswordResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.BaseResp.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetUser()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetUser()) {
        struct.user.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetUserByUsernameAndPasswordResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.BaseResp = new top.itcat.rpc.base.BaseResp();
      struct.BaseResp.read(iprot);
      struct.setBaseRespIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.user = new top.itcat.rpc.service.model.PackedUser();
        struct.user.read(iprot);
        struct.setUserIsSet(true);
      }
    }
  }

}

