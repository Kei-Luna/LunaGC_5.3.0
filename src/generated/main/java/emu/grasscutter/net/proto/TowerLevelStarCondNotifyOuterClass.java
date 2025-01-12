// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerLevelStarCondNotify.proto

package emu.grasscutter.net.proto;

public final class TowerLevelStarCondNotifyOuterClass {
  private TowerLevelStarCondNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerLevelStarCondNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerLevelStarCondNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_index = 7;</code>
     * @return The levelIndex.
     */
    int getLevelIndex();

    /**
     * <code>uint32 floor_id = 8;</code>
     * @return The floorId.
     */
    int getFloorId();

    /**
     * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
     */
    java.util.List<emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData> 
        getCondDataListList();
    /**
     * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
     */
    emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getCondDataList(int index);
    /**
     * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
     */
    int getCondDataListCount();
    /**
     * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder> 
        getCondDataListOrBuilderList();
    /**
     * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
     */
    emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder getCondDataListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code TowerLevelStarCondNotify}
   */
  public static final class TowerLevelStarCondNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerLevelStarCondNotify)
      TowerLevelStarCondNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerLevelStarCondNotify.newBuilder() to construct.
    private TowerLevelStarCondNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerLevelStarCondNotify() {
      condDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerLevelStarCondNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerLevelStarCondNotify(
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
            case 56: {

              levelIndex_ = input.readUInt32();
              break;
            }
            case 64: {

              floorId_ = input.readUInt32();
              break;
            }
            case 106: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                condDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData>();
                mutable_bitField0_ |= 0x00000001;
              }
              condDataList_.add(
                  input.readMessage(emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.parser(), extensionRegistry));
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
          condDataList_ = java.util.Collections.unmodifiableList(condDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.internal_static_TowerLevelStarCondNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.internal_static_TowerLevelStarCondNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify.class, emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify.Builder.class);
    }

    public static final int LEVEL_INDEX_FIELD_NUMBER = 7;
    private int levelIndex_;
    /**
     * <code>uint32 level_index = 7;</code>
     * @return The levelIndex.
     */
    @java.lang.Override
    public int getLevelIndex() {
      return levelIndex_;
    }

    public static final int FLOOR_ID_FIELD_NUMBER = 8;
    private int floorId_;
    /**
     * <code>uint32 floor_id = 8;</code>
     * @return The floorId.
     */
    @java.lang.Override
    public int getFloorId() {
      return floorId_;
    }

    public static final int COND_DATA_LIST_FIELD_NUMBER = 13;
    private java.util.List<emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData> condDataList_;
    /**
     * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData> getCondDataListList() {
      return condDataList_;
    }
    /**
     * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder> 
        getCondDataListOrBuilderList() {
      return condDataList_;
    }
    /**
     * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
     */
    @java.lang.Override
    public int getCondDataListCount() {
      return condDataList_.size();
    }
    /**
     * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getCondDataList(int index) {
      return condDataList_.get(index);
    }
    /**
     * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder getCondDataListOrBuilder(
        int index) {
      return condDataList_.get(index);
    }

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
      if (levelIndex_ != 0) {
        output.writeUInt32(7, levelIndex_);
      }
      if (floorId_ != 0) {
        output.writeUInt32(8, floorId_);
      }
      for (int i = 0; i < condDataList_.size(); i++) {
        output.writeMessage(13, condDataList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, levelIndex_);
      }
      if (floorId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, floorId_);
      }
      for (int i = 0; i < condDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, condDataList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify other = (emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify) obj;

      if (getLevelIndex()
          != other.getLevelIndex()) return false;
      if (getFloorId()
          != other.getFloorId()) return false;
      if (!getCondDataListList()
          .equals(other.getCondDataListList())) return false;
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
      hash = (37 * hash) + LEVEL_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getLevelIndex();
      hash = (37 * hash) + FLOOR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFloorId();
      if (getCondDataListCount() > 0) {
        hash = (37 * hash) + COND_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCondDataListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify prototype) {
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
     * Protobuf type {@code TowerLevelStarCondNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerLevelStarCondNotify)
        emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.internal_static_TowerLevelStarCondNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.internal_static_TowerLevelStarCondNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify.class, emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify.newBuilder()
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
          getCondDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        levelIndex_ = 0;

        floorId_ = 0;

        if (condDataListBuilder_ == null) {
          condDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          condDataListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.internal_static_TowerLevelStarCondNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify build() {
        emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify buildPartial() {
        emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify result = new emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify(this);
        int from_bitField0_ = bitField0_;
        result.levelIndex_ = levelIndex_;
        result.floorId_ = floorId_;
        if (condDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            condDataList_ = java.util.Collections.unmodifiableList(condDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.condDataList_ = condDataList_;
        } else {
          result.condDataList_ = condDataListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify) {
          return mergeFrom((emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify other) {
        if (other == emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify.getDefaultInstance()) return this;
        if (other.getLevelIndex() != 0) {
          setLevelIndex(other.getLevelIndex());
        }
        if (other.getFloorId() != 0) {
          setFloorId(other.getFloorId());
        }
        if (condDataListBuilder_ == null) {
          if (!other.condDataList_.isEmpty()) {
            if (condDataList_.isEmpty()) {
              condDataList_ = other.condDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCondDataListIsMutable();
              condDataList_.addAll(other.condDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.condDataList_.isEmpty()) {
            if (condDataListBuilder_.isEmpty()) {
              condDataListBuilder_.dispose();
              condDataListBuilder_ = null;
              condDataList_ = other.condDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              condDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCondDataListFieldBuilder() : null;
            } else {
              condDataListBuilder_.addAllMessages(other.condDataList_);
            }
          }
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
        emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int levelIndex_ ;
      /**
       * <code>uint32 level_index = 7;</code>
       * @return The levelIndex.
       */
      @java.lang.Override
      public int getLevelIndex() {
        return levelIndex_;
      }
      /**
       * <code>uint32 level_index = 7;</code>
       * @param value The levelIndex to set.
       * @return This builder for chaining.
       */
      public Builder setLevelIndex(int value) {
        
        levelIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_index = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelIndex() {
        
        levelIndex_ = 0;
        onChanged();
        return this;
      }

      private int floorId_ ;
      /**
       * <code>uint32 floor_id = 8;</code>
       * @return The floorId.
       */
      @java.lang.Override
      public int getFloorId() {
        return floorId_;
      }
      /**
       * <code>uint32 floor_id = 8;</code>
       * @param value The floorId to set.
       * @return This builder for chaining.
       */
      public Builder setFloorId(int value) {
        
        floorId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 floor_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearFloorId() {
        
        floorId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData> condDataList_ =
        java.util.Collections.emptyList();
      private void ensureCondDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          condDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData>(condDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder> condDataListBuilder_;

      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData> getCondDataListList() {
        if (condDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(condDataList_);
        } else {
          return condDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public int getCondDataListCount() {
        if (condDataListBuilder_ == null) {
          return condDataList_.size();
        } else {
          return condDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getCondDataList(int index) {
        if (condDataListBuilder_ == null) {
          return condDataList_.get(index);
        } else {
          return condDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public Builder setCondDataList(
          int index, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData value) {
        if (condDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCondDataListIsMutable();
          condDataList_.set(index, value);
          onChanged();
        } else {
          condDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public Builder setCondDataList(
          int index, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder builderForValue) {
        if (condDataListBuilder_ == null) {
          ensureCondDataListIsMutable();
          condDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          condDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public Builder addCondDataList(emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData value) {
        if (condDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCondDataListIsMutable();
          condDataList_.add(value);
          onChanged();
        } else {
          condDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public Builder addCondDataList(
          int index, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData value) {
        if (condDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCondDataListIsMutable();
          condDataList_.add(index, value);
          onChanged();
        } else {
          condDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public Builder addCondDataList(
          emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder builderForValue) {
        if (condDataListBuilder_ == null) {
          ensureCondDataListIsMutable();
          condDataList_.add(builderForValue.build());
          onChanged();
        } else {
          condDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public Builder addCondDataList(
          int index, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder builderForValue) {
        if (condDataListBuilder_ == null) {
          ensureCondDataListIsMutable();
          condDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          condDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public Builder addAllCondDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData> values) {
        if (condDataListBuilder_ == null) {
          ensureCondDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, condDataList_);
          onChanged();
        } else {
          condDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public Builder clearCondDataList() {
        if (condDataListBuilder_ == null) {
          condDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          condDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public Builder removeCondDataList(int index) {
        if (condDataListBuilder_ == null) {
          ensureCondDataListIsMutable();
          condDataList_.remove(index);
          onChanged();
        } else {
          condDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder getCondDataListBuilder(
          int index) {
        return getCondDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder getCondDataListOrBuilder(
          int index) {
        if (condDataListBuilder_ == null) {
          return condDataList_.get(index);  } else {
          return condDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder> 
           getCondDataListOrBuilderList() {
        if (condDataListBuilder_ != null) {
          return condDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(condDataList_);
        }
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder addCondDataListBuilder() {
        return getCondDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.getDefaultInstance());
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder addCondDataListBuilder(
          int index) {
        return getCondDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.getDefaultInstance());
      }
      /**
       * <code>repeated .TowerLevelStarCondData cond_data_list = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder> 
           getCondDataListBuilderList() {
        return getCondDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder> 
          getCondDataListFieldBuilder() {
        if (condDataListBuilder_ == null) {
          condDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder>(
                  condDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          condDataList_ = null;
        }
        return condDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TowerLevelStarCondNotify)
    }

    // @@protoc_insertion_point(class_scope:TowerLevelStarCondNotify)
    private static final emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify();
    }

    public static emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerLevelStarCondNotify>
        PARSER = new com.google.protobuf.AbstractParser<TowerLevelStarCondNotify>() {
      @java.lang.Override
      public TowerLevelStarCondNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerLevelStarCondNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerLevelStarCondNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerLevelStarCondNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerLevelStarCondNotifyOuterClass.TowerLevelStarCondNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerLevelStarCondNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerLevelStarCondNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036TowerLevelStarCondNotify.proto\032\034TowerL" +
      "evelStarCondData.proto\"r\n\030TowerLevelStar" +
      "CondNotify\022\023\n\013level_index\030\007 \001(\r\022\020\n\010floor" +
      "_id\030\010 \001(\r\022/\n\016cond_data_list\030\r \003(\0132\027.Towe" +
      "rLevelStarCondDataB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.getDescriptor(),
        });
    internal_static_TowerLevelStarCondNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerLevelStarCondNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerLevelStarCondNotify_descriptor,
        new java.lang.String[] { "LevelIndex", "FloorId", "CondDataList", });
    emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
