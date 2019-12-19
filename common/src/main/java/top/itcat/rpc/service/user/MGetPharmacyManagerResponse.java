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
public class MGetPharmacyManagerResponse implements org.apache.thrift.TBase<MGetPharmacyManagerResponse, MGetPharmacyManagerResponse._Fields>, java.io.Serializable, Cloneable, Comparable<MGetPharmacyManagerResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MGetPharmacyManagerResponse");

  private static final org.apache.thrift.protocol.TField USERS_FIELD_DESC = new org.apache.thrift.protocol.TField("users", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TOTAL_FIELD_DESC = new org.apache.thrift.protocol.TField("total", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField BASE_RESP_FIELD_DESC = new org.apache.thrift.protocol.TField("BaseResp", org.apache.thrift.protocol.TType.STRUCT, (short)255);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MGetPharmacyManagerResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MGetPharmacyManagerResponseTupleSchemeFactory());
  }

  public List<top.itcat.rpc.service.model.PharmacyManager> users; // optional
  public int total; // optional
  public top.itcat.rpc.base.BaseResp BaseResp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USERS((short)1, "users"),
    TOTAL((short)2, "total"),
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
        case 1: // USERS
          return USERS;
        case 2: // TOTAL
          return TOTAL;
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
  private static final int __TOTAL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.USERS,_Fields.TOTAL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USERS, new org.apache.thrift.meta_data.FieldMetaData("users", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, top.itcat.rpc.service.model.PharmacyManager.class))));
    tmpMap.put(_Fields.TOTAL, new org.apache.thrift.meta_data.FieldMetaData("total", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BASE_RESP, new org.apache.thrift.meta_data.FieldMetaData("BaseResp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, top.itcat.rpc.base.BaseResp.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MGetPharmacyManagerResponse.class, metaDataMap);
  }

  public MGetPharmacyManagerResponse() {
  }

  public MGetPharmacyManagerResponse(
    top.itcat.rpc.base.BaseResp BaseResp)
  {
    this();
    this.BaseResp = BaseResp;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MGetPharmacyManagerResponse(MGetPharmacyManagerResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUsers()) {
      List<top.itcat.rpc.service.model.PharmacyManager> __this__users = new ArrayList<top.itcat.rpc.service.model.PharmacyManager>(other.users.size());
      for (top.itcat.rpc.service.model.PharmacyManager other_element : other.users) {
        __this__users.add(new top.itcat.rpc.service.model.PharmacyManager(other_element));
      }
      this.users = __this__users;
    }
    this.total = other.total;
    if (other.isSetBaseResp()) {
      this.BaseResp = new top.itcat.rpc.base.BaseResp(other.BaseResp);
    }
  }

  public MGetPharmacyManagerResponse deepCopy() {
    return new MGetPharmacyManagerResponse(this);
  }

  @Override
  public void clear() {
    this.users = null;
    setTotalIsSet(false);
    this.total = 0;
    this.BaseResp = null;
  }

  public int getUsersSize() {
    return (this.users == null) ? 0 : this.users.size();
  }

  public java.util.Iterator<top.itcat.rpc.service.model.PharmacyManager> getUsersIterator() {
    return (this.users == null) ? null : this.users.iterator();
  }

  public void addToUsers(top.itcat.rpc.service.model.PharmacyManager elem) {
    if (this.users == null) {
      this.users = new ArrayList<top.itcat.rpc.service.model.PharmacyManager>();
    }
    this.users.add(elem);
  }

  public List<top.itcat.rpc.service.model.PharmacyManager> getUsers() {
    return this.users;
  }

  public MGetPharmacyManagerResponse setUsers(List<top.itcat.rpc.service.model.PharmacyManager> users) {
    this.users = users;
    return this;
  }

  public void unsetUsers() {
    this.users = null;
  }

  /** Returns true if field users is set (has been assigned a value) and false otherwise */
  public boolean isSetUsers() {
    return this.users != null;
  }

  public void setUsersIsSet(boolean value) {
    if (!value) {
      this.users = null;
    }
  }

  public int getTotal() {
    return this.total;
  }

  public MGetPharmacyManagerResponse setTotal(int total) {
    this.total = total;
    setTotalIsSet(true);
    return this;
  }

  public void unsetTotal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTAL_ISSET_ID);
  }

  /** Returns true if field total is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTAL_ISSET_ID);
  }

  public void setTotalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTAL_ISSET_ID, value);
  }

  public top.itcat.rpc.base.BaseResp getBaseResp() {
    return this.BaseResp;
  }

  public MGetPharmacyManagerResponse setBaseResp(top.itcat.rpc.base.BaseResp BaseResp) {
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
    case USERS:
      if (value == null) {
        unsetUsers();
      } else {
        setUsers((List<top.itcat.rpc.service.model.PharmacyManager>)value);
      }
      break;

    case TOTAL:
      if (value == null) {
        unsetTotal();
      } else {
        setTotal((Integer)value);
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
    case USERS:
      return getUsers();

    case TOTAL:
      return Integer.valueOf(getTotal());

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
    case USERS:
      return isSetUsers();
    case TOTAL:
      return isSetTotal();
    case BASE_RESP:
      return isSetBaseResp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MGetPharmacyManagerResponse)
      return this.equals((MGetPharmacyManagerResponse)that);
    return false;
  }

  public boolean equals(MGetPharmacyManagerResponse that) {
    if (that == null)
      return false;

    boolean this_present_users = true && this.isSetUsers();
    boolean that_present_users = true && that.isSetUsers();
    if (this_present_users || that_present_users) {
      if (!(this_present_users && that_present_users))
        return false;
      if (!this.users.equals(that.users))
        return false;
    }

    boolean this_present_total = true && this.isSetTotal();
    boolean that_present_total = true && that.isSetTotal();
    if (this_present_total || that_present_total) {
      if (!(this_present_total && that_present_total))
        return false;
      if (this.total != that.total)
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

    boolean present_users = true && (isSetUsers());
    list.add(present_users);
    if (present_users)
      list.add(users);

    boolean present_total = true && (isSetTotal());
    list.add(present_total);
    if (present_total)
      list.add(total);

    boolean present_BaseResp = true && (isSetBaseResp());
    list.add(present_BaseResp);
    if (present_BaseResp)
      list.add(BaseResp);

    return list.hashCode();
  }

  @Override
  public int compareTo(MGetPharmacyManagerResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUsers()).compareTo(other.isSetUsers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.users, other.users);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotal()).compareTo(other.isSetTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total, other.total);
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
    StringBuilder sb = new StringBuilder("MGetPharmacyManagerResponse(");
    boolean first = true;

    if (isSetUsers()) {
      sb.append("users:");
      if (this.users == null) {
        sb.append("null");
      } else {
        sb.append(this.users);
      }
      first = false;
    }
    if (isSetTotal()) {
      if (!first) sb.append(", ");
      sb.append("total:");
      sb.append(this.total);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MGetPharmacyManagerResponseStandardSchemeFactory implements SchemeFactory {
    public MGetPharmacyManagerResponseStandardScheme getScheme() {
      return new MGetPharmacyManagerResponseStandardScheme();
    }
  }

  private static class MGetPharmacyManagerResponseStandardScheme extends StandardScheme<MGetPharmacyManagerResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MGetPharmacyManagerResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list136 = iprot.readListBegin();
                struct.users = new ArrayList<top.itcat.rpc.service.model.PharmacyManager>(_list136.size);
                top.itcat.rpc.service.model.PharmacyManager _elem137;
                for (int _i138 = 0; _i138 < _list136.size; ++_i138)
                {
                  _elem137 = new top.itcat.rpc.service.model.PharmacyManager();
                  _elem137.read(iprot);
                  struct.users.add(_elem137);
                }
                iprot.readListEnd();
              }
              struct.setUsersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOTAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total = iprot.readI32();
              struct.setTotalIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MGetPharmacyManagerResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.users != null) {
        if (struct.isSetUsers()) {
          oprot.writeFieldBegin(USERS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.users.size()));
            for (top.itcat.rpc.service.model.PharmacyManager _iter139 : struct.users)
            {
              _iter139.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTotal()) {
        oprot.writeFieldBegin(TOTAL_FIELD_DESC);
        oprot.writeI32(struct.total);
        oprot.writeFieldEnd();
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

  private static class MGetPharmacyManagerResponseTupleSchemeFactory implements SchemeFactory {
    public MGetPharmacyManagerResponseTupleScheme getScheme() {
      return new MGetPharmacyManagerResponseTupleScheme();
    }
  }

  private static class MGetPharmacyManagerResponseTupleScheme extends TupleScheme<MGetPharmacyManagerResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MGetPharmacyManagerResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.BaseResp.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetUsers()) {
        optionals.set(0);
      }
      if (struct.isSetTotal()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUsers()) {
        {
          oprot.writeI32(struct.users.size());
          for (top.itcat.rpc.service.model.PharmacyManager _iter140 : struct.users)
          {
            _iter140.write(oprot);
          }
        }
      }
      if (struct.isSetTotal()) {
        oprot.writeI32(struct.total);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MGetPharmacyManagerResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.BaseResp = new top.itcat.rpc.base.BaseResp();
      struct.BaseResp.read(iprot);
      struct.setBaseRespIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list141 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.users = new ArrayList<top.itcat.rpc.service.model.PharmacyManager>(_list141.size);
          top.itcat.rpc.service.model.PharmacyManager _elem142;
          for (int _i143 = 0; _i143 < _list141.size; ++_i143)
          {
            _elem142 = new top.itcat.rpc.service.model.PharmacyManager();
            _elem142.read(iprot);
            struct.users.add(_elem142);
          }
        }
        struct.setUsersIsSet(true);
      }
      if (incoming.get(1)) {
        struct.total = iprot.readI32();
        struct.setTotalIsSet(true);
      }
    }
  }

}

