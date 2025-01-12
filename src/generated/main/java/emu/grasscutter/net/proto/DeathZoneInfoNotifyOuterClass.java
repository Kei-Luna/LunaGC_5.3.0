// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DeathZoneInfoNotify.proto

package emu.grasscutter.net.proto;

public final class DeathZoneInfoNotifyOuterClass {
  private DeathZoneInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DeathZoneInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DeathZoneInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo> 
        getDeathZoneInfoListList();
    /**
     * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
     */
    emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo getDeathZoneInfoList(int index);
    /**
     * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
     */
    int getDeathZoneInfoListCount();
    /**
     * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfoOrBuilder> 
        getDeathZoneInfoListOrBuilderList();
    /**
     * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
     */
    emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfoOrBuilder getDeathZoneInfoListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code DeathZoneInfoNotify}
   */
  public static final class DeathZoneInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DeathZoneInfoNotify)
      DeathZoneInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DeathZoneInfoNotify.newBuilder() to construct.
    private DeathZoneInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DeathZoneInfoNotify() {
      deathZoneInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DeathZoneInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DeathZoneInfoNotify(
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
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                deathZoneInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              deathZoneInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.parser(), extensionRegistry));
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
          deathZoneInfoList_ = java.util.Collections.unmodifiableList(deathZoneInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.internal_static_DeathZoneInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.internal_static_DeathZoneInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify.class, emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify.Builder.class);
    }

    public static final int DEATH_ZONE_INFO_LIST_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo> deathZoneInfoList_;
    /**
     * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo> getDeathZoneInfoListList() {
      return deathZoneInfoList_;
    }
    /**
     * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfoOrBuilder> 
        getDeathZoneInfoListOrBuilderList() {
      return deathZoneInfoList_;
    }
    /**
     * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
     */
    @java.lang.Override
    public int getDeathZoneInfoListCount() {
      return deathZoneInfoList_.size();
    }
    /**
     * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo getDeathZoneInfoList(int index) {
      return deathZoneInfoList_.get(index);
    }
    /**
     * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfoOrBuilder getDeathZoneInfoListOrBuilder(
        int index) {
      return deathZoneInfoList_.get(index);
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
      for (int i = 0; i < deathZoneInfoList_.size(); i++) {
        output.writeMessage(12, deathZoneInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < deathZoneInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, deathZoneInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify other = (emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify) obj;

      if (!getDeathZoneInfoListList()
          .equals(other.getDeathZoneInfoListList())) return false;
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
      if (getDeathZoneInfoListCount() > 0) {
        hash = (37 * hash) + DEATH_ZONE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDeathZoneInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify prototype) {
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
     * Protobuf type {@code DeathZoneInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DeathZoneInfoNotify)
        emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.internal_static_DeathZoneInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.internal_static_DeathZoneInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify.class, emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify.newBuilder()
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
          getDeathZoneInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (deathZoneInfoListBuilder_ == null) {
          deathZoneInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          deathZoneInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.internal_static_DeathZoneInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify build() {
        emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify buildPartial() {
        emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify result = new emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify(this);
        int from_bitField0_ = bitField0_;
        if (deathZoneInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            deathZoneInfoList_ = java.util.Collections.unmodifiableList(deathZoneInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.deathZoneInfoList_ = deathZoneInfoList_;
        } else {
          result.deathZoneInfoList_ = deathZoneInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify other) {
        if (other == emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify.getDefaultInstance()) return this;
        if (deathZoneInfoListBuilder_ == null) {
          if (!other.deathZoneInfoList_.isEmpty()) {
            if (deathZoneInfoList_.isEmpty()) {
              deathZoneInfoList_ = other.deathZoneInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDeathZoneInfoListIsMutable();
              deathZoneInfoList_.addAll(other.deathZoneInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.deathZoneInfoList_.isEmpty()) {
            if (deathZoneInfoListBuilder_.isEmpty()) {
              deathZoneInfoListBuilder_.dispose();
              deathZoneInfoListBuilder_ = null;
              deathZoneInfoList_ = other.deathZoneInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              deathZoneInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDeathZoneInfoListFieldBuilder() : null;
            } else {
              deathZoneInfoListBuilder_.addAllMessages(other.deathZoneInfoList_);
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
        emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo> deathZoneInfoList_ =
        java.util.Collections.emptyList();
      private void ensureDeathZoneInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          deathZoneInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo>(deathZoneInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo, emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.Builder, emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfoOrBuilder> deathZoneInfoListBuilder_;

      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo> getDeathZoneInfoListList() {
        if (deathZoneInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(deathZoneInfoList_);
        } else {
          return deathZoneInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public int getDeathZoneInfoListCount() {
        if (deathZoneInfoListBuilder_ == null) {
          return deathZoneInfoList_.size();
        } else {
          return deathZoneInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo getDeathZoneInfoList(int index) {
        if (deathZoneInfoListBuilder_ == null) {
          return deathZoneInfoList_.get(index);
        } else {
          return deathZoneInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public Builder setDeathZoneInfoList(
          int index, emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo value) {
        if (deathZoneInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeathZoneInfoListIsMutable();
          deathZoneInfoList_.set(index, value);
          onChanged();
        } else {
          deathZoneInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public Builder setDeathZoneInfoList(
          int index, emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.Builder builderForValue) {
        if (deathZoneInfoListBuilder_ == null) {
          ensureDeathZoneInfoListIsMutable();
          deathZoneInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          deathZoneInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public Builder addDeathZoneInfoList(emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo value) {
        if (deathZoneInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeathZoneInfoListIsMutable();
          deathZoneInfoList_.add(value);
          onChanged();
        } else {
          deathZoneInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public Builder addDeathZoneInfoList(
          int index, emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo value) {
        if (deathZoneInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeathZoneInfoListIsMutable();
          deathZoneInfoList_.add(index, value);
          onChanged();
        } else {
          deathZoneInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public Builder addDeathZoneInfoList(
          emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.Builder builderForValue) {
        if (deathZoneInfoListBuilder_ == null) {
          ensureDeathZoneInfoListIsMutable();
          deathZoneInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          deathZoneInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public Builder addDeathZoneInfoList(
          int index, emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.Builder builderForValue) {
        if (deathZoneInfoListBuilder_ == null) {
          ensureDeathZoneInfoListIsMutable();
          deathZoneInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          deathZoneInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public Builder addAllDeathZoneInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo> values) {
        if (deathZoneInfoListBuilder_ == null) {
          ensureDeathZoneInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, deathZoneInfoList_);
          onChanged();
        } else {
          deathZoneInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public Builder clearDeathZoneInfoList() {
        if (deathZoneInfoListBuilder_ == null) {
          deathZoneInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          deathZoneInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public Builder removeDeathZoneInfoList(int index) {
        if (deathZoneInfoListBuilder_ == null) {
          ensureDeathZoneInfoListIsMutable();
          deathZoneInfoList_.remove(index);
          onChanged();
        } else {
          deathZoneInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.Builder getDeathZoneInfoListBuilder(
          int index) {
        return getDeathZoneInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfoOrBuilder getDeathZoneInfoListOrBuilder(
          int index) {
        if (deathZoneInfoListBuilder_ == null) {
          return deathZoneInfoList_.get(index);  } else {
          return deathZoneInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfoOrBuilder> 
           getDeathZoneInfoListOrBuilderList() {
        if (deathZoneInfoListBuilder_ != null) {
          return deathZoneInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(deathZoneInfoList_);
        }
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.Builder addDeathZoneInfoListBuilder() {
        return getDeathZoneInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.Builder addDeathZoneInfoListBuilder(
          int index) {
        return getDeathZoneInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .DeathZoneInfo death_zone_info_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.Builder> 
           getDeathZoneInfoListBuilderList() {
        return getDeathZoneInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo, emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.Builder, emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfoOrBuilder> 
          getDeathZoneInfoListFieldBuilder() {
        if (deathZoneInfoListBuilder_ == null) {
          deathZoneInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo, emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfo.Builder, emu.grasscutter.net.proto.DeathZoneInfoOuterClass.DeathZoneInfoOrBuilder>(
                  deathZoneInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          deathZoneInfoList_ = null;
        }
        return deathZoneInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DeathZoneInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:DeathZoneInfoNotify)
    private static final emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify();
    }

    public static emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DeathZoneInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<DeathZoneInfoNotify>() {
      @java.lang.Override
      public DeathZoneInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeathZoneInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DeathZoneInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DeathZoneInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DeathZoneInfoNotifyOuterClass.DeathZoneInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeathZoneInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeathZoneInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031DeathZoneInfoNotify.proto\032\023DeathZoneIn" +
      "fo.proto\"C\n\023DeathZoneInfoNotify\022,\n\024death" +
      "_zone_info_list\030\014 \003(\0132\016.DeathZoneInfoB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.DeathZoneInfoOuterClass.getDescriptor(),
        });
    internal_static_DeathZoneInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DeathZoneInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeathZoneInfoNotify_descriptor,
        new java.lang.String[] { "DeathZoneInfoList", });
    emu.grasscutter.net.proto.DeathZoneInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
