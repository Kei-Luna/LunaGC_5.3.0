// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerCondMeetQuestListUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class ServerCondMeetQuestListUpdateNotifyOuterClass {
  private ServerCondMeetQuestListUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerCondMeetQuestListUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServerCondMeetQuestListUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 del_quest_id_list = 1;</code>
     * @return A list containing the delQuestIdList.
     */
    java.util.List<java.lang.Integer> getDelQuestIdListList();
    /**
     * <code>repeated uint32 del_quest_id_list = 1;</code>
     * @return The count of delQuestIdList.
     */
    int getDelQuestIdListCount();
    /**
     * <code>repeated uint32 del_quest_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The delQuestIdList at the given index.
     */
    int getDelQuestIdList(int index);

    /**
     * <code>repeated uint32 add_quest_id_list = 7;</code>
     * @return A list containing the addQuestIdList.
     */
    java.util.List<java.lang.Integer> getAddQuestIdListList();
    /**
     * <code>repeated uint32 add_quest_id_list = 7;</code>
     * @return The count of addQuestIdList.
     */
    int getAddQuestIdListCount();
    /**
     * <code>repeated uint32 add_quest_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The addQuestIdList at the given index.
     */
    int getAddQuestIdList(int index);
  }
  /**
   * Protobuf type {@code ServerCondMeetQuestListUpdateNotify}
   */
  public static final class ServerCondMeetQuestListUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ServerCondMeetQuestListUpdateNotify)
      ServerCondMeetQuestListUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServerCondMeetQuestListUpdateNotify.newBuilder() to construct.
    private ServerCondMeetQuestListUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerCondMeetQuestListUpdateNotify() {
      delQuestIdList_ = emptyIntList();
      addQuestIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ServerCondMeetQuestListUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServerCondMeetQuestListUpdateNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                delQuestIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              delQuestIdList_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                delQuestIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                delQuestIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 56: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                addQuestIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              addQuestIdList_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                addQuestIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                addQuestIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          delQuestIdList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          addQuestIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.class, emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.Builder.class);
    }

    public static final int DEL_QUEST_ID_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList delQuestIdList_;
    /**
     * <code>repeated uint32 del_quest_id_list = 1;</code>
     * @return A list containing the delQuestIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDelQuestIdListList() {
      return delQuestIdList_;
    }
    /**
     * <code>repeated uint32 del_quest_id_list = 1;</code>
     * @return The count of delQuestIdList.
     */
    public int getDelQuestIdListCount() {
      return delQuestIdList_.size();
    }
    /**
     * <code>repeated uint32 del_quest_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The delQuestIdList at the given index.
     */
    public int getDelQuestIdList(int index) {
      return delQuestIdList_.getInt(index);
    }
    private int delQuestIdListMemoizedSerializedSize = -1;

    public static final int ADD_QUEST_ID_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList addQuestIdList_;
    /**
     * <code>repeated uint32 add_quest_id_list = 7;</code>
     * @return A list containing the addQuestIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAddQuestIdListList() {
      return addQuestIdList_;
    }
    /**
     * <code>repeated uint32 add_quest_id_list = 7;</code>
     * @return The count of addQuestIdList.
     */
    public int getAddQuestIdListCount() {
      return addQuestIdList_.size();
    }
    /**
     * <code>repeated uint32 add_quest_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The addQuestIdList at the given index.
     */
    public int getAddQuestIdList(int index) {
      return addQuestIdList_.getInt(index);
    }
    private int addQuestIdListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getDelQuestIdListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(delQuestIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < delQuestIdList_.size(); i++) {
        output.writeUInt32NoTag(delQuestIdList_.getInt(i));
      }
      if (getAddQuestIdListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(addQuestIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < addQuestIdList_.size(); i++) {
        output.writeUInt32NoTag(addQuestIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < delQuestIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(delQuestIdList_.getInt(i));
        }
        size += dataSize;
        if (!getDelQuestIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        delQuestIdListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < addQuestIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(addQuestIdList_.getInt(i));
        }
        size += dataSize;
        if (!getAddQuestIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        addQuestIdListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify other = (emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify) obj;

      if (!getDelQuestIdListList()
          .equals(other.getDelQuestIdListList())) return false;
      if (!getAddQuestIdListList()
          .equals(other.getAddQuestIdListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getDelQuestIdListCount() > 0) {
        hash = (37 * hash) + DEL_QUEST_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDelQuestIdListList().hashCode();
      }
      if (getAddQuestIdListCount() > 0) {
        hash = (37 * hash) + ADD_QUEST_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAddQuestIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ServerCondMeetQuestListUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServerCondMeetQuestListUpdateNotify)
        emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.class, emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        delQuestIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        addQuestIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.internal_static_ServerCondMeetQuestListUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify build() {
        emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify result = new emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          delQuestIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.delQuestIdList_ = delQuestIdList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          addQuestIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.addQuestIdList_ = addQuestIdList_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify.getDefaultInstance()) return this;
        if (!other.delQuestIdList_.isEmpty()) {
          if (delQuestIdList_.isEmpty()) {
            delQuestIdList_ = other.delQuestIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDelQuestIdListIsMutable();
            delQuestIdList_.addAll(other.delQuestIdList_);
          }
          onChanged();
        }
        if (!other.addQuestIdList_.isEmpty()) {
          if (addQuestIdList_.isEmpty()) {
            addQuestIdList_ = other.addQuestIdList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAddQuestIdListIsMutable();
            addQuestIdList_.addAll(other.addQuestIdList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList delQuestIdList_ = emptyIntList();
      private void ensureDelQuestIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          delQuestIdList_ = mutableCopy(delQuestIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 del_quest_id_list = 1;</code>
       * @return A list containing the delQuestIdList.
       */
      public java.util.List<java.lang.Integer>
          getDelQuestIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(delQuestIdList_) : delQuestIdList_;
      }
      /**
       * <code>repeated uint32 del_quest_id_list = 1;</code>
       * @return The count of delQuestIdList.
       */
      public int getDelQuestIdListCount() {
        return delQuestIdList_.size();
      }
      /**
       * <code>repeated uint32 del_quest_id_list = 1;</code>
       * @param index The index of the element to return.
       * @return The delQuestIdList at the given index.
       */
      public int getDelQuestIdList(int index) {
        return delQuestIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 del_quest_id_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The delQuestIdList to set.
       * @return This builder for chaining.
       */
      public Builder setDelQuestIdList(
          int index, int value) {
        ensureDelQuestIdListIsMutable();
        delQuestIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_quest_id_list = 1;</code>
       * @param value The delQuestIdList to add.
       * @return This builder for chaining.
       */
      public Builder addDelQuestIdList(int value) {
        ensureDelQuestIdListIsMutable();
        delQuestIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_quest_id_list = 1;</code>
       * @param values The delQuestIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllDelQuestIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDelQuestIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, delQuestIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_quest_id_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDelQuestIdList() {
        delQuestIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList addQuestIdList_ = emptyIntList();
      private void ensureAddQuestIdListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          addQuestIdList_ = mutableCopy(addQuestIdList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 add_quest_id_list = 7;</code>
       * @return A list containing the addQuestIdList.
       */
      public java.util.List<java.lang.Integer>
          getAddQuestIdListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(addQuestIdList_) : addQuestIdList_;
      }
      /**
       * <code>repeated uint32 add_quest_id_list = 7;</code>
       * @return The count of addQuestIdList.
       */
      public int getAddQuestIdListCount() {
        return addQuestIdList_.size();
      }
      /**
       * <code>repeated uint32 add_quest_id_list = 7;</code>
       * @param index The index of the element to return.
       * @return The addQuestIdList at the given index.
       */
      public int getAddQuestIdList(int index) {
        return addQuestIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 add_quest_id_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The addQuestIdList to set.
       * @return This builder for chaining.
       */
      public Builder setAddQuestIdList(
          int index, int value) {
        ensureAddQuestIdListIsMutable();
        addQuestIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 add_quest_id_list = 7;</code>
       * @param value The addQuestIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAddQuestIdList(int value) {
        ensureAddQuestIdListIsMutable();
        addQuestIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 add_quest_id_list = 7;</code>
       * @param values The addQuestIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAddQuestIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAddQuestIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, addQuestIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 add_quest_id_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddQuestIdList() {
        addQuestIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ServerCondMeetQuestListUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:ServerCondMeetQuestListUpdateNotify)
    private static final emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify();
    }

    public static emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerCondMeetQuestListUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<ServerCondMeetQuestListUpdateNotify>() {
      @java.lang.Override
      public ServerCondMeetQuestListUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerCondMeetQuestListUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServerCondMeetQuestListUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerCondMeetQuestListUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ServerCondMeetQuestListUpdateNotifyOuterClass.ServerCondMeetQuestListUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerCondMeetQuestListUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerCondMeetQuestListUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)ServerCondMeetQuestListUpdateNotify.pr" +
      "oto\"[\n#ServerCondMeetQuestListUpdateNoti" +
      "fy\022\031\n\021del_quest_id_list\030\001 \003(\r\022\031\n\021add_que" +
      "st_id_list\030\007 \003(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ServerCondMeetQuestListUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServerCondMeetQuestListUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerCondMeetQuestListUpdateNotify_descriptor,
        new java.lang.String[] { "DelQuestIdList", "AddQuestIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
