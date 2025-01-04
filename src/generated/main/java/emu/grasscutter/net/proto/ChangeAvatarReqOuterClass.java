// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeAvatarReq.proto

package emu.grasscutter.net.proto;

public final class ChangeAvatarReqOuterClass {
  private ChangeAvatarReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeAvatarReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeAvatarReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector move_pos = 2;</code>
     * @return Whether the movePos field is set.
     */
    boolean hasMovePos();
    /**
     * <code>.Vector move_pos = 2;</code>
     * @return The movePos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getMovePos();
    /**
     * <code>.Vector move_pos = 2;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getMovePosOrBuilder();

    /**
     * <code>bool KEFMPBIHEGK = 5;</code>
     * @return The kEFMPBIHEGK.
     */
    boolean getKEFMPBIHEGK();

    /**
     * <code>bool is_move = 10;</code>
     * @return The isMove.
     */
    boolean getIsMove();

    /**
     * <code>uint32 skill_id = 1;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>uint64 guid = 12;</code>
     * @return The guid.
     */
    long getGuid();
  }
  /**
   * Protobuf type {@code ChangeAvatarReq}
   */
  public static final class ChangeAvatarReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeAvatarReq)
      ChangeAvatarReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeAvatarReq.newBuilder() to construct.
    private ChangeAvatarReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeAvatarReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeAvatarReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeAvatarReq(
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
            case 8: {

              skillId_ = input.readUInt32();
              break;
            }
            case 18: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (movePos_ != null) {
                subBuilder = movePos_.toBuilder();
              }
              movePos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(movePos_);
                movePos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 40: {

              kEFMPBIHEGK_ = input.readBool();
              break;
            }
            case 80: {

              isMove_ = input.readBool();
              break;
            }
            case 96: {

              guid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.internal_static_ChangeAvatarReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.internal_static_ChangeAvatarReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq.class, emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq.Builder.class);
    }

    public static final int MOVE_POS_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector movePos_;
    /**
     * <code>.Vector move_pos = 2;</code>
     * @return Whether the movePos field is set.
     */
    @java.lang.Override
    public boolean hasMovePos() {
      return movePos_ != null;
    }
    /**
     * <code>.Vector move_pos = 2;</code>
     * @return The movePos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getMovePos() {
      return movePos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : movePos_;
    }
    /**
     * <code>.Vector move_pos = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getMovePosOrBuilder() {
      return getMovePos();
    }

    public static final int KEFMPBIHEGK_FIELD_NUMBER = 5;
    private boolean kEFMPBIHEGK_;
    /**
     * <code>bool KEFMPBIHEGK = 5;</code>
     * @return The kEFMPBIHEGK.
     */
    @java.lang.Override
    public boolean getKEFMPBIHEGK() {
      return kEFMPBIHEGK_;
    }

    public static final int IS_MOVE_FIELD_NUMBER = 10;
    private boolean isMove_;
    /**
     * <code>bool is_move = 10;</code>
     * @return The isMove.
     */
    @java.lang.Override
    public boolean getIsMove() {
      return isMove_;
    }

    public static final int SKILL_ID_FIELD_NUMBER = 1;
    private int skillId_;
    /**
     * <code>uint32 skill_id = 1;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }

    public static final int GUID_FIELD_NUMBER = 12;
    private long guid_;
    /**
     * <code>uint64 guid = 12;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
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
      if (skillId_ != 0) {
        output.writeUInt32(1, skillId_);
      }
      if (movePos_ != null) {
        output.writeMessage(2, getMovePos());
      }
      if (kEFMPBIHEGK_ != false) {
        output.writeBool(5, kEFMPBIHEGK_);
      }
      if (isMove_ != false) {
        output.writeBool(10, isMove_);
      }
      if (guid_ != 0L) {
        output.writeUInt64(12, guid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, skillId_);
      }
      if (movePos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getMovePos());
      }
      if (kEFMPBIHEGK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, kEFMPBIHEGK_);
      }
      if (isMove_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isMove_);
      }
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, guid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq other = (emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq) obj;

      if (hasMovePos() != other.hasMovePos()) return false;
      if (hasMovePos()) {
        if (!getMovePos()
            .equals(other.getMovePos())) return false;
      }
      if (getKEFMPBIHEGK()
          != other.getKEFMPBIHEGK()) return false;
      if (getIsMove()
          != other.getIsMove()) return false;
      if (getSkillId()
          != other.getSkillId()) return false;
      if (getGuid()
          != other.getGuid()) return false;
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
      if (hasMovePos()) {
        hash = (37 * hash) + MOVE_POS_FIELD_NUMBER;
        hash = (53 * hash) + getMovePos().hashCode();
      }
      hash = (37 * hash) + KEFMPBIHEGK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getKEFMPBIHEGK());
      hash = (37 * hash) + IS_MOVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsMove());
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq prototype) {
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
     * Protobuf type {@code ChangeAvatarReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeAvatarReq)
        emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.internal_static_ChangeAvatarReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.internal_static_ChangeAvatarReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq.class, emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq.newBuilder()
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
        if (movePosBuilder_ == null) {
          movePos_ = null;
        } else {
          movePos_ = null;
          movePosBuilder_ = null;
        }
        kEFMPBIHEGK_ = false;

        isMove_ = false;

        skillId_ = 0;

        guid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.internal_static_ChangeAvatarReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq build() {
        emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq buildPartial() {
        emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq result = new emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq(this);
        if (movePosBuilder_ == null) {
          result.movePos_ = movePos_;
        } else {
          result.movePos_ = movePosBuilder_.build();
        }
        result.kEFMPBIHEGK_ = kEFMPBIHEGK_;
        result.isMove_ = isMove_;
        result.skillId_ = skillId_;
        result.guid_ = guid_;
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
        if (other instanceof emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq) {
          return mergeFrom((emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq other) {
        if (other == emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq.getDefaultInstance()) return this;
        if (other.hasMovePos()) {
          mergeMovePos(other.getMovePos());
        }
        if (other.getKEFMPBIHEGK() != false) {
          setKEFMPBIHEGK(other.getKEFMPBIHEGK());
        }
        if (other.getIsMove() != false) {
          setIsMove(other.getIsMove());
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
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
        emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector movePos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> movePosBuilder_;
      /**
       * <code>.Vector move_pos = 2;</code>
       * @return Whether the movePos field is set.
       */
      public boolean hasMovePos() {
        return movePosBuilder_ != null || movePos_ != null;
      }
      /**
       * <code>.Vector move_pos = 2;</code>
       * @return The movePos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getMovePos() {
        if (movePosBuilder_ == null) {
          return movePos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : movePos_;
        } else {
          return movePosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector move_pos = 2;</code>
       */
      public Builder setMovePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (movePosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          movePos_ = value;
          onChanged();
        } else {
          movePosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector move_pos = 2;</code>
       */
      public Builder setMovePos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (movePosBuilder_ == null) {
          movePos_ = builderForValue.build();
          onChanged();
        } else {
          movePosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector move_pos = 2;</code>
       */
      public Builder mergeMovePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (movePosBuilder_ == null) {
          if (movePos_ != null) {
            movePos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(movePos_).mergeFrom(value).buildPartial();
          } else {
            movePos_ = value;
          }
          onChanged();
        } else {
          movePosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector move_pos = 2;</code>
       */
      public Builder clearMovePos() {
        if (movePosBuilder_ == null) {
          movePos_ = null;
          onChanged();
        } else {
          movePos_ = null;
          movePosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector move_pos = 2;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getMovePosBuilder() {
        
        onChanged();
        return getMovePosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector move_pos = 2;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getMovePosOrBuilder() {
        if (movePosBuilder_ != null) {
          return movePosBuilder_.getMessageOrBuilder();
        } else {
          return movePos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : movePos_;
        }
      }
      /**
       * <code>.Vector move_pos = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getMovePosFieldBuilder() {
        if (movePosBuilder_ == null) {
          movePosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getMovePos(),
                  getParentForChildren(),
                  isClean());
          movePos_ = null;
        }
        return movePosBuilder_;
      }

      private boolean kEFMPBIHEGK_ ;
      /**
       * <code>bool KEFMPBIHEGK = 5;</code>
       * @return The kEFMPBIHEGK.
       */
      @java.lang.Override
      public boolean getKEFMPBIHEGK() {
        return kEFMPBIHEGK_;
      }
      /**
       * <code>bool KEFMPBIHEGK = 5;</code>
       * @param value The kEFMPBIHEGK to set.
       * @return This builder for chaining.
       */
      public Builder setKEFMPBIHEGK(boolean value) {
        
        kEFMPBIHEGK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool KEFMPBIHEGK = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearKEFMPBIHEGK() {
        
        kEFMPBIHEGK_ = false;
        onChanged();
        return this;
      }

      private boolean isMove_ ;
      /**
       * <code>bool is_move = 10;</code>
       * @return The isMove.
       */
      @java.lang.Override
      public boolean getIsMove() {
        return isMove_;
      }
      /**
       * <code>bool is_move = 10;</code>
       * @param value The isMove to set.
       * @return This builder for chaining.
       */
      public Builder setIsMove(boolean value) {
        
        isMove_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_move = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsMove() {
        
        isMove_ = false;
        onChanged();
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 1;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 1;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 12;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 12;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:ChangeAvatarReq)
    }

    // @@protoc_insertion_point(class_scope:ChangeAvatarReq)
    private static final emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq();
    }

    public static emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeAvatarReq>
        PARSER = new com.google.protobuf.AbstractParser<ChangeAvatarReq>() {
      @java.lang.Override
      public ChangeAvatarReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeAvatarReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeAvatarReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeAvatarReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChangeAvatarReqOuterClass.ChangeAvatarReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeAvatarReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeAvatarReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ChangeAvatarReq.proto\032\014Vector.proto\"r\n" +
      "\017ChangeAvatarReq\022\031\n\010move_pos\030\002 \001(\0132\007.Vec" +
      "tor\022\023\n\013KEFMPBIHEGK\030\005 \001(\010\022\017\n\007is_move\030\n \001(" +
      "\010\022\020\n\010skill_id\030\001 \001(\r\022\014\n\004guid\030\014 \001(\004B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_ChangeAvatarReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeAvatarReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeAvatarReq_descriptor,
        new java.lang.String[] { "MovePos", "KEFMPBIHEGK", "IsMove", "SkillId", "Guid", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
