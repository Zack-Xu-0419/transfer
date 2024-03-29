// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: triton_bot_communication.proto

package proto.triton;

public final class TritonBotCommunication {
  private TritonBotCommunication() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TritonBotMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.triton.TritonBotMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
     * @return Whether the vision field is set.
     */
    boolean hasVision();
    /**
     * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
     * @return The vision.
     */
    proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot getVision();
    /**
     * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
     */
    proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobotOrBuilder getVisionOrBuilder();

    /**
     * <code>.proto.simulation.RobotCommand command = 3;</code>
     * @return Whether the command field is set.
     */
    boolean hasCommand();
    /**
     * <code>.proto.simulation.RobotCommand command = 3;</code>
     * @return The command.
     */
    proto.simulation.SslSimulationRobotControl.RobotCommand getCommand();
    /**
     * <code>.proto.simulation.RobotCommand command = 3;</code>
     */
    proto.simulation.SslSimulationRobotControl.RobotCommandOrBuilder getCommandOrBuilder();
  }
  /**
   * Protobuf type {@code proto.triton.TritonBotMessage}
   */
  public static final class TritonBotMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.triton.TritonBotMessage)
      TritonBotMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TritonBotMessage.newBuilder() to construct.
    private TritonBotMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TritonBotMessage() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TritonBotMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TritonBotMessage(
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

              id_ = input.readInt32();
              break;
            }
            case 18: {
              proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot.Builder subBuilder = null;
              if (vision_ != null) {
                subBuilder = vision_.toBuilder();
              }
              vision_ = input.readMessage(proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(vision_);
                vision_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              proto.simulation.SslSimulationRobotControl.RobotCommand.Builder subBuilder = null;
              if (command_ != null) {
                subBuilder = command_.toBuilder();
              }
              command_ = input.readMessage(proto.simulation.SslSimulationRobotControl.RobotCommand.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(command_);
                command_ = subBuilder.buildPartial();
              }

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
      return proto.triton.TritonBotCommunication.internal_static_proto_triton_TritonBotMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.triton.TritonBotCommunication.internal_static_proto_triton_TritonBotMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.triton.TritonBotCommunication.TritonBotMessage.class, proto.triton.TritonBotCommunication.TritonBotMessage.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int VISION_FIELD_NUMBER = 2;
    private proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot vision_;
    /**
     * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
     * @return Whether the vision field is set.
     */
    @java.lang.Override
    public boolean hasVision() {
      return vision_ != null;
    }
    /**
     * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
     * @return The vision.
     */
    @java.lang.Override
    public proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot getVision() {
      return vision_ == null ? proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot.getDefaultInstance() : vision_;
    }
    /**
     * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
     */
    @java.lang.Override
    public proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobotOrBuilder getVisionOrBuilder() {
      return getVision();
    }

    public static final int COMMAND_FIELD_NUMBER = 3;
    private proto.simulation.SslSimulationRobotControl.RobotCommand command_;
    /**
     * <code>.proto.simulation.RobotCommand command = 3;</code>
     * @return Whether the command field is set.
     */
    @java.lang.Override
    public boolean hasCommand() {
      return command_ != null;
    }
    /**
     * <code>.proto.simulation.RobotCommand command = 3;</code>
     * @return The command.
     */
    @java.lang.Override
    public proto.simulation.SslSimulationRobotControl.RobotCommand getCommand() {
      return command_ == null ? proto.simulation.SslSimulationRobotControl.RobotCommand.getDefaultInstance() : command_;
    }
    /**
     * <code>.proto.simulation.RobotCommand command = 3;</code>
     */
    @java.lang.Override
    public proto.simulation.SslSimulationRobotControl.RobotCommandOrBuilder getCommandOrBuilder() {
      return getCommand();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasVision()) {
        if (!getVision().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasCommand()) {
        if (!getCommand().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (vision_ != null) {
        output.writeMessage(2, getVision());
      }
      if (command_ != null) {
        output.writeMessage(3, getCommand());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (vision_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getVision());
      }
      if (command_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getCommand());
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
      if (!(obj instanceof proto.triton.TritonBotCommunication.TritonBotMessage)) {
        return super.equals(obj);
      }
      proto.triton.TritonBotCommunication.TritonBotMessage other = (proto.triton.TritonBotCommunication.TritonBotMessage) obj;

      if (getId()
          != other.getId()) return false;
      if (hasVision() != other.hasVision()) return false;
      if (hasVision()) {
        if (!getVision()
            .equals(other.getVision())) return false;
      }
      if (hasCommand() != other.hasCommand()) return false;
      if (hasCommand()) {
        if (!getCommand()
            .equals(other.getCommand())) return false;
      }
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      if (hasVision()) {
        hash = (37 * hash) + VISION_FIELD_NUMBER;
        hash = (53 * hash) + getVision().hashCode();
      }
      if (hasCommand()) {
        hash = (37 * hash) + COMMAND_FIELD_NUMBER;
        hash = (53 * hash) + getCommand().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static proto.triton.TritonBotCommunication.TritonBotMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.triton.TritonBotCommunication.TritonBotMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.triton.TritonBotCommunication.TritonBotMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.triton.TritonBotCommunication.TritonBotMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.triton.TritonBotCommunication.TritonBotMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.triton.TritonBotCommunication.TritonBotMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.triton.TritonBotCommunication.TritonBotMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.triton.TritonBotCommunication.TritonBotMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.triton.TritonBotCommunication.TritonBotMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static proto.triton.TritonBotCommunication.TritonBotMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.triton.TritonBotCommunication.TritonBotMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.triton.TritonBotCommunication.TritonBotMessage parseFrom(
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
    public static Builder newBuilder(proto.triton.TritonBotCommunication.TritonBotMessage prototype) {
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
     * Protobuf type {@code proto.triton.TritonBotMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.triton.TritonBotMessage)
        proto.triton.TritonBotCommunication.TritonBotMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return proto.triton.TritonBotCommunication.internal_static_proto_triton_TritonBotMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return proto.triton.TritonBotCommunication.internal_static_proto_triton_TritonBotMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                proto.triton.TritonBotCommunication.TritonBotMessage.class, proto.triton.TritonBotCommunication.TritonBotMessage.Builder.class);
      }

      // Construct using proto.triton.TritonBotCommunication.TritonBotMessage.newBuilder()
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
        id_ = 0;

        if (visionBuilder_ == null) {
          vision_ = null;
        } else {
          vision_ = null;
          visionBuilder_ = null;
        }
        if (commandBuilder_ == null) {
          command_ = null;
        } else {
          command_ = null;
          commandBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return proto.triton.TritonBotCommunication.internal_static_proto_triton_TritonBotMessage_descriptor;
      }

      @java.lang.Override
      public proto.triton.TritonBotCommunication.TritonBotMessage getDefaultInstanceForType() {
        return proto.triton.TritonBotCommunication.TritonBotMessage.getDefaultInstance();
      }

      @java.lang.Override
      public proto.triton.TritonBotCommunication.TritonBotMessage build() {
        proto.triton.TritonBotCommunication.TritonBotMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public proto.triton.TritonBotCommunication.TritonBotMessage buildPartial() {
        proto.triton.TritonBotCommunication.TritonBotMessage result = new proto.triton.TritonBotCommunication.TritonBotMessage(this);
        result.id_ = id_;
        if (visionBuilder_ == null) {
          result.vision_ = vision_;
        } else {
          result.vision_ = visionBuilder_.build();
        }
        if (commandBuilder_ == null) {
          result.command_ = command_;
        } else {
          result.command_ = commandBuilder_.build();
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
        if (other instanceof proto.triton.TritonBotCommunication.TritonBotMessage) {
          return mergeFrom((proto.triton.TritonBotCommunication.TritonBotMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(proto.triton.TritonBotCommunication.TritonBotMessage other) {
        if (other == proto.triton.TritonBotCommunication.TritonBotMessage.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.hasVision()) {
          mergeVision(other.getVision());
        }
        if (other.hasCommand()) {
          mergeCommand(other.getCommand());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (hasVision()) {
          if (!getVision().isInitialized()) {
            return false;
          }
        }
        if (hasCommand()) {
          if (!getCommand().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        proto.triton.TritonBotCommunication.TritonBotMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (proto.triton.TritonBotCommunication.TritonBotMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot vision_;
      private com.google.protobuf.SingleFieldBuilderV3<
          proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot, proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot.Builder, proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobotOrBuilder> visionBuilder_;
      /**
       * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
       * @return Whether the vision field is set.
       */
      public boolean hasVision() {
        return visionBuilder_ != null || vision_ != null;
      }
      /**
       * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
       * @return The vision.
       */
      public proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot getVision() {
        if (visionBuilder_ == null) {
          return vision_ == null ? proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot.getDefaultInstance() : vision_;
        } else {
          return visionBuilder_.getMessage();
        }
      }
      /**
       * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
       */
      public Builder setVision(proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot value) {
        if (visionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          vision_ = value;
          onChanged();
        } else {
          visionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
       */
      public Builder setVision(
          proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot.Builder builderForValue) {
        if (visionBuilder_ == null) {
          vision_ = builderForValue.build();
          onChanged();
        } else {
          visionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
       */
      public Builder mergeVision(proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot value) {
        if (visionBuilder_ == null) {
          if (vision_ != null) {
            vision_ =
              proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot.newBuilder(vision_).mergeFrom(value).buildPartial();
          } else {
            vision_ = value;
          }
          onChanged();
        } else {
          visionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
       */
      public Builder clearVision() {
        if (visionBuilder_ == null) {
          vision_ = null;
          onChanged();
        } else {
          vision_ = null;
          visionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
       */
      public proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot.Builder getVisionBuilder() {
        
        onChanged();
        return getVisionFieldBuilder().getBuilder();
      }
      /**
       * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
       */
      public proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobotOrBuilder getVisionOrBuilder() {
        if (visionBuilder_ != null) {
          return visionBuilder_.getMessageOrBuilder();
        } else {
          return vision_ == null ?
              proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot.getDefaultInstance() : vision_;
        }
      }
      /**
       * <code>.proto.vision.SSL_DetectionRobot vision = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot, proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot.Builder, proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobotOrBuilder> 
          getVisionFieldBuilder() {
        if (visionBuilder_ == null) {
          visionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot, proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobot.Builder, proto.vision.MessagesRobocupSslDetection.SSL_DetectionRobotOrBuilder>(
                  getVision(),
                  getParentForChildren(),
                  isClean());
          vision_ = null;
        }
        return visionBuilder_;
      }

      private proto.simulation.SslSimulationRobotControl.RobotCommand command_;
      private com.google.protobuf.SingleFieldBuilderV3<
          proto.simulation.SslSimulationRobotControl.RobotCommand, proto.simulation.SslSimulationRobotControl.RobotCommand.Builder, proto.simulation.SslSimulationRobotControl.RobotCommandOrBuilder> commandBuilder_;
      /**
       * <code>.proto.simulation.RobotCommand command = 3;</code>
       * @return Whether the command field is set.
       */
      public boolean hasCommand() {
        return commandBuilder_ != null || command_ != null;
      }
      /**
       * <code>.proto.simulation.RobotCommand command = 3;</code>
       * @return The command.
       */
      public proto.simulation.SslSimulationRobotControl.RobotCommand getCommand() {
        if (commandBuilder_ == null) {
          return command_ == null ? proto.simulation.SslSimulationRobotControl.RobotCommand.getDefaultInstance() : command_;
        } else {
          return commandBuilder_.getMessage();
        }
      }
      /**
       * <code>.proto.simulation.RobotCommand command = 3;</code>
       */
      public Builder setCommand(proto.simulation.SslSimulationRobotControl.RobotCommand value) {
        if (commandBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          command_ = value;
          onChanged();
        } else {
          commandBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.proto.simulation.RobotCommand command = 3;</code>
       */
      public Builder setCommand(
          proto.simulation.SslSimulationRobotControl.RobotCommand.Builder builderForValue) {
        if (commandBuilder_ == null) {
          command_ = builderForValue.build();
          onChanged();
        } else {
          commandBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.proto.simulation.RobotCommand command = 3;</code>
       */
      public Builder mergeCommand(proto.simulation.SslSimulationRobotControl.RobotCommand value) {
        if (commandBuilder_ == null) {
          if (command_ != null) {
            command_ =
              proto.simulation.SslSimulationRobotControl.RobotCommand.newBuilder(command_).mergeFrom(value).buildPartial();
          } else {
            command_ = value;
          }
          onChanged();
        } else {
          commandBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.proto.simulation.RobotCommand command = 3;</code>
       */
      public Builder clearCommand() {
        if (commandBuilder_ == null) {
          command_ = null;
          onChanged();
        } else {
          command_ = null;
          commandBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.proto.simulation.RobotCommand command = 3;</code>
       */
      public proto.simulation.SslSimulationRobotControl.RobotCommand.Builder getCommandBuilder() {
        
        onChanged();
        return getCommandFieldBuilder().getBuilder();
      }
      /**
       * <code>.proto.simulation.RobotCommand command = 3;</code>
       */
      public proto.simulation.SslSimulationRobotControl.RobotCommandOrBuilder getCommandOrBuilder() {
        if (commandBuilder_ != null) {
          return commandBuilder_.getMessageOrBuilder();
        } else {
          return command_ == null ?
              proto.simulation.SslSimulationRobotControl.RobotCommand.getDefaultInstance() : command_;
        }
      }
      /**
       * <code>.proto.simulation.RobotCommand command = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          proto.simulation.SslSimulationRobotControl.RobotCommand, proto.simulation.SslSimulationRobotControl.RobotCommand.Builder, proto.simulation.SslSimulationRobotControl.RobotCommandOrBuilder> 
          getCommandFieldBuilder() {
        if (commandBuilder_ == null) {
          commandBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              proto.simulation.SslSimulationRobotControl.RobotCommand, proto.simulation.SslSimulationRobotControl.RobotCommand.Builder, proto.simulation.SslSimulationRobotControl.RobotCommandOrBuilder>(
                  getCommand(),
                  getParentForChildren(),
                  isClean());
          command_ = null;
        }
        return commandBuilder_;
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


      // @@protoc_insertion_point(builder_scope:proto.triton.TritonBotMessage)
    }

    // @@protoc_insertion_point(class_scope:proto.triton.TritonBotMessage)
    private static final proto.triton.TritonBotCommunication.TritonBotMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new proto.triton.TritonBotCommunication.TritonBotMessage();
    }

    public static proto.triton.TritonBotCommunication.TritonBotMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TritonBotMessage>
        PARSER = new com.google.protobuf.AbstractParser<TritonBotMessage>() {
      @java.lang.Override
      public TritonBotMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TritonBotMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TritonBotMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TritonBotMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public proto.triton.TritonBotCommunication.TritonBotMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_triton_TritonBotMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_triton_TritonBotMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036triton_bot_communication.proto\022\014proto." +
      "triton\032\"ssl_simulation_robot_control.pro" +
      "to\032$messages_robocup_ssl_detection.proto" +
      "\"\201\001\n\020TritonBotMessage\022\n\n\002id\030\001 \001(\005\0220\n\006vis" +
      "ion\030\002 \001(\0132 .proto.vision.SSL_DetectionRo" +
      "bot\022/\n\007command\030\003 \001(\0132\036.proto.simulation." +
      "RobotCommandb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          proto.simulation.SslSimulationRobotControl.getDescriptor(),
          proto.vision.MessagesRobocupSslDetection.getDescriptor(),
        });
    internal_static_proto_triton_TritonBotMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_triton_TritonBotMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_triton_TritonBotMessage_descriptor,
        new java.lang.String[] { "Id", "Vision", "Command", });
    proto.simulation.SslSimulationRobotControl.getDescriptor();
    proto.vision.MessagesRobocupSslDetection.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
