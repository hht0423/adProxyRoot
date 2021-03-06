/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ocean.proxy.thrift.entity;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum AdSpaceType implements org.apache.thrift.TEnum {
  BANNER(1),
  OPENING(2),
  INTERSTITIAL(3),
  INFOFLOW(4),
  TEXTLINK(5);

  private final int value;

  private AdSpaceType(int value) {
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
  public static AdSpaceType findByValue(int value) { 
    switch (value) {
      case 1:
        return BANNER;
      case 2:
        return OPENING;
      case 3:
        return INTERSTITIAL;
      case 4:
        return INFOFLOW;
      case 5:
        return TEXTLINK;
      default:
        return null;
    }
  }
}
