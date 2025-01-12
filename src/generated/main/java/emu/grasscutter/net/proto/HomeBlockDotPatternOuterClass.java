// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeBlockDotPattern.proto

package emu.grasscutter.net.proto;

public final class HomeBlockDotPatternOuterClass {
  private HomeBlockDotPatternOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeBlockDotPatternOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeBlockDotPattern)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 width = 3;</code>
     * @return The width.
     */
    int getWidth();

    /**
     * <code>bytes data = 4;</code>
     * @return The data.
     */
    com.google.protobuf.ByteString getData();

    /**
     * <code>uint32 height = 12;</code>
     * @return The height.
     */
    int getHeight();
  }
  /**
   * Protobuf type {@code HomeBlockDotPattern}
   */
  public static final class HomeBlockDotPattern extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeBlockDotPattern)
      HomeBlockDotPatternOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeBlockDotPattern.newBuilder() to construct.
    private HomeBlockDotPattern(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeBlockDotPattern() {
      data_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeBlockDotPattern();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeBlockDotPattern(
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
            case 24: {

              width_ = input.readUInt32();
              break;
            }
            case 34: {

              data_ = input.readBytes();
              break;
            }
            case 96: {

              height_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.internal_static_HomeBlockDotPattern_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.internal_static_HomeBlockDotPattern_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern.class, emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern.Builder.class);
    }

    public static final int WIDTH_FIELD_NUMBER = 3;
    private int width_;
    /**
     * <code>uint32 width = 3;</code>
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return width_;
    }

    public static final int DATA_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>bytes data = 4;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    public static final int HEIGHT_FIELD_NUMBER = 12;
    private int height_;
    /**
     * <code>uint32 height = 12;</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
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
      if (width_ != 0) {
        output.writeUInt32(3, width_);
      }
      if (!data_.isEmpty()) {
        output.writeBytes(4, data_);
      }
      if (height_ != 0) {
        output.writeUInt32(12, height_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (width_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, width_);
      }
      if (!data_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, data_);
      }
      if (height_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, height_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern other = (emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern) obj;

      if (getWidth()
          != other.getWidth()) return false;
      if (!getData()
          .equals(other.getData())) return false;
      if (getHeight()
          != other.getHeight()) return false;
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
      hash = (37 * hash) + WIDTH_FIELD_NUMBER;
      hash = (53 * hash) + getWidth();
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getHeight();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern prototype) {
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
     * Protobuf type {@code HomeBlockDotPattern}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeBlockDotPattern)
        emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPatternOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.internal_static_HomeBlockDotPattern_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.internal_static_HomeBlockDotPattern_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern.class, emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern.newBuilder()
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
        width_ = 0;

        data_ = com.google.protobuf.ByteString.EMPTY;

        height_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.internal_static_HomeBlockDotPattern_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern build() {
        emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern buildPartial() {
        emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern result = new emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern(this);
        result.width_ = width_;
        result.data_ = data_;
        result.height_ = height_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern) {
          return mergeFrom((emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern other) {
        if (other == emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern.getDefaultInstance()) return this;
        if (other.getWidth() != 0) {
          setWidth(other.getWidth());
        }
        if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
          setData(other.getData());
        }
        if (other.getHeight() != 0) {
          setHeight(other.getHeight());
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
        emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int width_ ;
      /**
       * <code>uint32 width = 3;</code>
       * @return The width.
       */
      @java.lang.Override
      public int getWidth() {
        return width_;
      }
      /**
       * <code>uint32 width = 3;</code>
       * @param value The width to set.
       * @return This builder for chaining.
       */
      public Builder setWidth(int value) {
        
        width_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 width = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearWidth() {
        
        width_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes data = 4;</code>
       * @return The data.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>bytes data = 4;</code>
       * @param value The data to set.
       * @return This builder for chaining.
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes data = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearData() {
        
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      private int height_ ;
      /**
       * <code>uint32 height = 12;</code>
       * @return The height.
       */
      @java.lang.Override
      public int getHeight() {
        return height_;
      }
      /**
       * <code>uint32 height = 12;</code>
       * @param value The height to set.
       * @return This builder for chaining.
       */
      public Builder setHeight(int value) {
        
        height_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 height = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearHeight() {
        
        height_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeBlockDotPattern)
    }

    // @@protoc_insertion_point(class_scope:HomeBlockDotPattern)
    private static final emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern();
    }

    public static emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeBlockDotPattern>
        PARSER = new com.google.protobuf.AbstractParser<HomeBlockDotPattern>() {
      @java.lang.Override
      public HomeBlockDotPattern parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeBlockDotPattern(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeBlockDotPattern> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeBlockDotPattern> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeBlockDotPatternOuterClass.HomeBlockDotPattern getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeBlockDotPattern_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeBlockDotPattern_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031HomeBlockDotPattern.proto\"B\n\023HomeBlock" +
      "DotPattern\022\r\n\005width\030\003 \001(\r\022\014\n\004data\030\004 \001(\014\022" +
      "\016\n\006height\030\014 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeBlockDotPattern_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeBlockDotPattern_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeBlockDotPattern_descriptor,
        new java.lang.String[] { "Width", "Data", "Height", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
