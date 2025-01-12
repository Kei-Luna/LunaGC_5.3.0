// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtRushMoveNotify.proto

package emu.grasscutter.net.proto;

public final class EvtRushMoveNotifyOuterClass {
  private EvtRushMoveNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtRushMoveNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtRushMoveNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
     * @return Whether the evtRushMoveInfo field is set.
     */
    boolean hasEvtRushMoveInfo();
    /**
     * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
     * @return The evtRushMoveInfo.
     */
    emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo getEvtRushMoveInfo();
    /**
     * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
     */
    emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfoOrBuilder getEvtRushMoveInfoOrBuilder();

    /**
     * <code>.ForwardType forward_type = 11;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 11;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType();
  }
  /**
   * <pre>
   * CmdId: 8760 
   * </pre>
   *
   * Protobuf type {@code EvtRushMoveNotify}
   */
  public static final class EvtRushMoveNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtRushMoveNotify)
      EvtRushMoveNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtRushMoveNotify.newBuilder() to construct.
    private EvtRushMoveNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtRushMoveNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtRushMoveNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtRushMoveNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 34: {
              emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.Builder subBuilder = null;
              if (evtRushMoveInfo_ != null) {
                subBuilder = evtRushMoveInfo_.toBuilder();
              }
              evtRushMoveInfo_ = input.readMessage(emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(evtRushMoveInfo_);
                evtRushMoveInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 88: {
              int rawValue = input.readEnum();

              forwardType_ = rawValue;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.internal_static_EvtRushMoveNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.internal_static_EvtRushMoveNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify.class, emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify.Builder.class);
    }

    public static final int EVT_RUSH_MOVE_INFO_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo evtRushMoveInfo_;
    /**
     * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
     * @return Whether the evtRushMoveInfo field is set.
     */
    @java.lang.Override
    public boolean hasEvtRushMoveInfo() {
      return evtRushMoveInfo_ != null;
    }
    /**
     * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
     * @return The evtRushMoveInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo getEvtRushMoveInfo() {
      return evtRushMoveInfo_ == null ? emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.getDefaultInstance() : evtRushMoveInfo_;
    }
    /**
     * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfoOrBuilder getEvtRushMoveInfoOrBuilder() {
      return getEvtRushMoveInfo();
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 11;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 11;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 11;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
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
      if (evtRushMoveInfo_ != null) {
        output.writeMessage(4, getEvtRushMoveInfo());
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(11, forwardType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (evtRushMoveInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getEvtRushMoveInfo());
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, forwardType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify other = (emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify) obj;

      if (hasEvtRushMoveInfo() != other.hasEvtRushMoveInfo()) return false;
      if (hasEvtRushMoveInfo()) {
        if (!getEvtRushMoveInfo()
            .equals(other.getEvtRushMoveInfo())) return false;
      }
      if (forwardType_ != other.forwardType_) return false;
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
      if (hasEvtRushMoveInfo()) {
        hash = (37 * hash) + EVT_RUSH_MOVE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getEvtRushMoveInfo().hashCode();
      }
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify prototype) {
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
     * <pre>
     * CmdId: 8760 
     * </pre>
     *
     * Protobuf type {@code EvtRushMoveNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtRushMoveNotify)
        emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.internal_static_EvtRushMoveNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.internal_static_EvtRushMoveNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify.class, emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify.newBuilder()
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
        if (evtRushMoveInfoBuilder_ == null) {
          evtRushMoveInfo_ = null;
        } else {
          evtRushMoveInfo_ = null;
          evtRushMoveInfoBuilder_ = null;
        }
        forwardType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.internal_static_EvtRushMoveNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify build() {
        emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify buildPartial() {
        emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify result = new emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify(this);
        if (evtRushMoveInfoBuilder_ == null) {
          result.evtRushMoveInfo_ = evtRushMoveInfo_;
        } else {
          result.evtRushMoveInfo_ = evtRushMoveInfoBuilder_.build();
        }
        result.forwardType_ = forwardType_;
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
        if (other instanceof emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify other) {
        if (other == emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify.getDefaultInstance()) return this;
        if (other.hasEvtRushMoveInfo()) {
          mergeEvtRushMoveInfo(other.getEvtRushMoveInfo());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
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
        emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo evtRushMoveInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo, emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.Builder, emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfoOrBuilder> evtRushMoveInfoBuilder_;
      /**
       * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
       * @return Whether the evtRushMoveInfo field is set.
       */
      public boolean hasEvtRushMoveInfo() {
        return evtRushMoveInfoBuilder_ != null || evtRushMoveInfo_ != null;
      }
      /**
       * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
       * @return The evtRushMoveInfo.
       */
      public emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo getEvtRushMoveInfo() {
        if (evtRushMoveInfoBuilder_ == null) {
          return evtRushMoveInfo_ == null ? emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.getDefaultInstance() : evtRushMoveInfo_;
        } else {
          return evtRushMoveInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
       */
      public Builder setEvtRushMoveInfo(emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo value) {
        if (evtRushMoveInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          evtRushMoveInfo_ = value;
          onChanged();
        } else {
          evtRushMoveInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
       */
      public Builder setEvtRushMoveInfo(
          emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.Builder builderForValue) {
        if (evtRushMoveInfoBuilder_ == null) {
          evtRushMoveInfo_ = builderForValue.build();
          onChanged();
        } else {
          evtRushMoveInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
       */
      public Builder mergeEvtRushMoveInfo(emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo value) {
        if (evtRushMoveInfoBuilder_ == null) {
          if (evtRushMoveInfo_ != null) {
            evtRushMoveInfo_ =
              emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.newBuilder(evtRushMoveInfo_).mergeFrom(value).buildPartial();
          } else {
            evtRushMoveInfo_ = value;
          }
          onChanged();
        } else {
          evtRushMoveInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
       */
      public Builder clearEvtRushMoveInfo() {
        if (evtRushMoveInfoBuilder_ == null) {
          evtRushMoveInfo_ = null;
          onChanged();
        } else {
          evtRushMoveInfo_ = null;
          evtRushMoveInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
       */
      public emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.Builder getEvtRushMoveInfoBuilder() {
        
        onChanged();
        return getEvtRushMoveInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
       */
      public emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfoOrBuilder getEvtRushMoveInfoOrBuilder() {
        if (evtRushMoveInfoBuilder_ != null) {
          return evtRushMoveInfoBuilder_.getMessageOrBuilder();
        } else {
          return evtRushMoveInfo_ == null ?
              emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.getDefaultInstance() : evtRushMoveInfo_;
        }
      }
      /**
       * <code>.EvtRushMoveInfo evt_rush_move_info = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo, emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.Builder, emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfoOrBuilder> 
          getEvtRushMoveInfoFieldBuilder() {
        if (evtRushMoveInfoBuilder_ == null) {
          evtRushMoveInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo, emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfo.Builder, emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.EvtRushMoveInfoOrBuilder>(
                  getEvtRushMoveInfo(),
                  getParentForChildren(),
                  isClean());
          evtRushMoveInfo_ = null;
        }
        return evtRushMoveInfoBuilder_;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 11;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 11;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 11;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 11;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtRushMoveNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtRushMoveNotify)
    private static final emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify();
    }

    public static emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtRushMoveNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtRushMoveNotify>() {
      @java.lang.Override
      public EvtRushMoveNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtRushMoveNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtRushMoveNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtRushMoveNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtRushMoveNotifyOuterClass.EvtRushMoveNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtRushMoveNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtRushMoveNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027EvtRushMoveNotify.proto\032\025EvtRushMoveIn" +
      "fo.proto\032\021ForwardType.proto\"e\n\021EvtRushMo" +
      "veNotify\022,\n\022evt_rush_move_info\030\004 \001(\0132\020.E" +
      "vtRushMoveInfo\022\"\n\014forward_type\030\013 \001(\0162\014.F" +
      "orwardTypeB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtRushMoveNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtRushMoveNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtRushMoveNotify_descriptor,
        new java.lang.String[] { "EvtRushMoveInfo", "ForwardType", });
    emu.grasscutter.net.proto.EvtRushMoveInfoOuterClass.getDescriptor();
    emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
