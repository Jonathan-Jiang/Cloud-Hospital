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
public class GetMedicalRecordRequest implements org.apache.thrift.TBase<GetMedicalRecordRequest, GetMedicalRecordRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetMedicalRecordRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetMedicalRecordRequest");

  private static final org.apache.thrift.protocol.TField IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("ids", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField MEDICAL_RECORD_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("medicalRecordNo", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField ID_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("idNum", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DOCTOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("doctorId", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I32, (short)100);
  private static final org.apache.thrift.protocol.TField LIMIT_FIELD_DESC = new org.apache.thrift.protocol.TField("limit", org.apache.thrift.protocol.TType.I32, (short)101);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetMedicalRecordRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetMedicalRecordRequestTupleSchemeFactory());
  }

  public List<Long> ids; // optional
  public long medicalRecordNo; // optional
  public String idNum; // optional
  public long doctorId; // optional
  public int offset; // optional
  public int limit; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IDS((short)1, "ids"),
    MEDICAL_RECORD_NO((short)2, "medicalRecordNo"),
    ID_NUM((short)3, "idNum"),
    DOCTOR_ID((short)4, "doctorId"),
    OFFSET((short)100, "offset"),
    LIMIT((short)101, "limit");

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
        case 1: // IDS
          return IDS;
        case 2: // MEDICAL_RECORD_NO
          return MEDICAL_RECORD_NO;
        case 3: // ID_NUM
          return ID_NUM;
        case 4: // DOCTOR_ID
          return DOCTOR_ID;
        case 100: // OFFSET
          return OFFSET;
        case 101: // LIMIT
          return LIMIT;
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
  private static final int __MEDICALRECORDNO_ISSET_ID = 0;
  private static final int __DOCTORID_ISSET_ID = 1;
  private static final int __OFFSET_ISSET_ID = 2;
  private static final int __LIMIT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IDS,_Fields.MEDICAL_RECORD_NO,_Fields.ID_NUM,_Fields.DOCTOR_ID,_Fields.OFFSET,_Fields.LIMIT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IDS, new org.apache.thrift.meta_data.FieldMetaData("ids", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.MEDICAL_RECORD_NO, new org.apache.thrift.meta_data.FieldMetaData("medicalRecordNo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ID_NUM, new org.apache.thrift.meta_data.FieldMetaData("idNum", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DOCTOR_ID, new org.apache.thrift.meta_data.FieldMetaData("doctorId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.OFFSET, new org.apache.thrift.meta_data.FieldMetaData("offset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LIMIT, new org.apache.thrift.meta_data.FieldMetaData("limit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetMedicalRecordRequest.class, metaDataMap);
  }

  public GetMedicalRecordRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetMedicalRecordRequest(GetMedicalRecordRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetIds()) {
      List<Long> __this__ids = new ArrayList<Long>(other.ids);
      this.ids = __this__ids;
    }
    this.medicalRecordNo = other.medicalRecordNo;
    if (other.isSetIdNum()) {
      this.idNum = other.idNum;
    }
    this.doctorId = other.doctorId;
    this.offset = other.offset;
    this.limit = other.limit;
  }

  public GetMedicalRecordRequest deepCopy() {
    return new GetMedicalRecordRequest(this);
  }

  @Override
  public void clear() {
    this.ids = null;
    setMedicalRecordNoIsSet(false);
    this.medicalRecordNo = 0;
    this.idNum = null;
    setDoctorIdIsSet(false);
    this.doctorId = 0;
    setOffsetIsSet(false);
    this.offset = 0;
    setLimitIsSet(false);
    this.limit = 0;
  }

  public int getIdsSize() {
    return (this.ids == null) ? 0 : this.ids.size();
  }

  public java.util.Iterator<Long> getIdsIterator() {
    return (this.ids == null) ? null : this.ids.iterator();
  }

  public void addToIds(long elem) {
    if (this.ids == null) {
      this.ids = new ArrayList<Long>();
    }
    this.ids.add(elem);
  }

  public List<Long> getIds() {
    return this.ids;
  }

  public GetMedicalRecordRequest setIds(List<Long> ids) {
    this.ids = ids;
    return this;
  }

  public void unsetIds() {
    this.ids = null;
  }

  /** Returns true if field ids is set (has been assigned a value) and false otherwise */
  public boolean isSetIds() {
    return this.ids != null;
  }

  public void setIdsIsSet(boolean value) {
    if (!value) {
      this.ids = null;
    }
  }

  public long getMedicalRecordNo() {
    return this.medicalRecordNo;
  }

  public GetMedicalRecordRequest setMedicalRecordNo(long medicalRecordNo) {
    this.medicalRecordNo = medicalRecordNo;
    setMedicalRecordNoIsSet(true);
    return this;
  }

  public void unsetMedicalRecordNo() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MEDICALRECORDNO_ISSET_ID);
  }

  /** Returns true if field medicalRecordNo is set (has been assigned a value) and false otherwise */
  public boolean isSetMedicalRecordNo() {
    return EncodingUtils.testBit(__isset_bitfield, __MEDICALRECORDNO_ISSET_ID);
  }

  public void setMedicalRecordNoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MEDICALRECORDNO_ISSET_ID, value);
  }

  public String getIdNum() {
    return this.idNum;
  }

  public GetMedicalRecordRequest setIdNum(String idNum) {
    this.idNum = idNum;
    return this;
  }

  public void unsetIdNum() {
    this.idNum = null;
  }

  /** Returns true if field idNum is set (has been assigned a value) and false otherwise */
  public boolean isSetIdNum() {
    return this.idNum != null;
  }

  public void setIdNumIsSet(boolean value) {
    if (!value) {
      this.idNum = null;
    }
  }

  public long getDoctorId() {
    return this.doctorId;
  }

  public GetMedicalRecordRequest setDoctorId(long doctorId) {
    this.doctorId = doctorId;
    setDoctorIdIsSet(true);
    return this;
  }

  public void unsetDoctorId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DOCTORID_ISSET_ID);
  }

  /** Returns true if field doctorId is set (has been assigned a value) and false otherwise */
  public boolean isSetDoctorId() {
    return EncodingUtils.testBit(__isset_bitfield, __DOCTORID_ISSET_ID);
  }

  public void setDoctorIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DOCTORID_ISSET_ID, value);
  }

  public int getOffset() {
    return this.offset;
  }

  public GetMedicalRecordRequest setOffset(int offset) {
    this.offset = offset;
    setOffsetIsSet(true);
    return this;
  }

  public void unsetOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  /** Returns true if field offset is set (has been assigned a value) and false otherwise */
  public boolean isSetOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  public void setOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OFFSET_ISSET_ID, value);
  }

  public int getLimit() {
    return this.limit;
  }

  public GetMedicalRecordRequest setLimit(int limit) {
    this.limit = limit;
    setLimitIsSet(true);
    return this;
  }

  public void unsetLimit() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  /** Returns true if field limit is set (has been assigned a value) and false otherwise */
  public boolean isSetLimit() {
    return EncodingUtils.testBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  public void setLimitIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LIMIT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IDS:
      if (value == null) {
        unsetIds();
      } else {
        setIds((List<Long>)value);
      }
      break;

    case MEDICAL_RECORD_NO:
      if (value == null) {
        unsetMedicalRecordNo();
      } else {
        setMedicalRecordNo((Long)value);
      }
      break;

    case ID_NUM:
      if (value == null) {
        unsetIdNum();
      } else {
        setIdNum((String)value);
      }
      break;

    case DOCTOR_ID:
      if (value == null) {
        unsetDoctorId();
      } else {
        setDoctorId((Long)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((Integer)value);
      }
      break;

    case LIMIT:
      if (value == null) {
        unsetLimit();
      } else {
        setLimit((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IDS:
      return getIds();

    case MEDICAL_RECORD_NO:
      return Long.valueOf(getMedicalRecordNo());

    case ID_NUM:
      return getIdNum();

    case DOCTOR_ID:
      return Long.valueOf(getDoctorId());

    case OFFSET:
      return Integer.valueOf(getOffset());

    case LIMIT:
      return Integer.valueOf(getLimit());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IDS:
      return isSetIds();
    case MEDICAL_RECORD_NO:
      return isSetMedicalRecordNo();
    case ID_NUM:
      return isSetIdNum();
    case DOCTOR_ID:
      return isSetDoctorId();
    case OFFSET:
      return isSetOffset();
    case LIMIT:
      return isSetLimit();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetMedicalRecordRequest)
      return this.equals((GetMedicalRecordRequest)that);
    return false;
  }

  public boolean equals(GetMedicalRecordRequest that) {
    if (that == null)
      return false;

    boolean this_present_ids = true && this.isSetIds();
    boolean that_present_ids = true && that.isSetIds();
    if (this_present_ids || that_present_ids) {
      if (!(this_present_ids && that_present_ids))
        return false;
      if (!this.ids.equals(that.ids))
        return false;
    }

    boolean this_present_medicalRecordNo = true && this.isSetMedicalRecordNo();
    boolean that_present_medicalRecordNo = true && that.isSetMedicalRecordNo();
    if (this_present_medicalRecordNo || that_present_medicalRecordNo) {
      if (!(this_present_medicalRecordNo && that_present_medicalRecordNo))
        return false;
      if (this.medicalRecordNo != that.medicalRecordNo)
        return false;
    }

    boolean this_present_idNum = true && this.isSetIdNum();
    boolean that_present_idNum = true && that.isSetIdNum();
    if (this_present_idNum || that_present_idNum) {
      if (!(this_present_idNum && that_present_idNum))
        return false;
      if (!this.idNum.equals(that.idNum))
        return false;
    }

    boolean this_present_doctorId = true && this.isSetDoctorId();
    boolean that_present_doctorId = true && that.isSetDoctorId();
    if (this_present_doctorId || that_present_doctorId) {
      if (!(this_present_doctorId && that_present_doctorId))
        return false;
      if (this.doctorId != that.doctorId)
        return false;
    }

    boolean this_present_offset = true && this.isSetOffset();
    boolean that_present_offset = true && that.isSetOffset();
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
        return false;
    }

    boolean this_present_limit = true && this.isSetLimit();
    boolean that_present_limit = true && that.isSetLimit();
    if (this_present_limit || that_present_limit) {
      if (!(this_present_limit && that_present_limit))
        return false;
      if (this.limit != that.limit)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_ids = true && (isSetIds());
    list.add(present_ids);
    if (present_ids)
      list.add(ids);

    boolean present_medicalRecordNo = true && (isSetMedicalRecordNo());
    list.add(present_medicalRecordNo);
    if (present_medicalRecordNo)
      list.add(medicalRecordNo);

    boolean present_idNum = true && (isSetIdNum());
    list.add(present_idNum);
    if (present_idNum)
      list.add(idNum);

    boolean present_doctorId = true && (isSetDoctorId());
    list.add(present_doctorId);
    if (present_doctorId)
      list.add(doctorId);

    boolean present_offset = true && (isSetOffset());
    list.add(present_offset);
    if (present_offset)
      list.add(offset);

    boolean present_limit = true && (isSetLimit());
    list.add(present_limit);
    if (present_limit)
      list.add(limit);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetMedicalRecordRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIds()).compareTo(other.isSetIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ids, other.ids);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMedicalRecordNo()).compareTo(other.isSetMedicalRecordNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMedicalRecordNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.medicalRecordNo, other.medicalRecordNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIdNum()).compareTo(other.isSetIdNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idNum, other.idNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDoctorId()).compareTo(other.isSetDoctorId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDoctorId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.doctorId, other.doctorId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOffset()).compareTo(other.isSetOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.offset, other.offset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLimit()).compareTo(other.isSetLimit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLimit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.limit, other.limit);
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
    StringBuilder sb = new StringBuilder("GetMedicalRecordRequest(");
    boolean first = true;

    if (isSetIds()) {
      sb.append("ids:");
      if (this.ids == null) {
        sb.append("null");
      } else {
        sb.append(this.ids);
      }
      first = false;
    }
    if (isSetMedicalRecordNo()) {
      if (!first) sb.append(", ");
      sb.append("medicalRecordNo:");
      sb.append(this.medicalRecordNo);
      first = false;
    }
    if (isSetIdNum()) {
      if (!first) sb.append(", ");
      sb.append("idNum:");
      if (this.idNum == null) {
        sb.append("null");
      } else {
        sb.append(this.idNum);
      }
      first = false;
    }
    if (isSetDoctorId()) {
      if (!first) sb.append(", ");
      sb.append("doctorId:");
      sb.append(this.doctorId);
      first = false;
    }
    if (isSetOffset()) {
      if (!first) sb.append(", ");
      sb.append("offset:");
      sb.append(this.offset);
      first = false;
    }
    if (isSetLimit()) {
      if (!first) sb.append(", ");
      sb.append("limit:");
      sb.append(this.limit);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetMedicalRecordRequestStandardSchemeFactory implements SchemeFactory {
    public GetMedicalRecordRequestStandardScheme getScheme() {
      return new GetMedicalRecordRequestStandardScheme();
    }
  }

  private static class GetMedicalRecordRequestStandardScheme extends StandardScheme<GetMedicalRecordRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetMedicalRecordRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list136 = iprot.readListBegin();
                struct.ids = new ArrayList<Long>(_list136.size);
                long _elem137;
                for (int _i138 = 0; _i138 < _list136.size; ++_i138)
                {
                  _elem137 = iprot.readI64();
                  struct.ids.add(_elem137);
                }
                iprot.readListEnd();
              }
              struct.setIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MEDICAL_RECORD_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.medicalRecordNo = iprot.readI64();
              struct.setMedicalRecordNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ID_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.idNum = iprot.readString();
              struct.setIdNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DOCTOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.doctorId = iprot.readI64();
              struct.setDoctorIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 100: // OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.offset = iprot.readI32();
              struct.setOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 101: // LIMIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.limit = iprot.readI32();
              struct.setLimitIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetMedicalRecordRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ids != null) {
        if (struct.isSetIds()) {
          oprot.writeFieldBegin(IDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.ids.size()));
            for (long _iter139 : struct.ids)
            {
              oprot.writeI64(_iter139);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMedicalRecordNo()) {
        oprot.writeFieldBegin(MEDICAL_RECORD_NO_FIELD_DESC);
        oprot.writeI64(struct.medicalRecordNo);
        oprot.writeFieldEnd();
      }
      if (struct.idNum != null) {
        if (struct.isSetIdNum()) {
          oprot.writeFieldBegin(ID_NUM_FIELD_DESC);
          oprot.writeString(struct.idNum);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDoctorId()) {
        oprot.writeFieldBegin(DOCTOR_ID_FIELD_DESC);
        oprot.writeI64(struct.doctorId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetOffset()) {
        oprot.writeFieldBegin(OFFSET_FIELD_DESC);
        oprot.writeI32(struct.offset);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLimit()) {
        oprot.writeFieldBegin(LIMIT_FIELD_DESC);
        oprot.writeI32(struct.limit);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetMedicalRecordRequestTupleSchemeFactory implements SchemeFactory {
    public GetMedicalRecordRequestTupleScheme getScheme() {
      return new GetMedicalRecordRequestTupleScheme();
    }
  }

  private static class GetMedicalRecordRequestTupleScheme extends TupleScheme<GetMedicalRecordRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetMedicalRecordRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIds()) {
        optionals.set(0);
      }
      if (struct.isSetMedicalRecordNo()) {
        optionals.set(1);
      }
      if (struct.isSetIdNum()) {
        optionals.set(2);
      }
      if (struct.isSetDoctorId()) {
        optionals.set(3);
      }
      if (struct.isSetOffset()) {
        optionals.set(4);
      }
      if (struct.isSetLimit()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetIds()) {
        {
          oprot.writeI32(struct.ids.size());
          for (long _iter140 : struct.ids)
          {
            oprot.writeI64(_iter140);
          }
        }
      }
      if (struct.isSetMedicalRecordNo()) {
        oprot.writeI64(struct.medicalRecordNo);
      }
      if (struct.isSetIdNum()) {
        oprot.writeString(struct.idNum);
      }
      if (struct.isSetDoctorId()) {
        oprot.writeI64(struct.doctorId);
      }
      if (struct.isSetOffset()) {
        oprot.writeI32(struct.offset);
      }
      if (struct.isSetLimit()) {
        oprot.writeI32(struct.limit);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetMedicalRecordRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list141 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.ids = new ArrayList<Long>(_list141.size);
          long _elem142;
          for (int _i143 = 0; _i143 < _list141.size; ++_i143)
          {
            _elem142 = iprot.readI64();
            struct.ids.add(_elem142);
          }
        }
        struct.setIdsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.medicalRecordNo = iprot.readI64();
        struct.setMedicalRecordNoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.idNum = iprot.readString();
        struct.setIdNumIsSet(true);
      }
      if (incoming.get(3)) {
        struct.doctorId = iprot.readI64();
        struct.setDoctorIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.offset = iprot.readI32();
        struct.setOffsetIsSet(true);
      }
      if (incoming.get(5)) {
        struct.limit = iprot.readI32();
        struct.setLimitIsSet(true);
      }
    }
  }

}

