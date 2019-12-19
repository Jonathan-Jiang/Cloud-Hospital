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
public class AddOrUpdateAccountClerkRequest implements org.apache.thrift.TBase<AddOrUpdateAccountClerkRequest, AddOrUpdateAccountClerkRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AddOrUpdateAccountClerkRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddOrUpdateAccountClerkRequest");

  private static final org.apache.thrift.protocol.TField USERS_FIELD_DESC = new org.apache.thrift.protocol.TField("users", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AddOrUpdateAccountClerkRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AddOrUpdateAccountClerkRequestTupleSchemeFactory());
  }

  public List<top.itcat.rpc.service.model.AccountClerk> users; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USERS((short)1, "users");

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
    tmpMap.put(_Fields.USERS, new org.apache.thrift.meta_data.FieldMetaData("users", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, top.itcat.rpc.service.model.AccountClerk.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddOrUpdateAccountClerkRequest.class, metaDataMap);
  }

  public AddOrUpdateAccountClerkRequest() {
  }

  public AddOrUpdateAccountClerkRequest(
    List<top.itcat.rpc.service.model.AccountClerk> users)
  {
    this();
    this.users = users;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddOrUpdateAccountClerkRequest(AddOrUpdateAccountClerkRequest other) {
    if (other.isSetUsers()) {
      List<top.itcat.rpc.service.model.AccountClerk> __this__users = new ArrayList<top.itcat.rpc.service.model.AccountClerk>(other.users.size());
      for (top.itcat.rpc.service.model.AccountClerk other_element : other.users) {
        __this__users.add(new top.itcat.rpc.service.model.AccountClerk(other_element));
      }
      this.users = __this__users;
    }
  }

  public AddOrUpdateAccountClerkRequest deepCopy() {
    return new AddOrUpdateAccountClerkRequest(this);
  }

  @Override
  public void clear() {
    this.users = null;
  }

  public int getUsersSize() {
    return (this.users == null) ? 0 : this.users.size();
  }

  public java.util.Iterator<top.itcat.rpc.service.model.AccountClerk> getUsersIterator() {
    return (this.users == null) ? null : this.users.iterator();
  }

  public void addToUsers(top.itcat.rpc.service.model.AccountClerk elem) {
    if (this.users == null) {
      this.users = new ArrayList<top.itcat.rpc.service.model.AccountClerk>();
    }
    this.users.add(elem);
  }

  public List<top.itcat.rpc.service.model.AccountClerk> getUsers() {
    return this.users;
  }

  public AddOrUpdateAccountClerkRequest setUsers(List<top.itcat.rpc.service.model.AccountClerk> users) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USERS:
      if (value == null) {
        unsetUsers();
      } else {
        setUsers((List<top.itcat.rpc.service.model.AccountClerk>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USERS:
      return getUsers();

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
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AddOrUpdateAccountClerkRequest)
      return this.equals((AddOrUpdateAccountClerkRequest)that);
    return false;
  }

  public boolean equals(AddOrUpdateAccountClerkRequest that) {
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

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_users = true && (isSetUsers());
    list.add(present_users);
    if (present_users)
      list.add(users);

    return list.hashCode();
  }

  @Override
  public int compareTo(AddOrUpdateAccountClerkRequest other) {
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
    StringBuilder sb = new StringBuilder("AddOrUpdateAccountClerkRequest(");
    boolean first = true;

    sb.append("users:");
    if (this.users == null) {
      sb.append("null");
    } else {
      sb.append(this.users);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (users == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'users' was not present! Struct: " + toString());
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

  private static class AddOrUpdateAccountClerkRequestStandardSchemeFactory implements SchemeFactory {
    public AddOrUpdateAccountClerkRequestStandardScheme getScheme() {
      return new AddOrUpdateAccountClerkRequestStandardScheme();
    }
  }

  private static class AddOrUpdateAccountClerkRequestStandardScheme extends StandardScheme<AddOrUpdateAccountClerkRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AddOrUpdateAccountClerkRequest struct) throws org.apache.thrift.TException {
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
                org.apache.thrift.protocol.TList _list80 = iprot.readListBegin();
                struct.users = new ArrayList<top.itcat.rpc.service.model.AccountClerk>(_list80.size);
                top.itcat.rpc.service.model.AccountClerk _elem81;
                for (int _i82 = 0; _i82 < _list80.size; ++_i82)
                {
                  _elem81 = new top.itcat.rpc.service.model.AccountClerk();
                  _elem81.read(iprot);
                  struct.users.add(_elem81);
                }
                iprot.readListEnd();
              }
              struct.setUsersIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AddOrUpdateAccountClerkRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.users != null) {
        oprot.writeFieldBegin(USERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.users.size()));
          for (top.itcat.rpc.service.model.AccountClerk _iter83 : struct.users)
          {
            _iter83.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddOrUpdateAccountClerkRequestTupleSchemeFactory implements SchemeFactory {
    public AddOrUpdateAccountClerkRequestTupleScheme getScheme() {
      return new AddOrUpdateAccountClerkRequestTupleScheme();
    }
  }

  private static class AddOrUpdateAccountClerkRequestTupleScheme extends TupleScheme<AddOrUpdateAccountClerkRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddOrUpdateAccountClerkRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.users.size());
        for (top.itcat.rpc.service.model.AccountClerk _iter84 : struct.users)
        {
          _iter84.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddOrUpdateAccountClerkRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list85 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.users = new ArrayList<top.itcat.rpc.service.model.AccountClerk>(_list85.size);
        top.itcat.rpc.service.model.AccountClerk _elem86;
        for (int _i87 = 0; _i87 < _list85.size; ++_i87)
        {
          _elem86 = new top.itcat.rpc.service.model.AccountClerk();
          _elem86.read(iprot);
          struct.users.add(_elem86);
        }
      }
      struct.setUsersIsSet(true);
    }
  }

}

