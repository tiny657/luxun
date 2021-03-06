/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.leansoft.luxun.message.generated;

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

/**
 * FOR INTERNAL USE, DO NOT CHANGE!
 * 
 * A package of a list of messages. The format of an N bytes package is the following:
 * 
 * current magic byte is 1
 * 
 * 1. 1 byte "magic" identifier to allow format changes
 * 2. 1 byte "attribute" identifier to allow annotations on the package
 *      independent of the version (e.g. compression enabled, type of codec used)
 * 3. 4 bytes CRC32 of the payload
 * 4. N bytes messageList, thrift serialized MessageList, may be compressed according to attribute setting
 */
public class TMessagePack implements org.apache.thrift.TBase<TMessagePack, TMessagePack._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMessagePack");

  private static final org.apache.thrift.protocol.TField MAGIC_FIELD_DESC = new org.apache.thrift.protocol.TField("magic", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField ATTRIBUTE_FIELD_DESC = new org.apache.thrift.protocol.TField("attribute", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField CRC32_FIELD_DESC = new org.apache.thrift.protocol.TField("crc32", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField MESSAGE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("messageList", org.apache.thrift.protocol.TType.STRING, (short)4);

  private byte magic;
  private byte attribute;
  private int crc32;
  private ByteBuffer messageList;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MAGIC((short)1, "magic"),
    ATTRIBUTE((short)2, "attribute"),
    CRC32((short)3, "crc32"),
    MESSAGE_LIST((short)4, "messageList");

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
        case 1: // MAGIC
          return MAGIC;
        case 2: // ATTRIBUTE
          return ATTRIBUTE;
        case 3: // CRC32
          return CRC32;
        case 4: // MESSAGE_LIST
          return MESSAGE_LIST;
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
  private static final int __MAGIC_ISSET_ID = 0;
  private static final int __ATTRIBUTE_ISSET_ID = 1;
  private static final int __CRC32_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAGIC, new org.apache.thrift.meta_data.FieldMetaData("magic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.ATTRIBUTE, new org.apache.thrift.meta_data.FieldMetaData("attribute", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.CRC32, new org.apache.thrift.meta_data.FieldMetaData("crc32", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MESSAGE_LIST, new org.apache.thrift.meta_data.FieldMetaData("messageList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMessagePack.class, metaDataMap);
  }

  public TMessagePack() {
    this.magic = (byte)1;

  }

  public TMessagePack(
    byte magic,
    byte attribute,
    int crc32,
    ByteBuffer messageList)
  {
    this();
    this.magic = magic;
    setMagicIsSet(true);
    this.attribute = attribute;
    setAttributeIsSet(true);
    this.crc32 = crc32;
    setCrc32IsSet(true);
    this.messageList = messageList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMessagePack(TMessagePack other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.magic = other.magic;
    this.attribute = other.attribute;
    this.crc32 = other.crc32;
    if (other.isSetMessageList()) {
      this.messageList = org.apache.thrift.TBaseHelper.copyBinary(other.messageList);
;
    }
  }

  public TMessagePack deepCopy() {
    return new TMessagePack(this);
  }

  @Override
  public void clear() {
    this.magic = (byte)1;

    setAttributeIsSet(false);
    this.attribute = 0;
    setCrc32IsSet(false);
    this.crc32 = 0;
    this.messageList = null;
  }

  public byte getMagic() {
    return this.magic;
  }

  public void setMagic(byte magic) {
    this.magic = magic;
    setMagicIsSet(true);
  }

  public void unsetMagic() {
    __isset_bit_vector.clear(__MAGIC_ISSET_ID);
  }

  /** Returns true if field magic is set (has been assigned a value) and false otherwise */
  public boolean isSetMagic() {
    return __isset_bit_vector.get(__MAGIC_ISSET_ID);
  }

  public void setMagicIsSet(boolean value) {
    __isset_bit_vector.set(__MAGIC_ISSET_ID, value);
  }

  public byte getAttribute() {
    return this.attribute;
  }

  public void setAttribute(byte attribute) {
    this.attribute = attribute;
    setAttributeIsSet(true);
  }

  public void unsetAttribute() {
    __isset_bit_vector.clear(__ATTRIBUTE_ISSET_ID);
  }

  /** Returns true if field attribute is set (has been assigned a value) and false otherwise */
  public boolean isSetAttribute() {
    return __isset_bit_vector.get(__ATTRIBUTE_ISSET_ID);
  }

  public void setAttributeIsSet(boolean value) {
    __isset_bit_vector.set(__ATTRIBUTE_ISSET_ID, value);
  }

  public int getCrc32() {
    return this.crc32;
  }

  public void setCrc32(int crc32) {
    this.crc32 = crc32;
    setCrc32IsSet(true);
  }

  public void unsetCrc32() {
    __isset_bit_vector.clear(__CRC32_ISSET_ID);
  }

  /** Returns true if field crc32 is set (has been assigned a value) and false otherwise */
  public boolean isSetCrc32() {
    return __isset_bit_vector.get(__CRC32_ISSET_ID);
  }

  public void setCrc32IsSet(boolean value) {
    __isset_bit_vector.set(__CRC32_ISSET_ID, value);
  }

  public byte[] getMessageList() {
    setMessageList(org.apache.thrift.TBaseHelper.rightSize(messageList));
    return messageList == null ? null : messageList.array();
  }

  public ByteBuffer bufferForMessageList() {
    return messageList;
  }

  public void setMessageList(byte[] messageList) {
    setMessageList(messageList == null ? (ByteBuffer)null : ByteBuffer.wrap(messageList));
  }

  public void setMessageList(ByteBuffer messageList) {
    this.messageList = messageList;
  }

  public void unsetMessageList() {
    this.messageList = null;
  }

  /** Returns true if field messageList is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageList() {
    return this.messageList != null;
  }

  public void setMessageListIsSet(boolean value) {
    if (!value) {
      this.messageList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MAGIC:
      if (value == null) {
        unsetMagic();
      } else {
        setMagic((Byte)value);
      }
      break;

    case ATTRIBUTE:
      if (value == null) {
        unsetAttribute();
      } else {
        setAttribute((Byte)value);
      }
      break;

    case CRC32:
      if (value == null) {
        unsetCrc32();
      } else {
        setCrc32((Integer)value);
      }
      break;

    case MESSAGE_LIST:
      if (value == null) {
        unsetMessageList();
      } else {
        setMessageList((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MAGIC:
      return new Byte(getMagic());

    case ATTRIBUTE:
      return new Byte(getAttribute());

    case CRC32:
      return new Integer(getCrc32());

    case MESSAGE_LIST:
      return getMessageList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MAGIC:
      return isSetMagic();
    case ATTRIBUTE:
      return isSetAttribute();
    case CRC32:
      return isSetCrc32();
    case MESSAGE_LIST:
      return isSetMessageList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TMessagePack)
      return this.equals((TMessagePack)that);
    return false;
  }

  public boolean equals(TMessagePack that) {
    if (that == null)
      return false;

    boolean this_present_magic = true;
    boolean that_present_magic = true;
    if (this_present_magic || that_present_magic) {
      if (!(this_present_magic && that_present_magic))
        return false;
      if (this.magic != that.magic)
        return false;
    }

    boolean this_present_attribute = true;
    boolean that_present_attribute = true;
    if (this_present_attribute || that_present_attribute) {
      if (!(this_present_attribute && that_present_attribute))
        return false;
      if (this.attribute != that.attribute)
        return false;
    }

    boolean this_present_crc32 = true;
    boolean that_present_crc32 = true;
    if (this_present_crc32 || that_present_crc32) {
      if (!(this_present_crc32 && that_present_crc32))
        return false;
      if (this.crc32 != that.crc32)
        return false;
    }

    boolean this_present_messageList = true && this.isSetMessageList();
    boolean that_present_messageList = true && that.isSetMessageList();
    if (this_present_messageList || that_present_messageList) {
      if (!(this_present_messageList && that_present_messageList))
        return false;
      if (!this.messageList.equals(that.messageList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TMessagePack other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TMessagePack typedOther = (TMessagePack)other;

    lastComparison = Boolean.valueOf(isSetMagic()).compareTo(typedOther.isSetMagic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMagic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.magic, typedOther.magic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttribute()).compareTo(typedOther.isSetAttribute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttribute()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attribute, typedOther.attribute);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCrc32()).compareTo(typedOther.isSetCrc32());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCrc32()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.crc32, typedOther.crc32);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageList()).compareTo(typedOther.isSetMessageList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageList, typedOther.messageList);
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
        case 1: // MAGIC
          if (field.type == org.apache.thrift.protocol.TType.BYTE) {
            this.magic = iprot.readByte();
            setMagicIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ATTRIBUTE
          if (field.type == org.apache.thrift.protocol.TType.BYTE) {
            this.attribute = iprot.readByte();
            setAttributeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // CRC32
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.crc32 = iprot.readI32();
            setCrc32IsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // MESSAGE_LIST
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.messageList = iprot.readBinary();
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
    oprot.writeFieldBegin(MAGIC_FIELD_DESC);
    oprot.writeByte(this.magic);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ATTRIBUTE_FIELD_DESC);
    oprot.writeByte(this.attribute);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(CRC32_FIELD_DESC);
    oprot.writeI32(this.crc32);
    oprot.writeFieldEnd();
    if (this.messageList != null) {
      oprot.writeFieldBegin(MESSAGE_LIST_FIELD_DESC);
      oprot.writeBinary(this.messageList);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TMessagePack(");
    boolean first = true;

    sb.append("magic:");
    sb.append(this.magic);
    first = false;
    if (!first) sb.append(", ");
    sb.append("attribute:");
    sb.append(this.attribute);
    first = false;
    if (!first) sb.append(", ");
    sb.append("crc32:");
    sb.append(this.crc32);
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageList:");
    if (this.messageList == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.messageList, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetMessageList()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'messageList' is unset! Struct:" + toString());
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

