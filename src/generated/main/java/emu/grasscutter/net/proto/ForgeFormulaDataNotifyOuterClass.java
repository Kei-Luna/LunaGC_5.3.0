// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForgeFormulaDataNotify.proto

package emu.grasscutter.net.proto;

public final class ForgeFormulaDataNotifyOuterClass {
  private ForgeFormulaDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForgeFormulaDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ForgeFormulaDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 forge_id = 7;</code>
     * @return The forgeId.
     */
    int getForgeId();

    /**
     * <code>bool is_locked = 10;</code>
     * @return The isLocked.
     */
    boolean getIsLocked();
  }
  /**
   * Protobuf type {@code ForgeFormulaDataNotify}
   */
  public static final class ForgeFormulaDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ForgeFormulaDataNotify)
      ForgeFormulaDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForgeFormulaDataNotify.newBuilder() to construct.
    private ForgeFormulaDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForgeFormulaDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ForgeFormulaDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ForgeFormulaDataNotify(
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
            case 56: {

              forgeId_ = input.readUInt32();
              break;
            }
            case 80: {

              isLocked_ = input.readBool();
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
      return emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.internal_static_ForgeFormulaDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.internal_static_ForgeFormulaDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify.class, emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify.Builder.class);
    }

    public static final int FORGE_ID_FIELD_NUMBER = 7;
    private int forgeId_;
    /**
     * <code>uint32 forge_id = 7;</code>
     * @return The forgeId.
     */
    @java.lang.Override
    public int getForgeId() {
      return forgeId_;
    }

    public static final int IS_LOCKED_FIELD_NUMBER = 10;
    private boolean isLocked_;
    /**
     * <code>bool is_locked = 10;</code>
     * @return The isLocked.
     */
    @java.lang.Override
    public boolean getIsLocked() {
      return isLocked_;
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
      if (forgeId_ != 0) {
        output.writeUInt32(7, forgeId_);
      }
      if (isLocked_ != false) {
        output.writeBool(10, isLocked_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (forgeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, forgeId_);
      }
      if (isLocked_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isLocked_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify other = (emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify) obj;

      if (getForgeId()
          != other.getForgeId()) return false;
      if (getIsLocked()
          != other.getIsLocked()) return false;
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
      hash = (37 * hash) + FORGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getForgeId();
      hash = (37 * hash) + IS_LOCKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLocked());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify prototype) {
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
     * Protobuf type {@code ForgeFormulaDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ForgeFormulaDataNotify)
        emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.internal_static_ForgeFormulaDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.internal_static_ForgeFormulaDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify.class, emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify.newBuilder()
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
        forgeId_ = 0;

        isLocked_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.internal_static_ForgeFormulaDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify build() {
        emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify buildPartial() {
        emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify result = new emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify(this);
        result.forgeId_ = forgeId_;
        result.isLocked_ = isLocked_;
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
        if (other instanceof emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify other) {
        if (other == emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify.getDefaultInstance()) return this;
        if (other.getForgeId() != 0) {
          setForgeId(other.getForgeId());
        }
        if (other.getIsLocked() != false) {
          setIsLocked(other.getIsLocked());
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
        emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int forgeId_ ;
      /**
       * <code>uint32 forge_id = 7;</code>
       * @return The forgeId.
       */
      @java.lang.Override
      public int getForgeId() {
        return forgeId_;
      }
      /**
       * <code>uint32 forge_id = 7;</code>
       * @param value The forgeId to set.
       * @return This builder for chaining.
       */
      public Builder setForgeId(int value) {
        
        forgeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 forge_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearForgeId() {
        
        forgeId_ = 0;
        onChanged();
        return this;
      }

      private boolean isLocked_ ;
      /**
       * <code>bool is_locked = 10;</code>
       * @return The isLocked.
       */
      @java.lang.Override
      public boolean getIsLocked() {
        return isLocked_;
      }
      /**
       * <code>bool is_locked = 10;</code>
       * @param value The isLocked to set.
       * @return This builder for chaining.
       */
      public Builder setIsLocked(boolean value) {
        
        isLocked_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_locked = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLocked() {
        
        isLocked_ = false;
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


      // @@protoc_insertion_point(builder_scope:ForgeFormulaDataNotify)
    }

    // @@protoc_insertion_point(class_scope:ForgeFormulaDataNotify)
    private static final emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify();
    }

    public static emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ForgeFormulaDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<ForgeFormulaDataNotify>() {
      @java.lang.Override
      public ForgeFormulaDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ForgeFormulaDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ForgeFormulaDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForgeFormulaDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ForgeFormulaDataNotifyOuterClass.ForgeFormulaDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForgeFormulaDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForgeFormulaDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ForgeFormulaDataNotify.proto\"=\n\026ForgeF" +
      "ormulaDataNotify\022\020\n\010forge_id\030\007 \001(\r\022\021\n\tis" +
      "_locked\030\n \001(\010B\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ForgeFormulaDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ForgeFormulaDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForgeFormulaDataNotify_descriptor,
        new java.lang.String[] { "ForgeId", "IsLocked", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
