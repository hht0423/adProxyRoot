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

public enum SettlementType implements org.apache.thrift.TEnum {
  CPM(0),
  CPC(1),
  CPI(2),
  CPA(3);

  private final int value;

  private SettlementType(int value) {
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
  public static SettlementType findByValue(int value) { 
    switch (value) {
      case 0:
        return CPM;
      case 1:
        return CPC;
      case 2:
        return CPI;
      case 3:
        return CPA;
      default:
        return null;
    }
  }
}
