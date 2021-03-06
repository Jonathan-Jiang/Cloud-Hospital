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

public enum RegistrationTypeEnum implements org.apache.thrift.TEnum {
  Normal(0),
  Special(1),
  Emergency(2);

  private final int value;

  private RegistrationTypeEnum(int value) {
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
  public static RegistrationTypeEnum findByValue(int value) { 
    switch (value) {
      case 0:
        return Normal;
      case 1:
        return Special;
      case 2:
        return Emergency;
      default:
        return null;
    }
  }
}
