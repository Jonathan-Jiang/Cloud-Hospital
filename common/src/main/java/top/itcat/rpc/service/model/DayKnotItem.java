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
public class DayKnotItem implements org.apache.thrift.TBase<DayKnotItem, DayKnotItem._Fields>, java.io.Serializable, Cloneable, Comparable<DayKnotItem> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DayKnotItem");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField CHARGE_ITEM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("chargeItemId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField DAY_KNOT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dayKnotId", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField CHARGE_SUBJECT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("chargeSubjectId", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField VALID_FIELD_DESC = new org.apache.thrift.protocol.TField("valid", org.apache.thrift.protocol.TType.I32, (short)255);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DayKnotItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DayKnotItemTupleSchemeFactory());
  }

  public long id; // optional
  public long chargeItemId; // optional
  public long dayKnotId; // optional
  public long chargeSubjectId; // optional
  public int valid; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CHARGE_ITEM_ID((short)2, "chargeItemId"),
    DAY_KNOT_ID((short)3, "dayKnotId"),
    CHARGE_SUBJECT_ID((short)4, "chargeSubjectId"),
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
        case 2: // CHARGE_ITEM_ID
          return CHARGE_ITEM_ID;
        case 3: // DAY_KNOT_ID
          return DAY_KNOT_ID;
        case 4: // CHARGE_SUBJECT_ID
          return CHARGE_SUBJECT_ID;
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
  private static final int __CHARGEITEMID_ISSET_ID = 1;
  private static final int __DAYKNOTID_ISSET_ID = 2;
  private static final int __CHARGESUBJECTID_ISSET_ID = 3;
  private static final int __VALID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.CHARGE_ITEM_ID,_Fields.DAY_KNOT_ID,_Fields.CHARGE_SUBJECT_ID,_Fields.VALID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CHARGE_ITEM_ID, new org.apache.thrift.meta_data.FieldMetaData("chargeItemId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DAY_KNOT_ID, new org.apache.thrift.meta_data.FieldMetaData("dayKnotId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CHARGE_SUBJECT_ID, new org.apache.thrift.meta_data.FieldMetaData("chargeSubjectId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VALID, new org.apache.thrift.meta_data.FieldMetaData("valid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DayKnotItem.class, metaDataMap);
  }

  public DayKnotItem() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DayKnotItem(DayKnotItem other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.chargeItemId = other.chargeItemId;
    this.dayKnotId = other.dayKnotId;
    this.chargeSubjectId = other.chargeSubjectId;
    this.valid = other.valid;
  }

  public DayKnotItem deepCopy() {
    return new DayKnotItem(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setChargeItemIdIsSet(false);
    this.chargeItemId = 0;
    setDayKnotIdIsSet(false);
    this.dayKnotId = 0;
    setChargeSubjectIdIsSet(false);
    this.chargeSubjectId = 0;
    setValidIsSet(false);
    this.valid = 0;
  }

  public long getId() {
    return this.id;
  }

  public DayKnotItem setId(long id) {
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

  public long getChargeItemId() {
    return this.chargeItemId;
  }

  public DayKnotItem setChargeItemId(long chargeItemId) {
    this.chargeItemId = chargeItemId;
    setChargeItemIdIsSet(true);
    return this;
  }

  public void unsetChargeItemId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHARGEITEMID_ISSET_ID);
  }

  /** Returns true if field chargeItemId is set (has been assigned a value) and false otherwise */
  public boolean isSetChargeItemId() {
    return EncodingUtils.testBit(__isset_bitfield, __CHARGEITEMID_ISSET_ID);
  }

  public void setChargeItemIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHARGEITEMID_ISSET_ID, value);
  }

  public long getDayKnotId() {
    return this.dayKnotId;
  }

  public DayKnotItem setDayKnotId(long dayKnotId) {
    this.dayKnotId = dayKnotId;
    setDayKnotIdIsSet(true);
    return this;
  }

  public void unsetDayKnotId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DAYKNOTID_ISSET_ID);
  }

  /** Returns true if field dayKnotId is set (has been assigned a value) and false otherwise */
  public boolean isSetDayKnotId() {
    return EncodingUtils.testBit(__isset_bitfield, __DAYKNOTID_ISSET_ID);
  }

  public void setDayKnotIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DAYKNOTID_ISSET_ID, value);
  }

  public long getChargeSubjectId() {
    return this.chargeSubjectId;
  }

  public DayKnotItem setChargeSubjectId(long chargeSubjectId) {
    this.chargeSubjectId = chargeSubjectId;
    setChargeSubjectIdIsSet(true);
    return this;
  }

  public void unsetChargeSubjectId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHARGESUBJECTID_ISSET_ID);
  }

  /** Returns true if field chargeSubjectId is set (has been assigned a value) and false otherwise */
  public boolean isSetChargeSubjectId() {
    return EncodingUtils.testBit(__isset_bitfield, __CHARGESUBJECTID_ISSET_ID);
  }

  public void setChargeSubjectIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHARGESUBJECTID_ISSET_ID, value);
  }

  public int getValid() {
    return this.valid;
  }

  public DayKnotItem setValid(int valid) {
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

    case CHARGE_ITEM_ID:
      if (value == null) {
        unsetChargeItemId();
      } else {
        setChargeItemId((Long)value);
      }
      break;

    case DAY_KNOT_ID:
      if (value == null) {
        unsetDayKnotId();
      } else {
        setDayKnotId((Long)value);
      }
      break;

    case CHARGE_SUBJECT_ID:
      if (value == null) {
        unsetChargeSubjectId();
      } else {
        setChargeSubjectId((Long)value);
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

    case CHARGE_ITEM_ID:
      return Long.valueOf(getChargeItemId());

    case DAY_KNOT_ID:
      return Long.valueOf(getDayKnotId());

    case CHARGE_SUBJECT_ID:
      return Long.valueOf(getChargeSubjectId());

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
    case CHARGE_ITEM_ID:
      return isSetChargeItemId();
    case DAY_KNOT_ID:
      return isSetDayKnotId();
    case CHARGE_SUBJECT_ID:
      return isSetChargeSubjectId();
    case VALID:
      return isSetValid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DayKnotItem)
      return this.equals((DayKnotItem)that);
    return false;
  }

  public boolean equals(DayKnotItem that) {
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

    boolean this_present_chargeItemId = true && this.isSetChargeItemId();
    boolean that_present_chargeItemId = true && that.isSetChargeItemId();
    if (this_present_chargeItemId || that_present_chargeItemId) {
      if (!(this_present_chargeItemId && that_present_chargeItemId))
        return false;
      if (this.chargeItemId != that.chargeItemId)
        return false;
    }

    boolean this_present_dayKnotId = true && this.isSetDayKnotId();
    boolean that_present_dayKnotId = true && that.isSetDayKnotId();
    if (this_present_dayKnotId || that_present_dayKnotId) {
      if (!(this_present_dayKnotId && that_present_dayKnotId))
        return false;
      if (this.dayKnotId != that.dayKnotId)
        return false;
    }

    boolean this_present_chargeSubjectId = true && this.isSetChargeSubjectId();
    boolean that_present_chargeSubjectId = true && that.isSetChargeSubjectId();
    if (this_present_chargeSubjectId || that_present_chargeSubjectId) {
      if (!(this_present_chargeSubjectId && that_present_chargeSubjectId))
        return false;
      if (this.chargeSubjectId != that.chargeSubjectId)
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

    boolean present_chargeItemId = true && (isSetChargeItemId());
    list.add(present_chargeItemId);
    if (present_chargeItemId)
      list.add(chargeItemId);

    boolean present_dayKnotId = true && (isSetDayKnotId());
    list.add(present_dayKnotId);
    if (present_dayKnotId)
      list.add(dayKnotId);

    boolean present_chargeSubjectId = true && (isSetChargeSubjectId());
    list.add(present_chargeSubjectId);
    if (present_chargeSubjectId)
      list.add(chargeSubjectId);

    boolean present_valid = true && (isSetValid());
    list.add(present_valid);
    if (present_valid)
      list.add(valid);

    return list.hashCode();
  }

  @Override
  public int compareTo(DayKnotItem other) {
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
    lastComparison = Boolean.valueOf(isSetChargeItemId()).compareTo(other.isSetChargeItemId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChargeItemId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chargeItemId, other.chargeItemId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDayKnotId()).compareTo(other.isSetDayKnotId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDayKnotId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dayKnotId, other.dayKnotId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChargeSubjectId()).compareTo(other.isSetChargeSubjectId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChargeSubjectId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chargeSubjectId, other.chargeSubjectId);
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
    StringBuilder sb = new StringBuilder("DayKnotItem(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetChargeItemId()) {
      if (!first) sb.append(", ");
      sb.append("chargeItemId:");
      sb.append(this.chargeItemId);
      first = false;
    }
    if (isSetDayKnotId()) {
      if (!first) sb.append(", ");
      sb.append("dayKnotId:");
      sb.append(this.dayKnotId);
      first = false;
    }
    if (isSetChargeSubjectId()) {
      if (!first) sb.append(", ");
      sb.append("chargeSubjectId:");
      sb.append(this.chargeSubjectId);
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

  private static class DayKnotItemStandardSchemeFactory implements SchemeFactory {
    public DayKnotItemStandardScheme getScheme() {
      return new DayKnotItemStandardScheme();
    }
  }

  private static class DayKnotItemStandardScheme extends StandardScheme<DayKnotItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DayKnotItem struct) throws org.apache.thrift.TException {
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
          case 2: // CHARGE_ITEM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.chargeItemId = iprot.readI64();
              struct.setChargeItemIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DAY_KNOT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.dayKnotId = iprot.readI64();
              struct.setDayKnotIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CHARGE_SUBJECT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.chargeSubjectId = iprot.readI64();
              struct.setChargeSubjectIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DayKnotItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetChargeItemId()) {
        oprot.writeFieldBegin(CHARGE_ITEM_ID_FIELD_DESC);
        oprot.writeI64(struct.chargeItemId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDayKnotId()) {
        oprot.writeFieldBegin(DAY_KNOT_ID_FIELD_DESC);
        oprot.writeI64(struct.dayKnotId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetChargeSubjectId()) {
        oprot.writeFieldBegin(CHARGE_SUBJECT_ID_FIELD_DESC);
        oprot.writeI64(struct.chargeSubjectId);
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

  private static class DayKnotItemTupleSchemeFactory implements SchemeFactory {
    public DayKnotItemTupleScheme getScheme() {
      return new DayKnotItemTupleScheme();
    }
  }

  private static class DayKnotItemTupleScheme extends TupleScheme<DayKnotItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DayKnotItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetChargeItemId()) {
        optionals.set(1);
      }
      if (struct.isSetDayKnotId()) {
        optionals.set(2);
      }
      if (struct.isSetChargeSubjectId()) {
        optionals.set(3);
      }
      if (struct.isSetValid()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetChargeItemId()) {
        oprot.writeI64(struct.chargeItemId);
      }
      if (struct.isSetDayKnotId()) {
        oprot.writeI64(struct.dayKnotId);
      }
      if (struct.isSetChargeSubjectId()) {
        oprot.writeI64(struct.chargeSubjectId);
      }
      if (struct.isSetValid()) {
        oprot.writeI32(struct.valid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DayKnotItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.chargeItemId = iprot.readI64();
        struct.setChargeItemIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dayKnotId = iprot.readI64();
        struct.setDayKnotIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.chargeSubjectId = iprot.readI64();
        struct.setChargeSubjectIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.valid = iprot.readI32();
        struct.setValidIsSet(true);
      }
    }
  }

}

