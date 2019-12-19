/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package top.itcat.rpc.service.model;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum CatalogEnum implements org.apache.thrift.TEnum {
  Nonmedical(0),
  Medical(1),
  Registration(2),
  ChineseMedicine(3);

  private final int value;

  private CatalogEnum(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static CatalogEnum findByValue(int value) { 
    switch (value) {
      case 0:
        return Nonmedical;
      case 1:
        return Medical;
      case 2:
        return Registration;
      case 3:
        return ChineseMedicine;
      default:
        return null;
    }
  }
}
