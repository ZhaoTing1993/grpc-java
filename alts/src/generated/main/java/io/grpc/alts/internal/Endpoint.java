// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/gcp/handshaker.proto

package io.grpc.alts.internal;

/**
 * Protobuf type {@code grpc.gcp.Endpoint}
 */
public  final class Endpoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.gcp.Endpoint)
    EndpointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Endpoint.newBuilder() to construct.
  private Endpoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Endpoint() {
    ipAddress_ = "";
    port_ = 0;
    protocol_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Endpoint(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            ipAddress_ = s;
            break;
          }
          case 16: {

            port_ = input.readInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            protocol_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return io.grpc.alts.internal.HandshakerProto.internal_static_grpc_gcp_Endpoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.alts.internal.HandshakerProto.internal_static_grpc_gcp_Endpoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.alts.internal.Endpoint.class, io.grpc.alts.internal.Endpoint.Builder.class);
  }

  public static final int IP_ADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object ipAddress_;
  /**
   * <pre>
   * IP address. It should contain an IPv4 or IPv6 string literal, e.g.
   * "192.168.0.1" or "2001:db8::1".
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   */
  public java.lang.String getIpAddress() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * IP address. It should contain an IPv4 or IPv6 string literal, e.g.
   * "192.168.0.1" or "2001:db8::1".
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIpAddressBytes() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_;
  /**
   * <pre>
   * Port number.
   * </pre>
   *
   * <code>int32 port = 2;</code>
   */
  public int getPort() {
    return port_;
  }

  public static final int PROTOCOL_FIELD_NUMBER = 3;
  private int protocol_;
  /**
   * <pre>
   * Network protocol (e.g., TCP, UDP) associated with this endpoint.
   * </pre>
   *
   * <code>.grpc.gcp.NetworkProtocol protocol = 3;</code>
   */
  public int getProtocolValue() {
    return protocol_;
  }
  /**
   * <pre>
   * Network protocol (e.g., TCP, UDP) associated with this endpoint.
   * </pre>
   *
   * <code>.grpc.gcp.NetworkProtocol protocol = 3;</code>
   */
  public io.grpc.alts.internal.NetworkProtocol getProtocol() {
    @SuppressWarnings("deprecation")
    io.grpc.alts.internal.NetworkProtocol result = io.grpc.alts.internal.NetworkProtocol.valueOf(protocol_);
    return result == null ? io.grpc.alts.internal.NetworkProtocol.UNRECOGNIZED : result;
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
    if (!getIpAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ipAddress_);
    }
    if (port_ != 0) {
      output.writeInt32(2, port_);
    }
    if (protocol_ != io.grpc.alts.internal.NetworkProtocol.NETWORK_PROTOCOL_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, protocol_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIpAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ipAddress_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, port_);
    }
    if (protocol_ != io.grpc.alts.internal.NetworkProtocol.NETWORK_PROTOCOL_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, protocol_);
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
    if (!(obj instanceof io.grpc.alts.internal.Endpoint)) {
      return super.equals(obj);
    }
    io.grpc.alts.internal.Endpoint other = (io.grpc.alts.internal.Endpoint) obj;

    boolean result = true;
    result = result && getIpAddress()
        .equals(other.getIpAddress());
    result = result && (getPort()
        == other.getPort());
    result = result && protocol_ == other.protocol_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddress().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
    hash = (53 * hash) + protocol_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.alts.internal.Endpoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.alts.internal.Endpoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.alts.internal.Endpoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.alts.internal.Endpoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.alts.internal.Endpoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.alts.internal.Endpoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.alts.internal.Endpoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.alts.internal.Endpoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.alts.internal.Endpoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.alts.internal.Endpoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.alts.internal.Endpoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.alts.internal.Endpoint parseFrom(
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
  public static Builder newBuilder(io.grpc.alts.internal.Endpoint prototype) {
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
   * Protobuf type {@code grpc.gcp.Endpoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.gcp.Endpoint)
      io.grpc.alts.internal.EndpointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.alts.internal.HandshakerProto.internal_static_grpc_gcp_Endpoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.alts.internal.HandshakerProto.internal_static_grpc_gcp_Endpoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.alts.internal.Endpoint.class, io.grpc.alts.internal.Endpoint.Builder.class);
    }

    // Construct using io.grpc.alts.internal.Endpoint.newBuilder()
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
      ipAddress_ = "";

      port_ = 0;

      protocol_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.alts.internal.HandshakerProto.internal_static_grpc_gcp_Endpoint_descriptor;
    }

    @java.lang.Override
    public io.grpc.alts.internal.Endpoint getDefaultInstanceForType() {
      return io.grpc.alts.internal.Endpoint.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.alts.internal.Endpoint build() {
      io.grpc.alts.internal.Endpoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.alts.internal.Endpoint buildPartial() {
      io.grpc.alts.internal.Endpoint result = new io.grpc.alts.internal.Endpoint(this);
      result.ipAddress_ = ipAddress_;
      result.port_ = port_;
      result.protocol_ = protocol_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.alts.internal.Endpoint) {
        return mergeFrom((io.grpc.alts.internal.Endpoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.alts.internal.Endpoint other) {
      if (other == io.grpc.alts.internal.Endpoint.getDefaultInstance()) return this;
      if (!other.getIpAddress().isEmpty()) {
        ipAddress_ = other.ipAddress_;
        onChanged();
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (other.protocol_ != 0) {
        setProtocolValue(other.getProtocolValue());
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
      io.grpc.alts.internal.Endpoint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.alts.internal.Endpoint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ipAddress_ = "";
    /**
     * <pre>
     * IP address. It should contain an IPv4 or IPv6 string literal, e.g.
     * "192.168.0.1" or "2001:db8::1".
     * </pre>
     *
     * <code>string ip_address = 1;</code>
     */
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * IP address. It should contain an IPv4 or IPv6 string literal, e.g.
     * "192.168.0.1" or "2001:db8::1".
     * </pre>
     *
     * <code>string ip_address = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * IP address. It should contain an IPv4 or IPv6 string literal, e.g.
     * "192.168.0.1" or "2001:db8::1".
     * </pre>
     *
     * <code>string ip_address = 1;</code>
     */
    public Builder setIpAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IP address. It should contain an IPv4 or IPv6 string literal, e.g.
     * "192.168.0.1" or "2001:db8::1".
     * </pre>
     *
     * <code>string ip_address = 1;</code>
     */
    public Builder clearIpAddress() {
      
      ipAddress_ = getDefaultInstance().getIpAddress();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IP address. It should contain an IPv4 or IPv6 string literal, e.g.
     * "192.168.0.1" or "2001:db8::1".
     * </pre>
     *
     * <code>string ip_address = 1;</code>
     */
    public Builder setIpAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ipAddress_ = value;
      onChanged();
      return this;
    }

    private int port_ ;
    /**
     * <pre>
     * Port number.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     */
    public int getPort() {
      return port_;
    }
    /**
     * <pre>
     * Port number.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Port number.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }

    private int protocol_ = 0;
    /**
     * <pre>
     * Network protocol (e.g., TCP, UDP) associated with this endpoint.
     * </pre>
     *
     * <code>.grpc.gcp.NetworkProtocol protocol = 3;</code>
     */
    public int getProtocolValue() {
      return protocol_;
    }
    /**
     * <pre>
     * Network protocol (e.g., TCP, UDP) associated with this endpoint.
     * </pre>
     *
     * <code>.grpc.gcp.NetworkProtocol protocol = 3;</code>
     */
    public Builder setProtocolValue(int value) {
      protocol_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Network protocol (e.g., TCP, UDP) associated with this endpoint.
     * </pre>
     *
     * <code>.grpc.gcp.NetworkProtocol protocol = 3;</code>
     */
    public io.grpc.alts.internal.NetworkProtocol getProtocol() {
      @SuppressWarnings("deprecation")
      io.grpc.alts.internal.NetworkProtocol result = io.grpc.alts.internal.NetworkProtocol.valueOf(protocol_);
      return result == null ? io.grpc.alts.internal.NetworkProtocol.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Network protocol (e.g., TCP, UDP) associated with this endpoint.
     * </pre>
     *
     * <code>.grpc.gcp.NetworkProtocol protocol = 3;</code>
     */
    public Builder setProtocol(io.grpc.alts.internal.NetworkProtocol value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      protocol_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Network protocol (e.g., TCP, UDP) associated with this endpoint.
     * </pre>
     *
     * <code>.grpc.gcp.NetworkProtocol protocol = 3;</code>
     */
    public Builder clearProtocol() {
      
      protocol_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.gcp.Endpoint)
  }

  // @@protoc_insertion_point(class_scope:grpc.gcp.Endpoint)
  private static final io.grpc.alts.internal.Endpoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.alts.internal.Endpoint();
  }

  public static io.grpc.alts.internal.Endpoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Endpoint>
      PARSER = new com.google.protobuf.AbstractParser<Endpoint>() {
    @java.lang.Override
    public Endpoint parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Endpoint(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Endpoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Endpoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.alts.internal.Endpoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
