package netty_08_Protobuf_code02;

public final class MyDataInfo {
  private MyDataInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MyMessageOrBuilder extends
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *用data_type 来标识传的是哪一个枚举类型
     * </pre>
     *
     * <code>.MyMessage.DataType data_type = 1;</code>
     */
    int getDataTypeValue();
    /**
     * <pre>
     *用data_type 来标识传的是哪一个枚举类型
     * </pre>
     *
     * <code>.MyMessage.DataType data_type = 1;</code>
     */
    MyMessage.DataType getDataType();

    /**
     * <code>.Student student = 2;</code>
     */
    boolean hasStudent();
    /**
     * <code>.Student student = 2;</code>
     */
    Student getStudent();
    /**
     * <code>.Student student = 2;</code>
     */
    StudentOrBuilder getStudentOrBuilder();

    /**
     * <code>.Worker worker = 3;</code>
     */
    boolean hasWorker();
    /**
     * <code>.Worker worker = 3;</code>
     */
    Worker getWorker();
    /**
     * <code>.Worker worker = 3;</code>
     */
    WorkerOrBuilder getWorkerOrBuilder();

    public MyMessage.DataBodyCase getDataBodyCase();
  }
  /**
   * <pre>
   *protobuf 可以使用message 管理其他的message
   * </pre>
   *
   * Protobuf type {@code MyMessage}
   */
  public  static final class MyMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MyMessage)
      MyMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MyMessage.newBuilder() to construct.
    private MyMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MyMessage() {
      dataType_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MyMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
              int rawValue = input.readEnum();

              dataType_ = rawValue;
              break;
            }
            case 18: {
              Student.Builder subBuilder = null;
              if (dataBodyCase_ == 2) {
                subBuilder = ((Student) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(Student.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((Student) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 2;
              break;
            }
            case 26: {
              Worker.Builder subBuilder = null;
              if (dataBodyCase_ == 3) {
                subBuilder = ((Worker) dataBody_).toBuilder();
              }
              dataBody_ =
                  input.readMessage(Worker.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((Worker) dataBody_);
                dataBody_ = subBuilder.buildPartial();
              }
              dataBodyCase_ = 3;
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
      return MyDataInfo.internal_static_MyMessage_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MyDataInfo.internal_static_MyMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MyMessage.class, Builder.class);
    }

    /**
     * <pre>
     *定义一个枚举类型
     * </pre>
     *
     * Protobuf enum {@code MyMessage.DataType}
     */
    public enum DataType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       *在proto3 要求enum的编号从0开始
       * </pre>
       *
       * <code>StudentType = 0;</code>
       */
      StudentType(0),
      /**
       * <code>WorkerType = 1;</code>
       */
      WorkerType(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <pre>
       *在proto3 要求enum的编号从0开始
       * </pre>
       *
       * <code>StudentType = 0;</code>
       */
      public static final int StudentType_VALUE = 0;
      /**
       * <code>WorkerType = 1;</code>
       */
      public static final int WorkerType_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static DataType valueOf(int value) {
        return forNumber(value);
      }

      public static DataType forNumber(int value) {
        switch (value) {
          case 0: return StudentType;
          case 1: return WorkerType;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DataType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DataType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
              public DataType findValueByNumber(int number) {
                return DataType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return MyMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final DataType[] VALUES = values();

      public static DataType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private DataType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MyMessage.DataType)
    }

    private int dataBodyCase_ = 0;
    private Object dataBody_;
    public enum DataBodyCase
        implements com.google.protobuf.Internal.EnumLite {
      STUDENT(2),
      WORKER(3),
      DATABODY_NOT_SET(0);
      private final int value;
      private DataBodyCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static DataBodyCase valueOf(int value) {
        return forNumber(value);
      }

      public static DataBodyCase forNumber(int value) {
        switch (value) {
          case 2: return STUDENT;
          case 3: return WORKER;
          case 0: return DATABODY_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public DataBodyCase
    getDataBodyCase() {
      return DataBodyCase.forNumber(
          dataBodyCase_);
    }

    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private int dataType_;
    /**
     * <pre>
     *用data_type 来标识传的是哪一个枚举类型
     * </pre>
     *
     * <code>.MyMessage.DataType data_type = 1;</code>
     */
    public int getDataTypeValue() {
      return dataType_;
    }
    /**
     * <pre>
     *用data_type 来标识传的是哪一个枚举类型
     * </pre>
     *
     * <code>.MyMessage.DataType data_type = 1;</code>
     */
    public DataType getDataType() {
      @SuppressWarnings("deprecation")
      DataType result = DataType.valueOf(dataType_);
      return result == null ? DataType.UNRECOGNIZED : result;
    }

    public static final int STUDENT_FIELD_NUMBER = 2;
    /**
     * <code>.Student student = 2;</code>
     */
    public boolean hasStudent() {
      return dataBodyCase_ == 2;
    }
    /**
     * <code>.Student student = 2;</code>
     */
    public Student getStudent() {
      if (dataBodyCase_ == 2) {
         return (Student) dataBody_;
      }
      return Student.getDefaultInstance();
    }
    /**
     * <code>.Student student = 2;</code>
     */
    public StudentOrBuilder getStudentOrBuilder() {
      if (dataBodyCase_ == 2) {
         return (Student) dataBody_;
      }
      return Student.getDefaultInstance();
    }

    public static final int WORKER_FIELD_NUMBER = 3;
    /**
     * <code>.Worker worker = 3;</code>
     */
    public boolean hasWorker() {
      return dataBodyCase_ == 3;
    }
    /**
     * <code>.Worker worker = 3;</code>
     */
    public Worker getWorker() {
      if (dataBodyCase_ == 3) {
         return (Worker) dataBody_;
      }
      return Worker.getDefaultInstance();
    }
    /**
     * <code>.Worker worker = 3;</code>
     */
    public WorkerOrBuilder getWorkerOrBuilder() {
      if (dataBodyCase_ == 3) {
         return (Worker) dataBody_;
      }
      return Worker.getDefaultInstance();
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (dataType_ != DataType.StudentType.getNumber()) {
        output.writeEnum(1, dataType_);
      }
      if (dataBodyCase_ == 2) {
        output.writeMessage(2, (Student) dataBody_);
      }
      if (dataBodyCase_ == 3) {
        output.writeMessage(3, (Worker) dataBody_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dataType_ != DataType.StudentType.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, dataType_);
      }
      if (dataBodyCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (Student) dataBody_);
      }
      if (dataBodyCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, (Worker) dataBody_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof MyMessage)) {
        return super.equals(obj);
      }
      MyMessage other = (MyMessage) obj;

      boolean result = true;
      result = result && dataType_ == other.dataType_;
      result = result && getDataBodyCase().equals(
          other.getDataBodyCase());
      if (!result) return false;
      switch (dataBodyCase_) {
        case 2:
          result = result && getStudent()
              .equals(other.getStudent());
          break;
        case 3:
          result = result && getWorker()
              .equals(other.getWorker());
          break;
        case 0:
        default:
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DATA_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + dataType_;
      switch (dataBodyCase_) {
        case 2:
          hash = (37 * hash) + STUDENT_FIELD_NUMBER;
          hash = (53 * hash) + getStudent().hashCode();
          break;
        case 3:
          hash = (37 * hash) + WORKER_FIELD_NUMBER;
          hash = (53 * hash) + getWorker().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MyMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MyMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MyMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MyMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MyMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MyMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MyMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MyMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MyMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MyMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MyMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MyMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(MyMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *protobuf 可以使用message 管理其他的message
     * </pre>
     *
     * Protobuf type {@code MyMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MyMessage)
        MyMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MyDataInfo.internal_static_MyMessage_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MyDataInfo.internal_static_MyMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MyMessage.class, Builder.class);
      }

      // Construct using com.atguigu.netty.codec2.MyDataInfo.MyMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        dataType_ = 0;

        dataBodyCase_ = 0;
        dataBody_ = null;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MyDataInfo.internal_static_MyMessage_descriptor;
      }

      @Override
      public MyMessage getDefaultInstanceForType() {
        return MyMessage.getDefaultInstance();
      }

      @Override
      public MyMessage build() {
        MyMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public MyMessage buildPartial() {
        MyMessage result = new MyMessage(this);
        result.dataType_ = dataType_;
        if (dataBodyCase_ == 2) {
          if (studentBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = studentBuilder_.build();
          }
        }
        if (dataBodyCase_ == 3) {
          if (workerBuilder_ == null) {
            result.dataBody_ = dataBody_;
          } else {
            result.dataBody_ = workerBuilder_.build();
          }
        }
        result.dataBodyCase_ = dataBodyCase_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MyMessage) {
          return mergeFrom((MyMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MyMessage other) {
        if (other == MyMessage.getDefaultInstance()) return this;
        if (other.dataType_ != 0) {
          setDataTypeValue(other.getDataTypeValue());
        }
        switch (other.getDataBodyCase()) {
          case STUDENT: {
            mergeStudent(other.getStudent());
            break;
          }
          case WORKER: {
            mergeWorker(other.getWorker());
            break;
          }
          case DATABODY_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MyMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MyMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int dataBodyCase_ = 0;
      private Object dataBody_;
      public DataBodyCase
          getDataBodyCase() {
        return DataBodyCase.forNumber(
            dataBodyCase_);
      }

      public Builder clearDataBody() {
        dataBodyCase_ = 0;
        dataBody_ = null;
        onChanged();
        return this;
      }


      private int dataType_ = 0;
      /**
       * <pre>
       *用data_type 来标识传的是哪一个枚举类型
       * </pre>
       *
       * <code>.MyMessage.DataType data_type = 1;</code>
       */
      public int getDataTypeValue() {
        return dataType_;
      }
      /**
       * <pre>
       *用data_type 来标识传的是哪一个枚举类型
       * </pre>
       *
       * <code>.MyMessage.DataType data_type = 1;</code>
       */
      public Builder setDataTypeValue(int value) {
        dataType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *用data_type 来标识传的是哪一个枚举类型
       * </pre>
       *
       * <code>.MyMessage.DataType data_type = 1;</code>
       */
      public DataType getDataType() {
        @SuppressWarnings("deprecation")
        DataType result = DataType.valueOf(dataType_);
        return result == null ? DataType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       *用data_type 来标识传的是哪一个枚举类型
       * </pre>
       *
       * <code>.MyMessage.DataType data_type = 1;</code>
       */
      public Builder setDataType(DataType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dataType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *用data_type 来标识传的是哪一个枚举类型
       * </pre>
       *
       * <code>.MyMessage.DataType data_type = 1;</code>
       */
      public Builder clearDataType() {
        
        dataType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          Student, Student.Builder, StudentOrBuilder> studentBuilder_;
      /**
       * <code>.Student student = 2;</code>
       */
      public boolean hasStudent() {
        return dataBodyCase_ == 2;
      }
      /**
       * <code>.Student student = 2;</code>
       */
      public Student getStudent() {
        if (studentBuilder_ == null) {
          if (dataBodyCase_ == 2) {
            return (Student) dataBody_;
          }
          return Student.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 2) {
            return studentBuilder_.getMessage();
          }
          return Student.getDefaultInstance();
        }
      }
      /**
       * <code>.Student student = 2;</code>
       */
      public Builder setStudent(Student value) {
        if (studentBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          studentBuilder_.setMessage(value);
        }
        dataBodyCase_ = 2;
        return this;
      }
      /**
       * <code>.Student student = 2;</code>
       */
      public Builder setStudent(
          Student.Builder builderForValue) {
        if (studentBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          studentBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 2;
        return this;
      }
      /**
       * <code>.Student student = 2;</code>
       */
      public Builder mergeStudent(Student value) {
        if (studentBuilder_ == null) {
          if (dataBodyCase_ == 2 &&
              dataBody_ != Student.getDefaultInstance()) {
            dataBody_ = Student.newBuilder((Student) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 2) {
            studentBuilder_.mergeFrom(value);
          }
          studentBuilder_.setMessage(value);
        }
        dataBodyCase_ = 2;
        return this;
      }
      /**
       * <code>.Student student = 2;</code>
       */
      public Builder clearStudent() {
        if (studentBuilder_ == null) {
          if (dataBodyCase_ == 2) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 2) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          studentBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.Student student = 2;</code>
       */
      public Student.Builder getStudentBuilder() {
        return getStudentFieldBuilder().getBuilder();
      }
      /**
       * <code>.Student student = 2;</code>
       */
      public StudentOrBuilder getStudentOrBuilder() {
        if ((dataBodyCase_ == 2) && (studentBuilder_ != null)) {
          return studentBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 2) {
            return (Student) dataBody_;
          }
          return Student.getDefaultInstance();
        }
      }
      /**
       * <code>.Student student = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          Student, Student.Builder, StudentOrBuilder>
          getStudentFieldBuilder() {
        if (studentBuilder_ == null) {
          if (!(dataBodyCase_ == 2)) {
            dataBody_ = Student.getDefaultInstance();
          }
          studentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              Student, Student.Builder, StudentOrBuilder>(
                  (Student) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 2;
        onChanged();;
        return studentBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          Worker, Worker.Builder, WorkerOrBuilder> workerBuilder_;
      /**
       * <code>.Worker worker = 3;</code>
       */
      public boolean hasWorker() {
        return dataBodyCase_ == 3;
      }
      /**
       * <code>.Worker worker = 3;</code>
       */
      public Worker getWorker() {
        if (workerBuilder_ == null) {
          if (dataBodyCase_ == 3) {
            return (Worker) dataBody_;
          }
          return Worker.getDefaultInstance();
        } else {
          if (dataBodyCase_ == 3) {
            return workerBuilder_.getMessage();
          }
          return Worker.getDefaultInstance();
        }
      }
      /**
       * <code>.Worker worker = 3;</code>
       */
      public Builder setWorker(Worker value) {
        if (workerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dataBody_ = value;
          onChanged();
        } else {
          workerBuilder_.setMessage(value);
        }
        dataBodyCase_ = 3;
        return this;
      }
      /**
       * <code>.Worker worker = 3;</code>
       */
      public Builder setWorker(
          Worker.Builder builderForValue) {
        if (workerBuilder_ == null) {
          dataBody_ = builderForValue.build();
          onChanged();
        } else {
          workerBuilder_.setMessage(builderForValue.build());
        }
        dataBodyCase_ = 3;
        return this;
      }
      /**
       * <code>.Worker worker = 3;</code>
       */
      public Builder mergeWorker(Worker value) {
        if (workerBuilder_ == null) {
          if (dataBodyCase_ == 3 &&
              dataBody_ != Worker.getDefaultInstance()) {
            dataBody_ = Worker.newBuilder((Worker) dataBody_)
                .mergeFrom(value).buildPartial();
          } else {
            dataBody_ = value;
          }
          onChanged();
        } else {
          if (dataBodyCase_ == 3) {
            workerBuilder_.mergeFrom(value);
          }
          workerBuilder_.setMessage(value);
        }
        dataBodyCase_ = 3;
        return this;
      }
      /**
       * <code>.Worker worker = 3;</code>
       */
      public Builder clearWorker() {
        if (workerBuilder_ == null) {
          if (dataBodyCase_ == 3) {
            dataBodyCase_ = 0;
            dataBody_ = null;
            onChanged();
          }
        } else {
          if (dataBodyCase_ == 3) {
            dataBodyCase_ = 0;
            dataBody_ = null;
          }
          workerBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.Worker worker = 3;</code>
       */
      public Worker.Builder getWorkerBuilder() {
        return getWorkerFieldBuilder().getBuilder();
      }
      /**
       * <code>.Worker worker = 3;</code>
       */
      public WorkerOrBuilder getWorkerOrBuilder() {
        if ((dataBodyCase_ == 3) && (workerBuilder_ != null)) {
          return workerBuilder_.getMessageOrBuilder();
        } else {
          if (dataBodyCase_ == 3) {
            return (Worker) dataBody_;
          }
          return Worker.getDefaultInstance();
        }
      }
      /**
       * <code>.Worker worker = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          Worker, Worker.Builder, WorkerOrBuilder>
          getWorkerFieldBuilder() {
        if (workerBuilder_ == null) {
          if (!(dataBodyCase_ == 3)) {
            dataBody_ = Worker.getDefaultInstance();
          }
          workerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              Worker, Worker.Builder, WorkerOrBuilder>(
                  (Worker) dataBody_,
                  getParentForChildren(),
                  isClean());
          dataBody_ = null;
        }
        dataBodyCase_ = 3;
        onChanged();;
        return workerBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MyMessage)
    }

    // @@protoc_insertion_point(class_scope:MyMessage)
    private static final MyMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MyMessage();
    }

    public static MyMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MyMessage>
        PARSER = new com.google.protobuf.AbstractParser<MyMessage>() {
      @Override
      public MyMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MyMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MyMessage> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<MyMessage> getParserForType() {
      return PARSER;
    }

    @Override
    public MyMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface StudentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Student)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *Student类的属性
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    int getId();

    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    String getName();
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code Student}
   */
  public  static final class Student extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Student)
      StudentOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Student.newBuilder() to construct.
    private Student(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Student() {
      id_ = 0;
      name_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Student(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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

              id_ = input.readInt32();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              name_ = s;
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
      return MyDataInfo.internal_static_Student_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MyDataInfo.internal_static_Student_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Student.class, Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <pre>
     *Student类的属性
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile Object name_;
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Student)) {
        return super.equals(obj);
      }
      Student other = (Student) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
      result = result && getName()
          .equals(other.getName());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Student parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Student parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Student parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Student parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Student parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Student parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Student parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Student parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Student parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Student parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Student parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Student parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Student prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Student}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Student)
        StudentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MyDataInfo.internal_static_Student_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MyDataInfo.internal_static_Student_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Student.class, Builder.class);
      }

      // Construct using com.atguigu.netty.codec2.MyDataInfo.Student.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        id_ = 0;

        name_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MyDataInfo.internal_static_Student_descriptor;
      }

      @Override
      public Student getDefaultInstanceForType() {
        return Student.getDefaultInstance();
      }

      @Override
      public Student build() {
        Student result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Student buildPartial() {
        Student result = new Student(this);
        result.id_ = id_;
        result.name_ = name_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Student) {
          return mergeFrom((Student)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Student other) {
        if (other == Student.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Student parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Student) e.getUnfinishedMessage();
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
       * <pre>
       *Student类的属性
       * </pre>
       *
       * <code>int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <pre>
       *Student类的属性
       * </pre>
       *
       * <code>int32 id = 1;</code>
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *Student类的属性
       * </pre>
       *
       * <code>int32 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private Object name_ = "";
      /**
       * <pre>
       * </pre>
       *
       * <code>string name = 2;</code>
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string name = 2;</code>
       */
      public Builder setName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string name = 2;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * </pre>
       *
       * <code>string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Student)
    }

    // @@protoc_insertion_point(class_scope:Student)
    private static final Student DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Student();
    }

    public static Student getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Student>
        PARSER = new com.google.protobuf.AbstractParser<Student>() {
      @Override
      public Student parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Student(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Student> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Student> getParserForType() {
      return PARSER;
    }

    @Override
    public Student getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface WorkerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Worker)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     */
    String getName();
    /**
     * <code>string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int32 age = 2;</code>
     */
    int getAge();
  }
  /**
   * Protobuf type {@code Worker}
   */
  public  static final class Worker extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Worker)
      WorkerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Worker.newBuilder() to construct.
    private Worker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Worker() {
      name_ = "";
      age_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Worker(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
              String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 16: {

              age_ = input.readInt32();
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
      return MyDataInfo.internal_static_Worker_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MyDataInfo.internal_static_Worker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Worker.class, Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile Object name_;
    /**
     * <code>string name = 1;</code>
     */
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private int age_;
    /**
     * <code>int32 age = 2;</code>
     */
    public int getAge() {
      return age_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (age_ != 0) {
        output.writeInt32(2, age_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, age_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Worker)) {
        return super.equals(obj);
      }
      Worker other = (Worker) obj;

      boolean result = true;
      result = result && getName()
          .equals(other.getName());
      result = result && (getAge()
          == other.getAge());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Worker parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Worker parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Worker parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Worker parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Worker parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Worker parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Worker parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Worker parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Worker parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Worker parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Worker parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Worker parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Worker prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Worker}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Worker)
        WorkerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MyDataInfo.internal_static_Worker_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MyDataInfo.internal_static_Worker_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Worker.class, Builder.class);
      }

      // Construct using com.atguigu.netty.codec2.MyDataInfo.Worker.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        name_ = "";

        age_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MyDataInfo.internal_static_Worker_descriptor;
      }

      @Override
      public Worker getDefaultInstanceForType() {
        return Worker.getDefaultInstance();
      }

      @Override
      public Worker build() {
        Worker result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Worker buildPartial() {
        Worker result = new Worker(this);
        result.name_ = name_;
        result.age_ = age_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Worker) {
          return mergeFrom((Worker)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Worker other) {
        if (other == Worker.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getAge() != 0) {
          setAge(other.getAge());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Worker parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Worker) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object name_ = "";
      /**
       * <code>string name = 1;</code>
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>int32 age = 2;</code>
       */
      public int getAge() {
        return age_;
      }
      /**
       * <code>int32 age = 2;</code>
       */
      public Builder setAge(int value) {
        
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 age = 2;</code>
       */
      public Builder clearAge() {
        
        age_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Worker)
    }

    // @@protoc_insertion_point(class_scope:Worker)
    private static final Worker DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Worker();
    }

    public static Worker getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Worker>
        PARSER = new com.google.protobuf.AbstractParser<Worker>() {
      @Override
      public Worker parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Worker(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Worker> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Worker> getParserForType() {
      return PARSER;
    }

    @Override
    public Worker getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MyMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MyMessage_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Student_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Student_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Worker_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Worker_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rStudent.proto\"\244\001\n\tMyMessage\022&\n\tdata_ty" +
      "pe\030\001 \001(\0162\023.MyMessage.DataType\022\033\n\007student" +
      "\030\002 \001(\0132\010.StudentH\000\022\031\n\006worker\030\003 \001(\0132\007.Wor" +
      "kerH\000\"+\n\010DataType\022\017\n\013StudentType\020\000\022\016\n\nWo" +
      "rkerType\020\001B\n\n\010dataBody\"#\n\007Student\022\n\n\002id\030" +
      "\001 \001(\005\022\014\n\004name\030\002 \001(\t\"#\n\006Worker\022\014\n\004name\030\001 " +
      "\001(\t\022\013\n\003age\030\002 \001(\005B(\n\030com.atguigu.netty.co" +
      "dec2B\nMyDataInfoH\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_MyMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MyMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MyMessage_descriptor,
        new String[] { "DataType", "Student", "Worker", "DataBody", });
    internal_static_Student_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Student_descriptor,
        new String[] { "Id", "Name", });
    internal_static_Worker_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Worker_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Worker_descriptor,
        new String[] { "Name", "Age", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
