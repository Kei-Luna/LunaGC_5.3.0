// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReliquaryFilterStateNotify.proto

package emu.grasscutter.net.proto;

public final class ReliquaryFilterStateNotifyOuterClass {
  private ReliquaryFilterStateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReliquaryFilterStateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReliquaryFilterStateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> 
        getReliquaryFilterStateMapList();
    /**
     * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
     */
    emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair getReliquaryFilterStateMap(int index);
    /**
     * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
     */
    int getReliquaryFilterStateMapCount();
    /**
     * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder> 
        getReliquaryFilterStateMapOrBuilderList();
    /**
     * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
     */
    emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder getReliquaryFilterStateMapOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ReliquaryFilterStateNotify}
   */
  public static final class ReliquaryFilterStateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReliquaryFilterStateNotify)
      ReliquaryFilterStateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReliquaryFilterStateNotify.newBuilder() to construct.
    private ReliquaryFilterStateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReliquaryFilterStateNotify() {
      reliquaryFilterStateMap_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReliquaryFilterStateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReliquaryFilterStateNotify(
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
                reliquaryFilterStateMap_ = new java.util.ArrayList<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair>();
                mutable_bitField0_ |= 0x00000001;
              }
              reliquaryFilterStateMap_.add(
                  input.readMessage(emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.parser(), extensionRegistry));
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
          reliquaryFilterStateMap_ = java.util.Collections.unmodifiableList(reliquaryFilterStateMap_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.class, emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.Builder.class);
    }

    public static final int RELIQUARY_FILTER_STATE_MAP_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> reliquaryFilterStateMap_;
    /**
     * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> getReliquaryFilterStateMapList() {
      return reliquaryFilterStateMap_;
    }
    /**
     * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder> 
        getReliquaryFilterStateMapOrBuilderList() {
      return reliquaryFilterStateMap_;
    }
    /**
     * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
     */
    @java.lang.Override
    public int getReliquaryFilterStateMapCount() {
      return reliquaryFilterStateMap_.size();
    }
    /**
     * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair getReliquaryFilterStateMap(int index) {
      return reliquaryFilterStateMap_.get(index);
    }
    /**
     * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder getReliquaryFilterStateMapOrBuilder(
        int index) {
      return reliquaryFilterStateMap_.get(index);
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
      for (int i = 0; i < reliquaryFilterStateMap_.size(); i++) {
        output.writeMessage(12, reliquaryFilterStateMap_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < reliquaryFilterStateMap_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, reliquaryFilterStateMap_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify other = (emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify) obj;

      if (!getReliquaryFilterStateMapList()
          .equals(other.getReliquaryFilterStateMapList())) return false;
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
      if (getReliquaryFilterStateMapCount() > 0) {
        hash = (37 * hash) + RELIQUARY_FILTER_STATE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + getReliquaryFilterStateMapList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify prototype) {
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
     * Protobuf type {@code ReliquaryFilterStateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReliquaryFilterStateNotify)
        emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.class, emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.newBuilder()
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
          getReliquaryFilterStateMapFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (reliquaryFilterStateMapBuilder_ == null) {
          reliquaryFilterStateMap_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          reliquaryFilterStateMapBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.internal_static_ReliquaryFilterStateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify build() {
        emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify buildPartial() {
        emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify result = new emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify(this);
        int from_bitField0_ = bitField0_;
        if (reliquaryFilterStateMapBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            reliquaryFilterStateMap_ = java.util.Collections.unmodifiableList(reliquaryFilterStateMap_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.reliquaryFilterStateMap_ = reliquaryFilterStateMap_;
        } else {
          result.reliquaryFilterStateMap_ = reliquaryFilterStateMapBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify other) {
        if (other == emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify.getDefaultInstance()) return this;
        if (reliquaryFilterStateMapBuilder_ == null) {
          if (!other.reliquaryFilterStateMap_.isEmpty()) {
            if (reliquaryFilterStateMap_.isEmpty()) {
              reliquaryFilterStateMap_ = other.reliquaryFilterStateMap_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureReliquaryFilterStateMapIsMutable();
              reliquaryFilterStateMap_.addAll(other.reliquaryFilterStateMap_);
            }
            onChanged();
          }
        } else {
          if (!other.reliquaryFilterStateMap_.isEmpty()) {
            if (reliquaryFilterStateMapBuilder_.isEmpty()) {
              reliquaryFilterStateMapBuilder_.dispose();
              reliquaryFilterStateMapBuilder_ = null;
              reliquaryFilterStateMap_ = other.reliquaryFilterStateMap_;
              bitField0_ = (bitField0_ & ~0x00000001);
              reliquaryFilterStateMapBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getReliquaryFilterStateMapFieldBuilder() : null;
            } else {
              reliquaryFilterStateMapBuilder_.addAllMessages(other.reliquaryFilterStateMap_);
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
        emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> reliquaryFilterStateMap_ =
        java.util.Collections.emptyList();
      private void ensureReliquaryFilterStateMapIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          reliquaryFilterStateMap_ = new java.util.ArrayList<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair>(reliquaryFilterStateMap_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder> reliquaryFilterStateMapBuilder_;

      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> getReliquaryFilterStateMapList() {
        if (reliquaryFilterStateMapBuilder_ == null) {
          return java.util.Collections.unmodifiableList(reliquaryFilterStateMap_);
        } else {
          return reliquaryFilterStateMapBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public int getReliquaryFilterStateMapCount() {
        if (reliquaryFilterStateMapBuilder_ == null) {
          return reliquaryFilterStateMap_.size();
        } else {
          return reliquaryFilterStateMapBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair getReliquaryFilterStateMap(int index) {
        if (reliquaryFilterStateMapBuilder_ == null) {
          return reliquaryFilterStateMap_.get(index);
        } else {
          return reliquaryFilterStateMapBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public Builder setReliquaryFilterStateMap(
          int index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair value) {
        if (reliquaryFilterStateMapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReliquaryFilterStateMapIsMutable();
          reliquaryFilterStateMap_.set(index, value);
          onChanged();
        } else {
          reliquaryFilterStateMapBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public Builder setReliquaryFilterStateMap(
          int index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (reliquaryFilterStateMapBuilder_ == null) {
          ensureReliquaryFilterStateMapIsMutable();
          reliquaryFilterStateMap_.set(index, builderForValue.build());
          onChanged();
        } else {
          reliquaryFilterStateMapBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public Builder addReliquaryFilterStateMap(emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair value) {
        if (reliquaryFilterStateMapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReliquaryFilterStateMapIsMutable();
          reliquaryFilterStateMap_.add(value);
          onChanged();
        } else {
          reliquaryFilterStateMapBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public Builder addReliquaryFilterStateMap(
          int index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair value) {
        if (reliquaryFilterStateMapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReliquaryFilterStateMapIsMutable();
          reliquaryFilterStateMap_.add(index, value);
          onChanged();
        } else {
          reliquaryFilterStateMapBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public Builder addReliquaryFilterStateMap(
          emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (reliquaryFilterStateMapBuilder_ == null) {
          ensureReliquaryFilterStateMapIsMutable();
          reliquaryFilterStateMap_.add(builderForValue.build());
          onChanged();
        } else {
          reliquaryFilterStateMapBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public Builder addReliquaryFilterStateMap(
          int index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (reliquaryFilterStateMapBuilder_ == null) {
          ensureReliquaryFilterStateMapIsMutable();
          reliquaryFilterStateMap_.add(index, builderForValue.build());
          onChanged();
        } else {
          reliquaryFilterStateMapBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public Builder addAllReliquaryFilterStateMap(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> values) {
        if (reliquaryFilterStateMapBuilder_ == null) {
          ensureReliquaryFilterStateMapIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, reliquaryFilterStateMap_);
          onChanged();
        } else {
          reliquaryFilterStateMapBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public Builder clearReliquaryFilterStateMap() {
        if (reliquaryFilterStateMapBuilder_ == null) {
          reliquaryFilterStateMap_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          reliquaryFilterStateMapBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public Builder removeReliquaryFilterStateMap(int index) {
        if (reliquaryFilterStateMapBuilder_ == null) {
          ensureReliquaryFilterStateMapIsMutable();
          reliquaryFilterStateMap_.remove(index);
          onChanged();
        } else {
          reliquaryFilterStateMapBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder getReliquaryFilterStateMapBuilder(
          int index) {
        return getReliquaryFilterStateMapFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder getReliquaryFilterStateMapOrBuilder(
          int index) {
        if (reliquaryFilterStateMapBuilder_ == null) {
          return reliquaryFilterStateMap_.get(index);  } else {
          return reliquaryFilterStateMapBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder> 
           getReliquaryFilterStateMapOrBuilderList() {
        if (reliquaryFilterStateMapBuilder_ != null) {
          return reliquaryFilterStateMapBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(reliquaryFilterStateMap_);
        }
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder addReliquaryFilterStateMapBuilder() {
        return getReliquaryFilterStateMapFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder addReliquaryFilterStateMapBuilder(
          int index) {
        return getReliquaryFilterStateMapFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Uint32Pair reliquary_filter_state_map = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder> 
           getReliquaryFilterStateMapBuilderList() {
        return getReliquaryFilterStateMapFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder> 
          getReliquaryFilterStateMapFieldBuilder() {
        if (reliquaryFilterStateMapBuilder_ == null) {
          reliquaryFilterStateMapBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder>(
                  reliquaryFilterStateMap_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          reliquaryFilterStateMap_ = null;
        }
        return reliquaryFilterStateMapBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ReliquaryFilterStateNotify)
    }

    // @@protoc_insertion_point(class_scope:ReliquaryFilterStateNotify)
    private static final emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify();
    }

    public static emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReliquaryFilterStateNotify>
        PARSER = new com.google.protobuf.AbstractParser<ReliquaryFilterStateNotify>() {
      @java.lang.Override
      public ReliquaryFilterStateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReliquaryFilterStateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReliquaryFilterStateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReliquaryFilterStateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ReliquaryFilterStateNotifyOuterClass.ReliquaryFilterStateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReliquaryFilterStateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReliquaryFilterStateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ReliquaryFilterStateNotify.proto\032\020Uint" +
      "32Pair.proto\"M\n\032ReliquaryFilterStateNoti" +
      "fy\022/\n\032reliquary_filter_state_map\030\014 \003(\0132\013" +
      ".Uint32PairB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Uint32PairOuterClass.getDescriptor(),
        });
    internal_static_ReliquaryFilterStateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReliquaryFilterStateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReliquaryFilterStateNotify_descriptor,
        new java.lang.String[] { "ReliquaryFilterStateMap", });
    emu.grasscutter.net.proto.Uint32PairOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
