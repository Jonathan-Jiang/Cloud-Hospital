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
public class Department implements org.apache.thrift.TBase<Department, Department._Fields>, java.io.Serializable, Cloneable, Comparable<Department> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Department");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CLASSIFICATION_FIELD_DESC = new org.apache.thrift.protocol.TField("classification", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField CATEGORY_FIELD_DESC = new org.apache.thrift.protocol.TField("category", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField VALID_FIELD_DESC = new org.apache.thrift.protocol.TField("valid", org.apache.thrift.protocol.TType.I32, (short)255);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DepartmentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DepartmentTupleSchemeFactory());
  }

  public long id; // optional
  public String code; // optional
  public String name; // optional
  /**
   * 
   * @see DepartClassificationEnum
   */
  public DepartClassificationEnum classification; // optional
  public String category; // optional
  public int valid; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CODE((short)2, "code"),
    NAME((short)3, "name"),
    /**
     * 
     * @see DepartClassificationEnum
     */
    CLASSIFICATION((short)4, "classification"),
    CATEGORY((short)5, "category"),
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
        case 2: // CODE
          return CODE;
        case 3: // NAME
          return NAME;
        case 4: // CLASSIFICATION
          return CLASSIFICATION;
        case 5: // CATEGORY
          return CATEGORY;
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
  private static final int __VALID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.CODE,_Fields.NAME,_Fields.CLASSIFICATION,_Fields.CATEGORY,_Fields.VALID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLASSIFICATION, new org.apache.thrift.meta_data.FieldMetaData("classification", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DepartClassificationEnum.class)));
    tmpMap.put(_Fields.CATEGORY, new org.apache.thrift.meta_data.FieldMetaData("category", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALID, new org.apache.thrift.meta_data.FieldMetaData("valid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Department.class, metaDataMap);
  }

  public Department() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Department(Department other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetClassification()) {
      this.classification = other.classification;
    }
    if (other.isSetCategory()) {
      this.category = other.category;
    }
    this.valid = other.valid;
  }

  public Department deepCopy() {
    return new Department(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.code = null;
    this.name = null;
    this.classification = null;
    this.category = null;
    setValidIsSet(false);
    this.valid = 0;
  }

  public long getId() {
    return this.id;
  }

  public Department setId(long id) {
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

  public String getCode() {
    return this.code;
  }

  public Department setCode(String code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public Department setName(String name) {
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

  /**
   * 
   * @see DepartClassificationEnum
   */
  public DepartClassificationEnum getClassification() {
    return this.classification;
  }

  /**
   * 
   * @see DepartClassificationEnum
   */
  public Department setClassification(DepartClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

  public void unsetClassification() {
    this.classification = null;
  }

  /** Returns true if field classification is set (has been assigned a value) and false otherwise */
  public boolean isSetClassification() {
    return this.classification != null;
  }

  public void setClassificationIsSet(boolean value) {
    if (!value) {
      this.classification = null;
    }
  }

  public String getCategory() {
    return this.category;
  }

  public Department setCategory(String category) {
    this.category = category;
    return this;
  }

  public void unsetCategory() {
    this.category = null;
  }

  /** Returns true if field category is set (has been assigned a value) and false otherwise */
  public boolean isSetCategory() {
    return this.category != null;
  }

  public void setCategoryIsSet(boolean value) {
    if (!value) {
      this.category = null;
    }
  }

  public int getValid() {
    return this.valid;
  }

  public Department setValid(int valid) {
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

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case CLASSIFICATION:
      if (value == null) {
        unsetClassification();
      } else {
        setClassification((DepartClassificationEnum)value);
      }
      break;

    case CATEGORY:
      if (value == null) {
        unsetCategory();
      } else {
        setCategory((String)value);
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

    case CODE:
      return getCode();

    case NAME:
      return getName();

    case CLASSIFICATION:
      return getClassification();

    case CATEGORY:
      return getCategory();

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
    case CODE:
      return isSetCode();
    case NAME:
      return isSetName();
    case CLASSIFICATION:
      return isSetClassification();
    case CATEGORY:
      return isSetCategory();
    case VALID:
      return isSetValid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Department)
      return this.equals((Department)that);
    return false;
  }

  public boolean equals(Department that) {
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

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_classification = true && this.isSetClassification();
    boolean that_present_classification = true && that.isSetClassification();
    if (this_present_classification || that_present_classification) {
      if (!(this_present_classification && that_present_classification))
        return false;
      if (!this.classification.equals(that.classification))
        return false;
    }

    boolean this_present_category = true && this.isSetCategory();
    boolean that_present_category = true && that.isSetCategory();
    if (this_present_category || that_present_category) {
      if (!(this_present_category && that_present_category))
        return false;
      if (!this.category.equals(that.category))
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

    boolean present_code = true && (isSetCode());
    list.add(present_code);
    if (present_code)
      list.add(code);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_classification = true && (isSetClassification());
    list.add(present_classification);
    if (present_classification)
      list.add(classification.getValue());

    boolean present_category = true && (isSetCategory());
    list.add(present_category);
    if (present_category)
      list.add(category);

    boolean present_valid = true && (isSetValid());
    list.add(present_valid);
    if (present_valid)
      list.add(valid);

    return list.hashCode();
  }

  @Override
  public int compareTo(Department other) {
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
    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClassification()).compareTo(other.isSetClassification());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClassification()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.classification, other.classification);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCategory()).compareTo(other.isSetCategory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.category, other.category);
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
    StringBuilder sb = new StringBuilder("Department(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetCode()) {
      if (!first) sb.append(", ");
      sb.append("code:");
      if (this.code == null) {
        sb.append("null");
      } else {
        sb.append(this.code);
      }
      first = false;
    }
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetClassification()) {
      if (!first) sb.append(", ");
      sb.append("classification:");
      if (this.classification == null) {
        sb.append("null");
      } else {
        sb.append(this.classification);
      }
      first = false;
    }
    if (isSetCategory()) {
      if (!first) sb.append(", ");
      sb.append("category:");
      if (this.category == null) {
        sb.append("null");
      } else {
        sb.append(this.category);
      }
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

  private static class DepartmentStandardSchemeFactory implements SchemeFactory {
    public DepartmentStandardScheme getScheme() {
      return new DepartmentStandardScheme();
    }
  }

  private static class DepartmentStandardScheme extends StandardScheme<Department> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Department struct) throws org.apache.thrift.TException {
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
          case 2: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CLASSIFICATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.classification = top.itcat.rpc.service.model.DepartClassificationEnum.findByValue(iprot.readI32());
              struct.setClassificationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CATEGORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.category = iprot.readString();
              struct.setCategoryIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Department struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.code != null) {
        if (struct.isSetCode()) {
          oprot.writeFieldBegin(CODE_FIELD_DESC);
          oprot.writeString(struct.code);
          oprot.writeFieldEnd();
        }
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.classification != null) {
        if (struct.isSetClassification()) {
          oprot.writeFieldBegin(CLASSIFICATION_FIELD_DESC);
          oprot.writeI32(struct.classification.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.category != null) {
        if (struct.isSetCategory()) {
          oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
          oprot.writeString(struct.category);
          oprot.writeFieldEnd();
        }
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

  private static class DepartmentTupleSchemeFactory implements SchemeFactory {
    public DepartmentTupleScheme getScheme() {
      return new DepartmentTupleScheme();
    }
  }

  private static class DepartmentTupleScheme extends TupleScheme<Department> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Department struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetCode()) {
        optionals.set(1);
      }
      if (struct.isSetName()) {
        optionals.set(2);
      }
      if (struct.isSetClassification()) {
        optionals.set(3);
      }
      if (struct.isSetCategory()) {
        optionals.set(4);
      }
      if (struct.isSetValid()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetCode()) {
        oprot.writeString(struct.code);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetClassification()) {
        oprot.writeI32(struct.classification.getValue());
      }
      if (struct.isSetCategory()) {
        oprot.writeString(struct.category);
      }
      if (struct.isSetValid()) {
        oprot.writeI32(struct.valid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Department struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.code = iprot.readString();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.classification = top.itcat.rpc.service.model.DepartClassificationEnum.findByValue(iprot.readI32());
        struct.setClassificationIsSet(true);
      }
      if (incoming.get(4)) {
        struct.category = iprot.readString();
        struct.setCategoryIsSet(true);
      }
      if (incoming.get(5)) {
        struct.valid = iprot.readI32();
        struct.setValidIsSet(true);
      }
    }
  }

}
