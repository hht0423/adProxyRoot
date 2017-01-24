/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ocean.proxy.thrift.entity;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-1-13")
public class ProxyUserInfo implements org.apache.thrift.TBase<ProxyUserInfo, ProxyUserInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ProxyUserInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProxyUserInfo");

  private static final org.apache.thrift.protocol.TField ADIDS_FIELD_DESC = new org.apache.thrift.protocol.TField("adids", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField FETCH_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("fetch_num", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField TOTAL_FETCH_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("total_fetch_num", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField AD_USER_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("ad_user_info", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProxyUserInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProxyUserInfoTupleSchemeFactory());
  }

  public List<Long> adids; // optional
  public Map<String,Integer> fetch_num; // optional
  public int total_fetch_num; // optional
  public com.ocean.proxy.thrift.entity.AdUserInfo ad_user_info; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ADIDS((short)1, "adids"),
    FETCH_NUM((short)2, "fetch_num"),
    TOTAL_FETCH_NUM((short)3, "total_fetch_num"),
    AD_USER_INFO((short)4, "ad_user_info");

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
        case 1: // ADIDS
          return ADIDS;
        case 2: // FETCH_NUM
          return FETCH_NUM;
        case 3: // TOTAL_FETCH_NUM
          return TOTAL_FETCH_NUM;
        case 4: // AD_USER_INFO
          return AD_USER_INFO;
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
  private static final int __TOTAL_FETCH_NUM_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ADIDS,_Fields.FETCH_NUM,_Fields.TOTAL_FETCH_NUM,_Fields.AD_USER_INFO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ADIDS, new org.apache.thrift.meta_data.FieldMetaData("adids", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.FETCH_NUM, new org.apache.thrift.meta_data.FieldMetaData("fetch_num", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.TOTAL_FETCH_NUM, new org.apache.thrift.meta_data.FieldMetaData("total_fetch_num", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AD_USER_INFO, new org.apache.thrift.meta_data.FieldMetaData("ad_user_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ocean.proxy.thrift.entity.AdUserInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProxyUserInfo.class, metaDataMap);
  }

  public ProxyUserInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProxyUserInfo(ProxyUserInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAdids()) {
      List<Long> __this__adids = new ArrayList<Long>(other.adids);
      this.adids = __this__adids;
    }
    if (other.isSetFetch_num()) {
      Map<String,Integer> __this__fetch_num = new HashMap<String,Integer>(other.fetch_num);
      this.fetch_num = __this__fetch_num;
    }
    this.total_fetch_num = other.total_fetch_num;
    if (other.isSetAd_user_info()) {
      this.ad_user_info = new com.ocean.proxy.thrift.entity.AdUserInfo(other.ad_user_info);
    }
  }

  public ProxyUserInfo deepCopy() {
    return new ProxyUserInfo(this);
  }

  
  public void clear() {
    this.adids = null;
    this.fetch_num = null;
    setTotal_fetch_numIsSet(false);
    this.total_fetch_num = 0;
    this.ad_user_info = null;
  }

  public int getAdidsSize() {
    return (this.adids == null) ? 0 : this.adids.size();
  }

  public java.util.Iterator<Long> getAdidsIterator() {
    return (this.adids == null) ? null : this.adids.iterator();
  }

  public void addToAdids(long elem) {
    if (this.adids == null) {
      this.adids = new ArrayList<Long>();
    }
    this.adids.add(elem);
  }

  public List<Long> getAdids() {
    return this.adids;
  }

  public ProxyUserInfo setAdids(List<Long> adids) {
    this.adids = adids;
    return this;
  }

  public void unsetAdids() {
    this.adids = null;
  }

  /** Returns true if field adids is set (has been assigned a value) and false otherwise */
  public boolean isSetAdids() {
    return this.adids != null;
  }

  public void setAdidsIsSet(boolean value) {
    if (!value) {
      this.adids = null;
    }
  }

  public int getFetch_numSize() {
    return (this.fetch_num == null) ? 0 : this.fetch_num.size();
  }

  public void putToFetch_num(String key, int val) {
    if (this.fetch_num == null) {
      this.fetch_num = new HashMap<String,Integer>();
    }
    this.fetch_num.put(key, val);
  }

  public Map<String,Integer> getFetch_num() {
    return this.fetch_num;
  }

  public ProxyUserInfo setFetch_num(Map<String,Integer> fetch_num) {
    this.fetch_num = fetch_num;
    return this;
  }

  public void unsetFetch_num() {
    this.fetch_num = null;
  }

  /** Returns true if field fetch_num is set (has been assigned a value) and false otherwise */
  public boolean isSetFetch_num() {
    return this.fetch_num != null;
  }

  public void setFetch_numIsSet(boolean value) {
    if (!value) {
      this.fetch_num = null;
    }
  }

  public int getTotal_fetch_num() {
    return this.total_fetch_num;
  }

  public ProxyUserInfo setTotal_fetch_num(int total_fetch_num) {
    this.total_fetch_num = total_fetch_num;
    setTotal_fetch_numIsSet(true);
    return this;
  }

  public void unsetTotal_fetch_num() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTAL_FETCH_NUM_ISSET_ID);
  }

  /** Returns true if field total_fetch_num is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal_fetch_num() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTAL_FETCH_NUM_ISSET_ID);
  }

  public void setTotal_fetch_numIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTAL_FETCH_NUM_ISSET_ID, value);
  }

  public com.ocean.proxy.thrift.entity.AdUserInfo getAd_user_info() {
    return this.ad_user_info;
  }

  public ProxyUserInfo setAd_user_info(com.ocean.proxy.thrift.entity.AdUserInfo ad_user_info) {
    this.ad_user_info = ad_user_info;
    return this;
  }

  public void unsetAd_user_info() {
    this.ad_user_info = null;
  }

  /** Returns true if field ad_user_info is set (has been assigned a value) and false otherwise */
  public boolean isSetAd_user_info() {
    return this.ad_user_info != null;
  }

  public void setAd_user_infoIsSet(boolean value) {
    if (!value) {
      this.ad_user_info = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ADIDS:
      if (value == null) {
        unsetAdids();
      } else {
        setAdids((List<Long>)value);
      }
      break;

    case FETCH_NUM:
      if (value == null) {
        unsetFetch_num();
      } else {
        setFetch_num((Map<String,Integer>)value);
      }
      break;

    case TOTAL_FETCH_NUM:
      if (value == null) {
        unsetTotal_fetch_num();
      } else {
        setTotal_fetch_num((Integer)value);
      }
      break;

    case AD_USER_INFO:
      if (value == null) {
        unsetAd_user_info();
      } else {
        setAd_user_info((com.ocean.proxy.thrift.entity.AdUserInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ADIDS:
      return getAdids();

    case FETCH_NUM:
      return getFetch_num();

    case TOTAL_FETCH_NUM:
      return Integer.valueOf(getTotal_fetch_num());

    case AD_USER_INFO:
      return getAd_user_info();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ADIDS:
      return isSetAdids();
    case FETCH_NUM:
      return isSetFetch_num();
    case TOTAL_FETCH_NUM:
      return isSetTotal_fetch_num();
    case AD_USER_INFO:
      return isSetAd_user_info();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProxyUserInfo)
      return this.equals((ProxyUserInfo)that);
    return false;
  }

  public boolean equals(ProxyUserInfo that) {
    if (that == null)
      return false;

    boolean this_present_adids = true && this.isSetAdids();
    boolean that_present_adids = true && that.isSetAdids();
    if (this_present_adids || that_present_adids) {
      if (!(this_present_adids && that_present_adids))
        return false;
      if (!this.adids.equals(that.adids))
        return false;
    }

    boolean this_present_fetch_num = true && this.isSetFetch_num();
    boolean that_present_fetch_num = true && that.isSetFetch_num();
    if (this_present_fetch_num || that_present_fetch_num) {
      if (!(this_present_fetch_num && that_present_fetch_num))
        return false;
      if (!this.fetch_num.equals(that.fetch_num))
        return false;
    }

    boolean this_present_total_fetch_num = true && this.isSetTotal_fetch_num();
    boolean that_present_total_fetch_num = true && that.isSetTotal_fetch_num();
    if (this_present_total_fetch_num || that_present_total_fetch_num) {
      if (!(this_present_total_fetch_num && that_present_total_fetch_num))
        return false;
      if (this.total_fetch_num != that.total_fetch_num)
        return false;
    }

    boolean this_present_ad_user_info = true && this.isSetAd_user_info();
    boolean that_present_ad_user_info = true && that.isSetAd_user_info();
    if (this_present_ad_user_info || that_present_ad_user_info) {
      if (!(this_present_ad_user_info && that_present_ad_user_info))
        return false;
      if (!this.ad_user_info.equals(that.ad_user_info))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_adids = true && (isSetAdids());
    list.add(present_adids);
    if (present_adids)
      list.add(adids);

    boolean present_fetch_num = true && (isSetFetch_num());
    list.add(present_fetch_num);
    if (present_fetch_num)
      list.add(fetch_num);

    boolean present_total_fetch_num = true && (isSetTotal_fetch_num());
    list.add(present_total_fetch_num);
    if (present_total_fetch_num)
      list.add(total_fetch_num);

    boolean present_ad_user_info = true && (isSetAd_user_info());
    list.add(present_ad_user_info);
    if (present_ad_user_info)
      list.add(ad_user_info);

    return list.hashCode();
  }

  
  public int compareTo(ProxyUserInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAdids()).compareTo(other.isSetAdids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdids()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adids, other.adids);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFetch_num()).compareTo(other.isSetFetch_num());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFetch_num()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fetch_num, other.fetch_num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotal_fetch_num()).compareTo(other.isSetTotal_fetch_num());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal_fetch_num()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total_fetch_num, other.total_fetch_num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAd_user_info()).compareTo(other.isSetAd_user_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAd_user_info()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ad_user_info, other.ad_user_info);
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

  
  public String toString() {
    StringBuilder sb = new StringBuilder("ProxyUserInfo(");
    boolean first = true;

    if (isSetAdids()) {
      sb.append("adids:");
      if (this.adids == null) {
        sb.append("null");
      } else {
        sb.append(this.adids);
      }
      first = false;
    }
    if (isSetFetch_num()) {
      if (!first) sb.append(", ");
      sb.append("fetch_num:");
      if (this.fetch_num == null) {
        sb.append("null");
      } else {
        sb.append(this.fetch_num);
      }
      first = false;
    }
    if (isSetTotal_fetch_num()) {
      if (!first) sb.append(", ");
      sb.append("total_fetch_num:");
      sb.append(this.total_fetch_num);
      first = false;
    }
    if (isSetAd_user_info()) {
      if (!first) sb.append(", ");
      sb.append("ad_user_info:");
      if (this.ad_user_info == null) {
        sb.append("null");
      } else {
        sb.append(this.ad_user_info);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (ad_user_info != null) {
      ad_user_info.validate();
    }
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

  private static class ProxyUserInfoStandardSchemeFactory implements SchemeFactory {
    public ProxyUserInfoStandardScheme getScheme() {
      return new ProxyUserInfoStandardScheme();
    }
  }

  private static class ProxyUserInfoStandardScheme extends StandardScheme<ProxyUserInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProxyUserInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ADIDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.adids = new ArrayList<Long>(_list0.size);
                long _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI64();
                  struct.adids.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setAdidsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FETCH_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map3 = iprot.readMapBegin();
                struct.fetch_num = new HashMap<String,Integer>(2*_map3.size);
                String _key4;
                int _val5;
                for (int _i6 = 0; _i6 < _map3.size; ++_i6)
                {
                  _key4 = iprot.readString();
                  _val5 = iprot.readI32();
                  struct.fetch_num.put(_key4, _val5);
                }
                iprot.readMapEnd();
              }
              struct.setFetch_numIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOTAL_FETCH_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total_fetch_num = iprot.readI32();
              struct.setTotal_fetch_numIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AD_USER_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ad_user_info = new com.ocean.proxy.thrift.entity.AdUserInfo();
              struct.ad_user_info.read(iprot);
              struct.setAd_user_infoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProxyUserInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.adids != null) {
        if (struct.isSetAdids()) {
          oprot.writeFieldBegin(ADIDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.adids.size()));
            for (long _iter7 : struct.adids)
            {
              oprot.writeI64(_iter7);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.fetch_num != null) {
        if (struct.isSetFetch_num()) {
          oprot.writeFieldBegin(FETCH_NUM_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, struct.fetch_num.size()));
            for (Map.Entry<String, Integer> _iter8 : struct.fetch_num.entrySet())
            {
              oprot.writeString(_iter8.getKey());
              oprot.writeI32(_iter8.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTotal_fetch_num()) {
        oprot.writeFieldBegin(TOTAL_FETCH_NUM_FIELD_DESC);
        oprot.writeI32(struct.total_fetch_num);
        oprot.writeFieldEnd();
      }
      if (struct.ad_user_info != null) {
        if (struct.isSetAd_user_info()) {
          oprot.writeFieldBegin(AD_USER_INFO_FIELD_DESC);
          struct.ad_user_info.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProxyUserInfoTupleSchemeFactory implements SchemeFactory {
    public ProxyUserInfoTupleScheme getScheme() {
      return new ProxyUserInfoTupleScheme();
    }
  }

  private static class ProxyUserInfoTupleScheme extends TupleScheme<ProxyUserInfo> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, ProxyUserInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAdids()) {
        optionals.set(0);
      }
      if (struct.isSetFetch_num()) {
        optionals.set(1);
      }
      if (struct.isSetTotal_fetch_num()) {
        optionals.set(2);
      }
      if (struct.isSetAd_user_info()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAdids()) {
        {
          oprot.writeI32(struct.adids.size());
          for (long _iter9 : struct.adids)
          {
            oprot.writeI64(_iter9);
          }
        }
      }
      if (struct.isSetFetch_num()) {
        {
          oprot.writeI32(struct.fetch_num.size());
          for (Map.Entry<String, Integer> _iter10 : struct.fetch_num.entrySet())
          {
            oprot.writeString(_iter10.getKey());
            oprot.writeI32(_iter10.getValue());
          }
        }
      }
      if (struct.isSetTotal_fetch_num()) {
        oprot.writeI32(struct.total_fetch_num);
      }
      if (struct.isSetAd_user_info()) {
        struct.ad_user_info.write(oprot);
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, ProxyUserInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list11 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.adids = new ArrayList<Long>(_list11.size);
          long _elem12;
          for (int _i13 = 0; _i13 < _list11.size; ++_i13)
          {
            _elem12 = iprot.readI64();
            struct.adids.add(_elem12);
          }
        }
        struct.setAdidsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map14 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.fetch_num = new HashMap<String,Integer>(2*_map14.size);
          String _key15;
          int _val16;
          for (int _i17 = 0; _i17 < _map14.size; ++_i17)
          {
            _key15 = iprot.readString();
            _val16 = iprot.readI32();
            struct.fetch_num.put(_key15, _val16);
          }
        }
        struct.setFetch_numIsSet(true);
      }
      if (incoming.get(2)) {
        struct.total_fetch_num = iprot.readI32();
        struct.setTotal_fetch_numIsSet(true);
      }
      if (incoming.get(3)) {
        struct.ad_user_info = new com.ocean.proxy.thrift.entity.AdUserInfo();
        struct.ad_user_info.read(iprot);
        struct.setAd_user_infoIsSet(true);
      }
    }
  }

}
