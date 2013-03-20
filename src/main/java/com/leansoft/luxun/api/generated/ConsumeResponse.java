/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.leansoft.luxun.api.generated;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumeResponse implements org.apache.thrift.TBase<ConsumeResponse, ConsumeResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ConsumeResponse");

  private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("result", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ITEM_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("itemList", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_CONSUMED_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("lastConsumedIndex", org.apache.thrift.protocol.TType.I64, (short)3);

  private Result result;
  private List<ByteBuffer> itemList;
  private long lastConsumedIndex;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESULT((short)1, "result"),
    ITEM_LIST((short)2, "itemList"),
    LAST_CONSUMED_INDEX((short)3, "lastConsumedIndex");

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
        case 1: // RESULT
          return RESULT;
        case 2: // ITEM_LIST
          return ITEM_LIST;
        case 3: // LAST_CONSUMED_INDEX
          return LAST_CONSUMED_INDEX;
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
  private static final int __LASTCONSUMEDINDEX_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("result", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Result.class)));
    tmpMap.put(_Fields.ITEM_LIST, new org.apache.thrift.meta_data.FieldMetaData("itemList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    tmpMap.put(_Fields.LAST_CONSUMED_INDEX, new org.apache.thrift.meta_data.FieldMetaData("lastConsumedIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ConsumeResponse.class, metaDataMap);
  }

  public ConsumeResponse() {
  }

  public ConsumeResponse(
    Result result,
    List<ByteBuffer> itemList,
    long lastConsumedIndex)
  {
    this();
    this.result = result;
    this.itemList = itemList;
    this.lastConsumedIndex = lastConsumedIndex;
    setLastConsumedIndexIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ConsumeResponse(ConsumeResponse other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetResult()) {
      this.result = new Result(other.result);
    }
    if (other.isSetItemList()) {
      List<ByteBuffer> __this__itemList = new ArrayList<ByteBuffer>();
      for (ByteBuffer other_element : other.itemList) {
        ByteBuffer temp_binary_element = org.apache.thrift.TBaseHelper.copyBinary(other_element);
;
        __this__itemList.add(temp_binary_element);
      }
      this.itemList = __this__itemList;
    }
    this.lastConsumedIndex = other.lastConsumedIndex;
  }

  public ConsumeResponse deepCopy() {
    return new ConsumeResponse(this);
  }

  @Override
  public void clear() {
    this.result = null;
    this.itemList = null;
    setLastConsumedIndexIsSet(false);
    this.lastConsumedIndex = 0;
  }

  public Result getResult() {
    return this.result;
  }

  public void setResult(Result result) {
    this.result = result;
  }

  public void unsetResult() {
    this.result = null;
  }

  /** Returns true if field result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  public int getItemListSize() {
    return (this.itemList == null) ? 0 : this.itemList.size();
  }

  public java.util.Iterator<ByteBuffer> getItemListIterator() {
    return (this.itemList == null) ? null : this.itemList.iterator();
  }

  public void addToItemList(ByteBuffer elem) {
    if (this.itemList == null) {
      this.itemList = new ArrayList<ByteBuffer>();
    }
    this.itemList.add(elem);
  }

  public List<ByteBuffer> getItemList() {
    return this.itemList;
  }

  public void setItemList(List<ByteBuffer> itemList) {
    this.itemList = itemList;
  }

  public void unsetItemList() {
    this.itemList = null;
  }

  /** Returns true if field itemList is set (has been assigned a value) and false otherwise */
  public boolean isSetItemList() {
    return this.itemList != null;
  }

  public void setItemListIsSet(boolean value) {
    if (!value) {
      this.itemList = null;
    }
  }

  public long getLastConsumedIndex() {
    return this.lastConsumedIndex;
  }

  public void setLastConsumedIndex(long lastConsumedIndex) {
    this.lastConsumedIndex = lastConsumedIndex;
    setLastConsumedIndexIsSet(true);
  }

  public void unsetLastConsumedIndex() {
    __isset_bit_vector.clear(__LASTCONSUMEDINDEX_ISSET_ID);
  }

  /** Returns true if field lastConsumedIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetLastConsumedIndex() {
    return __isset_bit_vector.get(__LASTCONSUMEDINDEX_ISSET_ID);
  }

  public void setLastConsumedIndexIsSet(boolean value) {
    __isset_bit_vector.set(__LASTCONSUMEDINDEX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((Result)value);
      }
      break;

    case ITEM_LIST:
      if (value == null) {
        unsetItemList();
      } else {
        setItemList((List<ByteBuffer>)value);
      }
      break;

    case LAST_CONSUMED_INDEX:
      if (value == null) {
        unsetLastConsumedIndex();
      } else {
        setLastConsumedIndex((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT:
      return getResult();

    case ITEM_LIST:
      return getItemList();

    case LAST_CONSUMED_INDEX:
      return new Long(getLastConsumedIndex());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESULT:
      return isSetResult();
    case ITEM_LIST:
      return isSetItemList();
    case LAST_CONSUMED_INDEX:
      return isSetLastConsumedIndex();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ConsumeResponse)
      return this.equals((ConsumeResponse)that);
    return false;
  }

  public boolean equals(ConsumeResponse that) {
    if (that == null)
      return false;

    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!this.result.equals(that.result))
        return false;
    }

    boolean this_present_itemList = true && this.isSetItemList();
    boolean that_present_itemList = true && that.isSetItemList();
    if (this_present_itemList || that_present_itemList) {
      if (!(this_present_itemList && that_present_itemList))
        return false;
      if (!this.itemList.equals(that.itemList))
        return false;
    }

    boolean this_present_lastConsumedIndex = true;
    boolean that_present_lastConsumedIndex = true;
    if (this_present_lastConsumedIndex || that_present_lastConsumedIndex) {
      if (!(this_present_lastConsumedIndex && that_present_lastConsumedIndex))
        return false;
      if (this.lastConsumedIndex != that.lastConsumedIndex)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ConsumeResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ConsumeResponse typedOther = (ConsumeResponse)other;

    lastComparison = Boolean.valueOf(isSetResult()).compareTo(typedOther.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result, typedOther.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetItemList()).compareTo(typedOther.isSetItemList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemList, typedOther.itemList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastConsumedIndex()).compareTo(typedOther.isSetLastConsumedIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastConsumedIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastConsumedIndex, typedOther.lastConsumedIndex);
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
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // RESULT
          if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
            this.result = new Result();
            this.result.read(iprot);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ITEM_LIST
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
              this.itemList = new ArrayList<ByteBuffer>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                ByteBuffer _elem2;
                _elem2 = iprot.readBinary();
                this.itemList.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // LAST_CONSUMED_INDEX
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.lastConsumedIndex = iprot.readI64();
            setLastConsumedIndexIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      this.result.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.itemList != null) {
      oprot.writeFieldBegin(ITEM_LIST_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, this.itemList.size()));
        for (ByteBuffer _iter3 : this.itemList)
        {
          oprot.writeBinary(_iter3);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(LAST_CONSUMED_INDEX_FIELD_DESC);
    oprot.writeI64(this.lastConsumedIndex);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ConsumeResponse(");
    boolean first = true;

    sb.append("result:");
    if (this.result == null) {
      sb.append("null");
    } else {
      sb.append(this.result);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("itemList:");
    if (this.itemList == null) {
      sb.append("null");
    } else {
      sb.append(this.itemList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastConsumedIndex:");
    sb.append(this.lastConsumedIndex);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetResult()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'result' is unset! Struct:" + toString());
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
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

