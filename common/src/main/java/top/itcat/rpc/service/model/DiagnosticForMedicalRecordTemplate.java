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
public class DiagnosticForMedicalRecordTemplate implements org.apache.thrift.TBase<DiagnosticForMedicalRecordTemplate, DiagnosticForMedicalRecordTemplate._Fields>, java.io.Serializable, Cloneable, Comparable<DiagnosticForMedicalRecordTemplate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DiagnosticForMedicalRecordTemplate");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField DOCTOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("doctorId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField DIAGNOSTIC_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("diagnosticId", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField CATALOG_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField MEDICAL_RECORD_TEMPLATE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("medicalRecordTemplateId", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField VALID_FIELD_DESC = new org.apache.thrift.protocol.TField("valid", org.apache.thrift.protocol.TType.I32, (short)255);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DiagnosticForMedicalRecordTemplateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DiagnosticForMedicalRecordTemplateTupleSchemeFactory());
  }

  public long id; // optional
  public long doctorId; // optional
  public long diagnosticId; // optional
  /**
   * 
   * @see DoctorDiagnosticCatalogEnum
   */
  public DoctorDiagnosticCatalogEnum catalog; // optional
  public long medicalRecordTemplateId; // optional
  public int valid; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    DOCTOR_ID((short)2, "doctorId"),
    DIAGNOSTIC_ID((short)3, "diagnosticId"),
    /**
     * 
     * @see DoctorDiagnosticCatalogEnum
     */
    CATALOG((short)4, "catalog"),
    MEDICAL_RECORD_TEMPLATE_ID((short)5, "medicalRecordTemplateId"),
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
        case 2: // DOCTOR_ID
          return DOCTOR_ID;
        case 3: // DIAGNOSTIC_ID
          return DIAGNOSTIC_ID;
        case 4: // CATALOG
          return CATALOG;
        case 5: // MEDICAL_RECORD_TEMPLATE_ID
          return MEDICAL_RECORD_TEMPLATE_ID;
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
  private static final int __DOCTORID_ISSET_ID = 1;
  private static final int __DIAGNOSTICID_ISSET_ID = 2;
  private static final int __MEDICALRECORDTEMPLATEID_ISSET_ID = 3;
  private static final int __VALID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.DOCTOR_ID,_Fields.DIAGNOSTIC_ID,_Fields.CATALOG,_Fields.MEDICAL_RECORD_TEMPLATE_ID,_Fields.VALID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DOCTOR_ID, new org.apache.thrift.meta_data.FieldMetaData("doctorId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DIAGNOSTIC_ID, new org.apache.thrift.meta_data.FieldMetaData("diagnosticId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CATALOG, new org.apache.thrift.meta_data.FieldMetaData("catalog", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DoctorDiagnosticCatalogEnum.class)));
    tmpMap.put(_Fields.MEDICAL_RECORD_TEMPLATE_ID, new org.apache.thrift.meta_data.FieldMetaData("medicalRecordTemplateId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VALID, new org.apache.thrift.meta_data.FieldMetaData("valid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DiagnosticForMedicalRecordTemplate.class, metaDataMap);
  }

  public DiagnosticForMedicalRecordTemplate() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DiagnosticForMedicalRecordTemplate(DiagnosticForMedicalRecordTemplate other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.doctorId = other.doctorId;
    this.diagnosticId = other.diagnosticId;
    if (other.isSetCatalog()) {
      this.catalog = other.catalog;
    }
    this.medicalRecordTemplateId = other.medicalRecordTemplateId;
    this.valid = other.valid;
  }

  public DiagnosticForMedicalRecordTemplate deepCopy() {
    return new DiagnosticForMedicalRecordTemplate(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setDoctorIdIsSet(false);
    this.doctorId = 0;
    setDiagnosticIdIsSet(false);
    this.diagnosticId = 0;
    this.catalog = null;
    setMedicalRecordTemplateIdIsSet(false);
    this.medicalRecordTemplateId = 0;
    setValidIsSet(false);
    this.valid = 0;
  }

  public long getId() {
    return this.id;
  }

  public DiagnosticForMedicalRecordTemplate setId(long id) {
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

  public long getDoctorId() {
    return this.doctorId;
  }

  public DiagnosticForMedicalRecordTemplate setDoctorId(long doctorId) {
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

  public long getDiagnosticId() {
    return this.diagnosticId;
  }

  public DiagnosticForMedicalRecordTemplate setDiagnosticId(long diagnosticId) {
    this.diagnosticId = diagnosticId;
    setDiagnosticIdIsSet(true);
    return this;
  }

  public void unsetDiagnosticId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DIAGNOSTICID_ISSET_ID);
  }

  /** Returns true if field diagnosticId is set (has been assigned a value) and false otherwise */
  public boolean isSetDiagnosticId() {
    return EncodingUtils.testBit(__isset_bitfield, __DIAGNOSTICID_ISSET_ID);
  }

  public void setDiagnosticIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DIAGNOSTICID_ISSET_ID, value);
  }

  /**
   * 
   * @see DoctorDiagnosticCatalogEnum
   */
  public DoctorDiagnosticCatalogEnum getCatalog() {
    return this.catalog;
  }

  /**
   * 
   * @see DoctorDiagnosticCatalogEnum
   */
  public DiagnosticForMedicalRecordTemplate setCatalog(DoctorDiagnosticCatalogEnum catalog) {
    this.catalog = catalog;
    return this;
  }

  public void unsetCatalog() {
    this.catalog = null;
  }

  /** Returns true if field catalog is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalog() {
    return this.catalog != null;
  }

  public void setCatalogIsSet(boolean value) {
    if (!value) {
      this.catalog = null;
    }
  }

  public long getMedicalRecordTemplateId() {
    return this.medicalRecordTemplateId;
  }

  public DiagnosticForMedicalRecordTemplate setMedicalRecordTemplateId(long medicalRecordTemplateId) {
    this.medicalRecordTemplateId = medicalRecordTemplateId;
    setMedicalRecordTemplateIdIsSet(true);
    return this;
  }

  public void unsetMedicalRecordTemplateId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MEDICALRECORDTEMPLATEID_ISSET_ID);
  }

  /** Returns true if field medicalRecordTemplateId is set (has been assigned a value) and false otherwise */
  public boolean isSetMedicalRecordTemplateId() {
    return EncodingUtils.testBit(__isset_bitfield, __MEDICALRECORDTEMPLATEID_ISSET_ID);
  }

  public void setMedicalRecordTemplateIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MEDICALRECORDTEMPLATEID_ISSET_ID, value);
  }

  public int getValid() {
    return this.valid;
  }

  public DiagnosticForMedicalRecordTemplate setValid(int valid) {
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

    case DOCTOR_ID:
      if (value == null) {
        unsetDoctorId();
      } else {
        setDoctorId((Long)value);
      }
      break;

    case DIAGNOSTIC_ID:
      if (value == null) {
        unsetDiagnosticId();
      } else {
        setDiagnosticId((Long)value);
      }
      break;

    case CATALOG:
      if (value == null) {
        unsetCatalog();
      } else {
        setCatalog((DoctorDiagnosticCatalogEnum)value);
      }
      break;

    case MEDICAL_RECORD_TEMPLATE_ID:
      if (value == null) {
        unsetMedicalRecordTemplateId();
      } else {
        setMedicalRecordTemplateId((Long)value);
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

    case DOCTOR_ID:
      return Long.valueOf(getDoctorId());

    case DIAGNOSTIC_ID:
      return Long.valueOf(getDiagnosticId());

    case CATALOG:
      return getCatalog();

    case MEDICAL_RECORD_TEMPLATE_ID:
      return Long.valueOf(getMedicalRecordTemplateId());

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
    case DOCTOR_ID:
      return isSetDoctorId();
    case DIAGNOSTIC_ID:
      return isSetDiagnosticId();
    case CATALOG:
      return isSetCatalog();
    case MEDICAL_RECORD_TEMPLATE_ID:
      return isSetMedicalRecordTemplateId();
    case VALID:
      return isSetValid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DiagnosticForMedicalRecordTemplate)
      return this.equals((DiagnosticForMedicalRecordTemplate)that);
    return false;
  }

  public boolean equals(DiagnosticForMedicalRecordTemplate that) {
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

    boolean this_present_doctorId = true && this.isSetDoctorId();
    boolean that_present_doctorId = true && that.isSetDoctorId();
    if (this_present_doctorId || that_present_doctorId) {
      if (!(this_present_doctorId && that_present_doctorId))
        return false;
      if (this.doctorId != that.doctorId)
        return false;
    }

    boolean this_present_diagnosticId = true && this.isSetDiagnosticId();
    boolean that_present_diagnosticId = true && that.isSetDiagnosticId();
    if (this_present_diagnosticId || that_present_diagnosticId) {
      if (!(this_present_diagnosticId && that_present_diagnosticId))
        return false;
      if (this.diagnosticId != that.diagnosticId)
        return false;
    }

    boolean this_present_catalog = true && this.isSetCatalog();
    boolean that_present_catalog = true && that.isSetCatalog();
    if (this_present_catalog || that_present_catalog) {
      if (!(this_present_catalog && that_present_catalog))
        return false;
      if (!this.catalog.equals(that.catalog))
        return false;
    }

    boolean this_present_medicalRecordTemplateId = true && this.isSetMedicalRecordTemplateId();
    boolean that_present_medicalRecordTemplateId = true && that.isSetMedicalRecordTemplateId();
    if (this_present_medicalRecordTemplateId || that_present_medicalRecordTemplateId) {
      if (!(this_present_medicalRecordTemplateId && that_present_medicalRecordTemplateId))
        return false;
      if (this.medicalRecordTemplateId != that.medicalRecordTemplateId)
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

    boolean present_doctorId = true && (isSetDoctorId());
    list.add(present_doctorId);
    if (present_doctorId)
      list.add(doctorId);

    boolean present_diagnosticId = true && (isSetDiagnosticId());
    list.add(present_diagnosticId);
    if (present_diagnosticId)
      list.add(diagnosticId);

    boolean present_catalog = true && (isSetCatalog());
    list.add(present_catalog);
    if (present_catalog)
      list.add(catalog.getValue());

    boolean present_medicalRecordTemplateId = true && (isSetMedicalRecordTemplateId());
    list.add(present_medicalRecordTemplateId);
    if (present_medicalRecordTemplateId)
      list.add(medicalRecordTemplateId);

    boolean present_valid = true && (isSetValid());
    list.add(present_valid);
    if (present_valid)
      list.add(valid);

    return list.hashCode();
  }

  @Override
  public int compareTo(DiagnosticForMedicalRecordTemplate other) {
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
    lastComparison = Boolean.valueOf(isSetDiagnosticId()).compareTo(other.isSetDiagnosticId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDiagnosticId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.diagnosticId, other.diagnosticId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCatalog()).compareTo(other.isSetCatalog());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalog()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalog, other.catalog);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMedicalRecordTemplateId()).compareTo(other.isSetMedicalRecordTemplateId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMedicalRecordTemplateId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.medicalRecordTemplateId, other.medicalRecordTemplateId);
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
    StringBuilder sb = new StringBuilder("DiagnosticForMedicalRecordTemplate(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetDoctorId()) {
      if (!first) sb.append(", ");
      sb.append("doctorId:");
      sb.append(this.doctorId);
      first = false;
    }
    if (isSetDiagnosticId()) {
      if (!first) sb.append(", ");
      sb.append("diagnosticId:");
      sb.append(this.diagnosticId);
      first = false;
    }
    if (isSetCatalog()) {
      if (!first) sb.append(", ");
      sb.append("catalog:");
      if (this.catalog == null) {
        sb.append("null");
      } else {
        sb.append(this.catalog);
      }
      first = false;
    }
    if (isSetMedicalRecordTemplateId()) {
      if (!first) sb.append(", ");
      sb.append("medicalRecordTemplateId:");
      sb.append(this.medicalRecordTemplateId);
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

  private static class DiagnosticForMedicalRecordTemplateStandardSchemeFactory implements SchemeFactory {
    public DiagnosticForMedicalRecordTemplateStandardScheme getScheme() {
      return new DiagnosticForMedicalRecordTemplateStandardScheme();
    }
  }

  private static class DiagnosticForMedicalRecordTemplateStandardScheme extends StandardScheme<DiagnosticForMedicalRecordTemplate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DiagnosticForMedicalRecordTemplate struct) throws org.apache.thrift.TException {
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
          case 2: // DOCTOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.doctorId = iprot.readI64();
              struct.setDoctorIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DIAGNOSTIC_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.diagnosticId = iprot.readI64();
              struct.setDiagnosticIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CATALOG
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.catalog = top.itcat.rpc.service.model.DoctorDiagnosticCatalogEnum.findByValue(iprot.readI32());
              struct.setCatalogIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MEDICAL_RECORD_TEMPLATE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.medicalRecordTemplateId = iprot.readI64();
              struct.setMedicalRecordTemplateIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DiagnosticForMedicalRecordTemplate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDoctorId()) {
        oprot.writeFieldBegin(DOCTOR_ID_FIELD_DESC);
        oprot.writeI64(struct.doctorId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDiagnosticId()) {
        oprot.writeFieldBegin(DIAGNOSTIC_ID_FIELD_DESC);
        oprot.writeI64(struct.diagnosticId);
        oprot.writeFieldEnd();
      }
      if (struct.catalog != null) {
        if (struct.isSetCatalog()) {
          oprot.writeFieldBegin(CATALOG_FIELD_DESC);
          oprot.writeI32(struct.catalog.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMedicalRecordTemplateId()) {
        oprot.writeFieldBegin(MEDICAL_RECORD_TEMPLATE_ID_FIELD_DESC);
        oprot.writeI64(struct.medicalRecordTemplateId);
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

  private static class DiagnosticForMedicalRecordTemplateTupleSchemeFactory implements SchemeFactory {
    public DiagnosticForMedicalRecordTemplateTupleScheme getScheme() {
      return new DiagnosticForMedicalRecordTemplateTupleScheme();
    }
  }

  private static class DiagnosticForMedicalRecordTemplateTupleScheme extends TupleScheme<DiagnosticForMedicalRecordTemplate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DiagnosticForMedicalRecordTemplate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetDoctorId()) {
        optionals.set(1);
      }
      if (struct.isSetDiagnosticId()) {
        optionals.set(2);
      }
      if (struct.isSetCatalog()) {
        optionals.set(3);
      }
      if (struct.isSetMedicalRecordTemplateId()) {
        optionals.set(4);
      }
      if (struct.isSetValid()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetDoctorId()) {
        oprot.writeI64(struct.doctorId);
      }
      if (struct.isSetDiagnosticId()) {
        oprot.writeI64(struct.diagnosticId);
      }
      if (struct.isSetCatalog()) {
        oprot.writeI32(struct.catalog.getValue());
      }
      if (struct.isSetMedicalRecordTemplateId()) {
        oprot.writeI64(struct.medicalRecordTemplateId);
      }
      if (struct.isSetValid()) {
        oprot.writeI32(struct.valid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DiagnosticForMedicalRecordTemplate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.doctorId = iprot.readI64();
        struct.setDoctorIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.diagnosticId = iprot.readI64();
        struct.setDiagnosticIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.catalog = top.itcat.rpc.service.model.DoctorDiagnosticCatalogEnum.findByValue(iprot.readI32());
        struct.setCatalogIsSet(true);
      }
      if (incoming.get(4)) {
        struct.medicalRecordTemplateId = iprot.readI64();
        struct.setMedicalRecordTemplateIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.valid = iprot.readI32();
        struct.setValidIsSet(true);
      }
    }
  }

}

