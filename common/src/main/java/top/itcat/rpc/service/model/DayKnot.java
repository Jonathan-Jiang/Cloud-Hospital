/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package top.itcat.rpc.service.model;

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
public class DayKnot implements org.apache.thrift.TBase<DayKnot, DayKnot._Fields>, java.io.Serializable, Cloneable, Comparable<DayKnot> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DayKnot");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("startTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField END_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("endTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField CHARGE_AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("chargeAmount", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField CHECK_THROUGH_FIELD_DESC = new org.apache.thrift.protocol.TField("checkThrough", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField OPERATOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("operatorId", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField VALID_FIELD_DESC = new org.apache.thrift.protocol.TField("valid", org.apache.thrift.protocol.TType.I32, (short)255);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DayKnotStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DayKnotTupleSchemeFactory());
  }

  public long id; // optional
  public long startTime; // optional
  public long endTime; // optional
  public double chargeAmount; // optional
  public int checkThrough; // optional
  public long operatorId; // optional
  public int valid; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    START_TIME((short)2, "startTime"),
    END_TIME((short)3, "endTime"),
    CHARGE_AMOUNT((short)4, "chargeAmount"),
    CHECK_THROUGH((short)5, "checkThrough"),
    OPERATOR_ID((short)6, "operatorId"),
    VALID((short)255, "valid");

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
        case 1: // ID
          return ID;
        case 2: // START_TIME
          return START_TIME;
        case 3: // END_TIME
          return END_TIME;
        case 4: // CHARGE_AMOUNT
          return CHARGE_AMOUNT;
        case 5: // CHECK_THROUGH
          return CHECK_THROUGH;
        case 6: // OPERATOR_ID
          return OPERATOR_ID;
        case 255: // VALID
          return VALID;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __STARTTIME_ISSET_ID = 1;
  private static final int __ENDTIME_ISSET_ID = 2;
  private static final int __CHARGEAMOUNT_ISSET_ID = 3;
  private static final int __CHECKTHROUGH_ISSET_ID = 4;
  private static final int __OPERATORID_ISSET_ID = 5;
  private static final int __VALID_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.START_TIME,_Fields.END_TIME,_Fields.CHARGE_AMOUNT,_Fields.CHECK_THROUGH,_Fields.OPERATOR_ID,_Fields.VALID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("startTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.END_TIME, new org.apache.thrift.meta_data.FieldMetaData("endTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CHARGE_AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("chargeAmount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.CHECK_THROUGH, new org.apache.thrift.meta_data.FieldMetaData("checkThrough", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OPERATOR_ID, new org.apache.thrift.meta_data.FieldMetaData("operatorId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VALID, new org.apache.thrift.meta_data.FieldMetaData("valid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DayKnot.class, metaDataMap);
  }

  public DayKnot() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DayKnot(DayKnot other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.startTime = other.startTime;
    this.endTime = other.endTime;
    this.chargeAmount = other.chargeAmount;
    this.checkThrough = other.checkThrough;
    this.operatorId = other.operatorId;
    this.valid = other.valid;
  }

  public DayKnot deepCopy() {
    return new DayKnot(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setStartTimeIsSet(false);
    this.startTime = 0;
    setEndTimeIsSet(false);
    this.endTime = 0;
    setChargeAmountIsSet(false);
    this.chargeAmount = 0.0;
    setCheckThroughIsSet(false);
    this.checkThrough = 0;
    setOperatorIdIsSet(false);
    this.operatorId = 0;
    setValidIsSet(false);
    this.valid = 0;
  }

  public long getId() {
    return this.id;
  }

  public DayKnot setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public long getStartTime() {
    return this.startTime;
  }

  public DayKnot setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
    return this;
  }

  public void unsetStartTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTTIME_ISSET_ID, value);
  }

  public long getEndTime() {
    return this.endTime;
  }

  public DayKnot setEndTime(long endTime) {
    this.endTime = endTime;
    setEndTimeIsSet(true);
    return this;
  }

  public void unsetEndTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  /** Returns true if field endTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEndTime() {
    return EncodingUtils.testBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  public void setEndTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENDTIME_ISSET_ID, value);
  }

  public double getChargeAmount() {
    return this.chargeAmount;
  }

  public DayKnot setChargeAmount(double chargeAmount) {
    this.chargeAmount = chargeAmount;
    setChargeAmountIsSet(true);
    return this;
  }

  public void unsetChargeAmount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHARGEAMOUNT_ISSET_ID);
  }

  /** Returns true if field chargeAmount is set (has been assigned a value) and false otherwise */
  public boolean isSetChargeAmount() {
    return EncodingUtils.testBit(__isset_bitfield, __CHARGEAMOUNT_ISSET_ID);
  }

  public void setChargeAmountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHARGEAMOUNT_ISSET_ID, value);
  }

  public int getCheckThrough() {
    return this.checkThrough;
  }

  public DayKnot setCheckThrough(int checkThrough) {
    this.checkThrough = checkThrough;
    setCheckThroughIsSet(true);
    return this;
  }

  public void unsetCheckThrough() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHECKTHROUGH_ISSET_ID);
  }

  /** Returns true if field checkThrough is set (has been assigned a value) and false otherwise */
  public boolean isSetCheckThrough() {
    return EncodingUtils.testBit(__isset_bitfield, __CHECKTHROUGH_ISSET_ID);
  }

  public void setCheckThroughIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHECKTHROUGH_ISSET_ID, value);
  }

  public long getOperatorId() {
    return this.operatorId;
  }

  public DayKnot setOperatorId(long operatorId) {
    this.operatorId = operatorId;
    setOperatorIdIsSet(true);
    return this;
  }

  public void unsetOperatorId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPERATORID_ISSET_ID);
  }

  /** Returns true if field operatorId is set (has been assigned a value) and false otherwise */
  public boolean isSetOperatorId() {
    return EncodingUtils.testBit(__isset_bitfield, __OPERATORID_ISSET_ID);
  }

  public void setOperatorIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPERATORID_ISSET_ID, value);
  }

  public int getValid() {
    return this.valid;
  }

  public DayKnot setValid(int valid) {
    this.valid = valid;
    setValidIsSet(true);
    return this;
  }

  public void unsetValid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VALID_ISSET_ID);
  }

  /** Returns true if field valid is set (has been assigned a value) and false otherwise */
  public boolean isSetValid() {
    return EncodingUtils.testBit(__isset_bitfield, __VALID_ISSET_ID);
  }

  public void setValidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VALID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((Long)value);
      }
      break;

    case END_TIME:
      if (value == null) {
        unsetEndTime();
      } else {
        setEndTime((Long)value);
      }
      break;

    case CHARGE_AMOUNT:
      if (value == null) {
        unsetChargeAmount();
      } else {
        setChargeAmount((Double)value);
      }
      break;

    case CHECK_THROUGH:
      if (value == null) {
        unsetCheckThrough();
      } else {
        setCheckThrough((Integer)value);
      }
      break;

    case OPERATOR_ID:
      if (value == null) {
        unsetOperatorId();
      } else {
        setOperatorId((Long)value);
      }
      break;

    case VALID:
      if (value == null) {
        unsetValid();
      } else {
        setValid((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Long.valueOf(getId());

    case START_TIME:
      return Long.valueOf(getStartTime());

    case END_TIME:
      return Long.valueOf(getEndTime());

    case CHARGE_AMOUNT:
      return Double.valueOf(getChargeAmount());

    case CHECK_THROUGH:
      return Integer.valueOf(getCheckThrough());

    case OPERATOR_ID:
      return Long.valueOf(getOperatorId());

    case VALID:
      return Integer.valueOf(getValid());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case START_TIME:
      return isSetStartTime();
    case END_TIME:
      return isSetEndTime();
    case CHARGE_AMOUNT:
      return isSetChargeAmount();
    case CHECK_THROUGH:
      return isSetCheckThrough();
    case OPERATOR_ID:
      return isSetOperatorId();
    case VALID:
      return isSetValid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DayKnot)
      return this.equals((DayKnot)that);
    return false;
  }

  public boolean equals(DayKnot that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_startTime = true && this.isSetStartTime();
    boolean that_present_startTime = true && that.isSetStartTime();
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_endTime = true && this.isSetEndTime();
    boolean that_present_endTime = true && that.isSetEndTime();
    if (this_present_endTime || that_present_endTime) {
      if (!(this_present_endTime && that_present_endTime))
        return false;
      if (this.endTime != that.endTime)
        return false;
    }

    boolean this_present_chargeAmount = true && this.isSetChargeAmount();
    boolean that_present_chargeAmount = true && that.isSetChargeAmount();
    if (this_present_chargeAmount || that_present_chargeAmount) {
      if (!(this_present_chargeAmount && that_present_chargeAmount))
        return false;
      if (this.chargeAmount != that.chargeAmount)
        return false;
    }

    boolean this_present_checkThrough = true && this.isSetCheckThrough();
    boolean that_present_checkThrough = true && that.isSetCheckThrough();
    if (this_present_checkThrough || that_present_checkThrough) {
      if (!(this_present_checkThrough && that_present_checkThrough))
        return false;
      if (this.checkThrough != that.checkThrough)
        return false;
    }

    boolean this_present_operatorId = true && this.isSetOperatorId();
    boolean that_present_operatorId = true && that.isSetOperatorId();
    if (this_present_operatorId || that_present_operatorId) {
      if (!(this_present_operatorId && that_present_operatorId))
        return false;
      if (this.operatorId != that.operatorId)
        return false;
    }

    boolean this_present_valid = true && this.isSetValid();
    boolean that_present_valid = true && that.isSetValid();
    if (this_present_valid || that_present_valid) {
      if (!(this_present_valid && that_present_valid))
        return false;
      if (this.valid != that.valid)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_startTime = true && (isSetStartTime());
    list.add(present_startTime);
    if (present_startTime)
      list.add(startTime);

    boolean present_endTime = true && (isSetEndTime());
    list.add(present_endTime);
    if (present_endTime)
      list.add(endTime);

    boolean present_chargeAmount = true && (isSetChargeAmount());
    list.add(present_chargeAmount);
    if (present_chargeAmount)
      list.add(chargeAmount);

    boolean present_checkThrough = true && (isSetCheckThrough());
    list.add(present_checkThrough);
    if (present_checkThrough)
      list.add(checkThrough);

    boolean present_operatorId = true && (isSetOperatorId());
    list.add(present_operatorId);
    if (present_operatorId)
      list.add(operatorId);

    boolean present_valid = true && (isSetValid());
    list.add(present_valid);
    if (present_valid)
      list.add(valid);

    return list.hashCode();
  }

  @Override
  public int compareTo(DayKnot other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartTime()).compareTo(other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTime, other.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndTime()).compareTo(other.isSetEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endTime, other.endTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChargeAmount()).compareTo(other.isSetChargeAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChargeAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chargeAmount, other.chargeAmount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCheckThrough()).compareTo(other.isSetCheckThrough());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCheckThrough()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.checkThrough, other.checkThrough);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperatorId()).compareTo(other.isSetOperatorId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperatorId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operatorId, other.operatorId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValid()).compareTo(other.isSetValid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.valid, other.valid);
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
    StringBuilder sb = new StringBuilder("DayKnot(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetStartTime()) {
      if (!first) sb.append(", ");
      sb.append("startTime:");
      sb.append(this.startTime);
      first = false;
    }
    if (isSetEndTime()) {
      if (!first) sb.append(", ");
      sb.append("endTime:");
      sb.append(this.endTime);
      first = false;
    }
    if (isSetChargeAmount()) {
      if (!first) sb.append(", ");
      sb.append("chargeAmount:");
      sb.append(this.chargeAmount);
      first = false;
    }
    if (isSetCheckThrough()) {
      if (!first) sb.append(", ");
      sb.append("checkThrough:");
      sb.append(this.checkThrough);
      first = false;
    }
    if (isSetOperatorId()) {
      if (!first) sb.append(", ");
      sb.append("operatorId:");
      sb.append(this.operatorId);
      first = false;
    }
    if (isSetValid()) {
      if (!first) sb.append(", ");
      sb.append("valid:");
      sb.append(this.valid);
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

  private static class DayKnotStandardSchemeFactory implements SchemeFactory {
    public DayKnotStandardScheme getScheme() {
      return new DayKnotStandardScheme();
    }
  }

  private static class DayKnotStandardScheme extends StandardScheme<DayKnot> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DayKnot struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startTime = iprot.readI64();
              struct.setStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // END_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.endTime = iprot.readI64();
              struct.setEndTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CHARGE_AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.chargeAmount = iprot.readDouble();
              struct.setChargeAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CHECK_THROUGH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.checkThrough = iprot.readI32();
              struct.setCheckThroughIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // OPERATOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.operatorId = iprot.readI64();
              struct.setOperatorIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 255: // VALID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.valid = iprot.readI32();
              struct.setValidIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DayKnot struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetStartTime()) {
        oprot.writeFieldBegin(START_TIME_FIELD_DESC);
        oprot.writeI64(struct.startTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetEndTime()) {
        oprot.writeFieldBegin(END_TIME_FIELD_DESC);
        oprot.writeI64(struct.endTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetChargeAmount()) {
        oprot.writeFieldBegin(CHARGE_AMOUNT_FIELD_DESC);
        oprot.writeDouble(struct.chargeAmount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCheckThrough()) {
        oprot.writeFieldBegin(CHECK_THROUGH_FIELD_DESC);
        oprot.writeI32(struct.checkThrough);
        oprot.writeFieldEnd();
      }
      if (struct.isSetOperatorId()) {
        oprot.writeFieldBegin(OPERATOR_ID_FIELD_DESC);
        oprot.writeI64(struct.operatorId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetValid()) {
        oprot.writeFieldBegin(VALID_FIELD_DESC);
        oprot.writeI32(struct.valid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DayKnotTupleSchemeFactory implements SchemeFactory {
    public DayKnotTupleScheme getScheme() {
      return new DayKnotTupleScheme();
    }
  }

  private static class DayKnotTupleScheme extends TupleScheme<DayKnot> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DayKnot struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetStartTime()) {
        optionals.set(1);
      }
      if (struct.isSetEndTime()) {
        optionals.set(2);
      }
      if (struct.isSetChargeAmount()) {
        optionals.set(3);
      }
      if (struct.isSetCheckThrough()) {
        optionals.set(4);
      }
      if (struct.isSetOperatorId()) {
        optionals.set(5);
      }
      if (struct.isSetValid()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetStartTime()) {
        oprot.writeI64(struct.startTime);
      }
      if (struct.isSetEndTime()) {
        oprot.writeI64(struct.endTime);
      }
      if (struct.isSetChargeAmount()) {
        oprot.writeDouble(struct.chargeAmount);
      }
      if (struct.isSetCheckThrough()) {
        oprot.writeI32(struct.checkThrough);
      }
      if (struct.isSetOperatorId()) {
        oprot.writeI64(struct.operatorId);
      }
      if (struct.isSetValid()) {
        oprot.writeI32(struct.valid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DayKnot struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.startTime = iprot.readI64();
        struct.setStartTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.endTime = iprot.readI64();
        struct.setEndTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.chargeAmount = iprot.readDouble();
        struct.setChargeAmountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.checkThrough = iprot.readI32();
        struct.setCheckThroughIsSet(true);
      }
      if (incoming.get(5)) {
        struct.operatorId = iprot.readI64();
        struct.setOperatorIdIsSet(true);
      }
      if (incoming.get(6)) {
        struct.valid = iprot.readI32();
        struct.setValidIsSet(true);
      }
    }
  }

}

