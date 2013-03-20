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

public class ProduceRequest implements org.apache.thrift.TBase<ProduceRequest, ProduceRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProduceRequest");

  private static final org.apache.thrift.protocol.TField ITEM_FIELD_DESC = new org.apache.thrift.protocol.TField("item", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TOPIC_FIELD_DESC = new org.apache.thrift.protocol.TField("topic", org.apache.thrift.protocol.TType.STRING, (short)2);

  private ByteBuffer item;
  private String topic;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ITEM((short)1, "item"),
    TOPIC((short)2, "topic");

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
        case 1: // ITEM
          return ITEM;
        case 2: // TOPIC
          return TOPIC;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ITEM, new org.apache.thrift.meta_data.FieldMetaData("item", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.TOPIC, new org.apache.thrift.meta_data.FieldMetaData("topic", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProduceRequest.class, metaDataMap);
  }

  public ProduceRequest() {
  }

  public ProduceRequest(
    ByteBuffer item,
    String topic)
  {
    this();
    this.item = item;
    this.topic = topic;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProduceRequest(ProduceRequest other) {
    if (other.isSetItem()) {
      this.item = org.apache.thrift.TBaseHelper.copyBinary(other.item);
;
    }
    if (other.isSetTopic()) {
      this.topic = other.topic;
    }
  }

  public ProduceRequest deepCopy() {
    return new ProduceRequest(this);
  }

  @Override
  public void clear() {
    this.item = null;
    this.topic = null;
  }

  public byte[] getItem() {
    setItem(org.apache.thrift.TBaseHelper.rightSize(item));
    return item == null ? null : item.array();
  }

  public ByteBuffer bufferForItem() {
    return item;
  }

  public void setItem(byte[] item) {
    setItem(item == null ? (ByteBuffer)null : ByteBuffer.wrap(item));
  }

  public void setItem(ByteBuffer item) {
    this.item = item;
  }

  public void unsetItem() {
    this.item = null;
  }

  /** Returns true if field item is set (has been assigned a value) and false otherwise */
  public boolean isSetItem() {
    return this.item != null;
  }

  public void setItemIsSet(boolean value) {
    if (!value) {
      this.item = null;
    }
  }

  public String getTopic() {
    return this.topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public void unsetTopic() {
    this.topic = null;
  }

  /** Returns true if field topic is set (has been assigned a value) and false otherwise */
  public boolean isSetTopic() {
    return this.topic != null;
  }

  public void setTopicIsSet(boolean value) {
    if (!value) {
      this.topic = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ITEM:
      if (value == null) {
        unsetItem();
      } else {
        setItem((ByteBuffer)value);
      }
      break;

    case TOPIC:
      if (value == null) {
        unsetTopic();
      } else {
        setTopic((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ITEM:
      return getItem();

    case TOPIC:
      return getTopic();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ITEM:
      return isSetItem();
    case TOPIC:
      return isSetTopic();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProduceRequest)
      return this.equals((ProduceRequest)that);
    return false;
  }

  public boolean equals(ProduceRequest that) {
    if (that == null)
      return false;

    boolean this_present_item = true && this.isSetItem();
    boolean that_present_item = true && that.isSetItem();
    if (this_present_item || that_present_item) {
      if (!(this_present_item && that_present_item))
        return false;
      if (!this.item.equals(that.item))
        return false;
    }

    boolean this_present_topic = true && this.isSetTopic();
    boolean that_present_topic = true && that.isSetTopic();
    if (this_present_topic || that_present_topic) {
      if (!(this_present_topic && that_present_topic))
        return false;
      if (!this.topic.equals(that.topic))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ProduceRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ProduceRequest typedOther = (ProduceRequest)other;

    lastComparison = Boolean.valueOf(isSetItem()).compareTo(typedOther.isSetItem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.item, typedOther.item);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopic()).compareTo(typedOther.isSetTopic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topic, typedOther.topic);
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
        case 1: // ITEM
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.item = iprot.readBinary();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TOPIC
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.topic = iprot.readString();
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
    if (this.item != null) {
      oprot.writeFieldBegin(ITEM_FIELD_DESC);
      oprot.writeBinary(this.item);
      oprot.writeFieldEnd();
    }
    if (this.topic != null) {
      oprot.writeFieldBegin(TOPIC_FIELD_DESC);
      oprot.writeString(this.topic);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ProduceRequest(");
    boolean first = true;

    sb.append("item:");
    if (this.item == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.item, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topic:");
    if (this.topic == null) {
      sb.append("null");
    } else {
      sb.append(this.topic);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetItem()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'item' is unset! Struct:" + toString());
    }

    if (!isSetTopic()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topic' is unset! Struct:" + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

