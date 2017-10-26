/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetOpenTxnsInfoResponse implements org.apache.thrift.TBase<GetOpenTxnsInfoResponse, GetOpenTxnsInfoResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetOpenTxnsInfoResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetOpenTxnsInfoResponse");

  private static final org.apache.thrift.protocol.TField TXN_HIGH_WATER_MARK_FIELD_DESC = new org.apache.thrift.protocol.TField("txn_high_water_mark", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField OPEN_TXNS_FIELD_DESC = new org.apache.thrift.protocol.TField("open_txns", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetOpenTxnsInfoResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetOpenTxnsInfoResponseTupleSchemeFactory());
  }

  private long txn_high_water_mark; // required
  private List<TxnInfo> open_txns; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TXN_HIGH_WATER_MARK((short)1, "txn_high_water_mark"),
    OPEN_TXNS((short)2, "open_txns");

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
        case 1: // TXN_HIGH_WATER_MARK
          return TXN_HIGH_WATER_MARK;
        case 2: // OPEN_TXNS
          return OPEN_TXNS;
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
  private static final int __TXN_HIGH_WATER_MARK_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TXN_HIGH_WATER_MARK, new org.apache.thrift.meta_data.FieldMetaData("txn_high_water_mark", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.OPEN_TXNS, new org.apache.thrift.meta_data.FieldMetaData("open_txns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TxnInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetOpenTxnsInfoResponse.class, metaDataMap);
  }

  public GetOpenTxnsInfoResponse() {
  }

  public GetOpenTxnsInfoResponse(
    long txn_high_water_mark,
    List<TxnInfo> open_txns)
  {
    this();
    this.txn_high_water_mark = txn_high_water_mark;
    setTxn_high_water_markIsSet(true);
    this.open_txns = open_txns;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetOpenTxnsInfoResponse(GetOpenTxnsInfoResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txn_high_water_mark = other.txn_high_water_mark;
    if (other.isSetOpen_txns()) {
      List<TxnInfo> __this__open_txns = new ArrayList<TxnInfo>(other.open_txns.size());
      for (TxnInfo other_element : other.open_txns) {
        __this__open_txns.add(new TxnInfo(other_element));
      }
      this.open_txns = __this__open_txns;
    }
  }

  public GetOpenTxnsInfoResponse deepCopy() {
    return new GetOpenTxnsInfoResponse(this);
  }

  @Override
  public void clear() {
    setTxn_high_water_markIsSet(false);
    this.txn_high_water_mark = 0;
    this.open_txns = null;
  }

  public long getTxn_high_water_mark() {
    return this.txn_high_water_mark;
  }

  public void setTxn_high_water_mark(long txn_high_water_mark) {
    this.txn_high_water_mark = txn_high_water_mark;
    setTxn_high_water_markIsSet(true);
  }

  public void unsetTxn_high_water_mark() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TXN_HIGH_WATER_MARK_ISSET_ID);
  }

  /** Returns true if field txn_high_water_mark is set (has been assigned a value) and false otherwise */
  public boolean isSetTxn_high_water_mark() {
    return EncodingUtils.testBit(__isset_bitfield, __TXN_HIGH_WATER_MARK_ISSET_ID);
  }

  public void setTxn_high_water_markIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TXN_HIGH_WATER_MARK_ISSET_ID, value);
  }

  public int getOpen_txnsSize() {
    return (this.open_txns == null) ? 0 : this.open_txns.size();
  }

  public java.util.Iterator<TxnInfo> getOpen_txnsIterator() {
    return (this.open_txns == null) ? null : this.open_txns.iterator();
  }

  public void addToOpen_txns(TxnInfo elem) {
    if (this.open_txns == null) {
      this.open_txns = new ArrayList<TxnInfo>();
    }
    this.open_txns.add(elem);
  }

  public List<TxnInfo> getOpen_txns() {
    return this.open_txns;
  }

  public void setOpen_txns(List<TxnInfo> open_txns) {
    this.open_txns = open_txns;
  }

  public void unsetOpen_txns() {
    this.open_txns = null;
  }

  /** Returns true if field open_txns is set (has been assigned a value) and false otherwise */
  public boolean isSetOpen_txns() {
    return this.open_txns != null;
  }

  public void setOpen_txnsIsSet(boolean value) {
    if (!value) {
      this.open_txns = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TXN_HIGH_WATER_MARK:
      if (value == null) {
        unsetTxn_high_water_mark();
      } else {
        setTxn_high_water_mark((Long)value);
      }
      break;

    case OPEN_TXNS:
      if (value == null) {
        unsetOpen_txns();
      } else {
        setOpen_txns((List<TxnInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TXN_HIGH_WATER_MARK:
      return getTxn_high_water_mark();

    case OPEN_TXNS:
      return getOpen_txns();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TXN_HIGH_WATER_MARK:
      return isSetTxn_high_water_mark();
    case OPEN_TXNS:
      return isSetOpen_txns();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetOpenTxnsInfoResponse)
      return this.equals((GetOpenTxnsInfoResponse)that);
    return false;
  }

  public boolean equals(GetOpenTxnsInfoResponse that) {
    if (that == null)
      return false;

    boolean this_present_txn_high_water_mark = true;
    boolean that_present_txn_high_water_mark = true;
    if (this_present_txn_high_water_mark || that_present_txn_high_water_mark) {
      if (!(this_present_txn_high_water_mark && that_present_txn_high_water_mark))
        return false;
      if (this.txn_high_water_mark != that.txn_high_water_mark)
        return false;
    }

    boolean this_present_open_txns = true && this.isSetOpen_txns();
    boolean that_present_open_txns = true && that.isSetOpen_txns();
    if (this_present_open_txns || that_present_open_txns) {
      if (!(this_present_open_txns && that_present_open_txns))
        return false;
      if (!this.open_txns.equals(that.open_txns))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_txn_high_water_mark = true;
    list.add(present_txn_high_water_mark);
    if (present_txn_high_water_mark)
      list.add(txn_high_water_mark);

    boolean present_open_txns = true && (isSetOpen_txns());
    list.add(present_open_txns);
    if (present_open_txns)
      list.add(open_txns);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetOpenTxnsInfoResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTxn_high_water_mark()).compareTo(other.isSetTxn_high_water_mark());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxn_high_water_mark()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txn_high_water_mark, other.txn_high_water_mark);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpen_txns()).compareTo(other.isSetOpen_txns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpen_txns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.open_txns, other.open_txns);
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
    StringBuilder sb = new StringBuilder("GetOpenTxnsInfoResponse(");
    boolean first = true;

    sb.append("txn_high_water_mark:");
    sb.append(this.txn_high_water_mark);
    first = false;
    if (!first) sb.append(", ");
    sb.append("open_txns:");
    if (this.open_txns == null) {
      sb.append("null");
    } else {
      sb.append(this.open_txns);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTxn_high_water_mark()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'txn_high_water_mark' is unset! Struct:" + toString());
    }

    if (!isSetOpen_txns()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'open_txns' is unset! Struct:" + toString());
    }

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

  private static class GetOpenTxnsInfoResponseStandardSchemeFactory implements SchemeFactory {
    public GetOpenTxnsInfoResponseStandardScheme getScheme() {
      return new GetOpenTxnsInfoResponseStandardScheme();
    }
  }

  private static class GetOpenTxnsInfoResponseStandardScheme extends StandardScheme<GetOpenTxnsInfoResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetOpenTxnsInfoResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TXN_HIGH_WATER_MARK
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txn_high_water_mark = iprot.readI64();
              struct.setTxn_high_water_markIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPEN_TXNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list460 = iprot.readListBegin();
                struct.open_txns = new ArrayList<TxnInfo>(_list460.size);
                TxnInfo _elem461;
                for (int _i462 = 0; _i462 < _list460.size; ++_i462)
                {
                  _elem461 = new TxnInfo();
                  _elem461.read(iprot);
                  struct.open_txns.add(_elem461);
                }
                iprot.readListEnd();
              }
              struct.setOpen_txnsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetOpenTxnsInfoResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TXN_HIGH_WATER_MARK_FIELD_DESC);
      oprot.writeI64(struct.txn_high_water_mark);
      oprot.writeFieldEnd();
      if (struct.open_txns != null) {
        oprot.writeFieldBegin(OPEN_TXNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.open_txns.size()));
          for (TxnInfo _iter463 : struct.open_txns)
          {
            _iter463.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetOpenTxnsInfoResponseTupleSchemeFactory implements SchemeFactory {
    public GetOpenTxnsInfoResponseTupleScheme getScheme() {
      return new GetOpenTxnsInfoResponseTupleScheme();
    }
  }

  private static class GetOpenTxnsInfoResponseTupleScheme extends TupleScheme<GetOpenTxnsInfoResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetOpenTxnsInfoResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.txn_high_water_mark);
      {
        oprot.writeI32(struct.open_txns.size());
        for (TxnInfo _iter464 : struct.open_txns)
        {
          _iter464.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetOpenTxnsInfoResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.txn_high_water_mark = iprot.readI64();
      struct.setTxn_high_water_markIsSet(true);
      {
        org.apache.thrift.protocol.TList _list465 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.open_txns = new ArrayList<TxnInfo>(_list465.size);
        TxnInfo _elem466;
        for (int _i467 = 0; _i467 < _list465.size; ++_i467)
        {
          _elem466 = new TxnInfo();
          _elem466.read(iprot);
          struct.open_txns.add(_elem466);
        }
      }
      struct.setOpen_txnsIsSet(true);
    }
  }

}

