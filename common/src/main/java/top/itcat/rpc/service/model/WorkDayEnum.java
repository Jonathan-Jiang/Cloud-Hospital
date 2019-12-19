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

public enum WorkDayEnum implements org.apache.thrift.TEnum {
  Mon(0),
  Tue(1),
  Wed(2),
  Thu(3),
  Fri(4),
  Sat(5),
  Sun(6);

  private final int value;

  private WorkDayEnum(int value) {
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
  public static WorkDayEnum findByValue(int value) { 
    switch (value) {
      case 0:
        return Mon;
      case 1:
        return Tue;
      case 2:
        return Wed;
      case 3:
        return Thu;
      case 4:
        return Fri;
      case 5:
        return Sat;
      case 6:
        return Sun;
      default:
        return null;
    }
  }
}
