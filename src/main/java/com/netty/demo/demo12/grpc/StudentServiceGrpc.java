package com.netty.demo.demo12.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.*;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: Student.proto")
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.netty.demo.grpc.StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<MyRequest,
      MyResponse> getGetRealNameByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRealNameByUsername",
      requestType = MyRequest.class,
      responseType = MyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MyRequest,
      MyResponse> getGetRealNameByUsernameMethod() {
    io.grpc.MethodDescriptor<MyRequest, MyResponse> getGetRealNameByUsernameMethod;
    if ((getGetRealNameByUsernameMethod = StudentServiceGrpc.getGetRealNameByUsernameMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetRealNameByUsernameMethod = StudentServiceGrpc.getGetRealNameByUsernameMethod) == null) {
          StudentServiceGrpc.getGetRealNameByUsernameMethod = getGetRealNameByUsernameMethod =
              io.grpc.MethodDescriptor.<MyRequest, MyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.netty.demo.grpc.StudentService", "GetRealNameByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetRealNameByUsername"))
                  .build();
          }
        }
     }
     return getGetRealNameByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<StudentRequest,
      StudentResponse> getGetStudentByAgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentByAge",
      requestType = StudentRequest.class,
      responseType = StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<StudentRequest,
      StudentResponse> getGetStudentByAgeMethod() {
    io.grpc.MethodDescriptor<StudentRequest, StudentResponse> getGetStudentByAgeMethod;
    if ((getGetStudentByAgeMethod = StudentServiceGrpc.getGetStudentByAgeMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentByAgeMethod = StudentServiceGrpc.getGetStudentByAgeMethod) == null) {
          StudentServiceGrpc.getGetStudentByAgeMethod = getGetStudentByAgeMethod =
              io.grpc.MethodDescriptor.<StudentRequest, StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.netty.demo.grpc.StudentService", "GetStudentByAge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentByAge"))
                  .build();
          }
        }
     }
     return getGetStudentByAgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<StudentRequest,
      StudentResponseList> getGetStudentWrapperByAgesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentWrapperByAges",
      requestType = StudentRequest.class,
      responseType = StudentResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<StudentRequest,
      StudentResponseList> getGetStudentWrapperByAgesMethod() {
    io.grpc.MethodDescriptor<StudentRequest, StudentResponseList> getGetStudentWrapperByAgesMethod;
    if ((getGetStudentWrapperByAgesMethod = StudentServiceGrpc.getGetStudentWrapperByAgesMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentWrapperByAgesMethod = StudentServiceGrpc.getGetStudentWrapperByAgesMethod) == null) {
          StudentServiceGrpc.getGetStudentWrapperByAgesMethod = getGetStudentWrapperByAgesMethod =
              io.grpc.MethodDescriptor.<StudentRequest, StudentResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.netty.demo.grpc.StudentService", "GetStudentWrapperByAges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StudentResponseList.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentWrapperByAges"))
                  .build();
          }
        }
     }
     return getGetStudentWrapperByAgesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<StreamRequest,
      StreamResponse> getBiTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BiTask",
      requestType = StreamRequest.class,
      responseType = StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<StreamRequest,
      StreamResponse> getBiTaskMethod() {
    io.grpc.MethodDescriptor<StreamRequest, StreamResponse> getBiTaskMethod;
    if ((getBiTaskMethod = StudentServiceGrpc.getBiTaskMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getBiTaskMethod = StudentServiceGrpc.getBiTaskMethod) == null) {
          StudentServiceGrpc.getBiTaskMethod = getBiTaskMethod =
              io.grpc.MethodDescriptor.<StreamRequest, StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.netty.demo.grpc.StudentService", "BiTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("BiTask"))
                  .build();
          }
        }
     }
     return getBiTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    return new StudentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRealNameByUsername(MyRequest request,
                                      io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRealNameByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void getStudentByAge(StudentRequest request,
                                io.grpc.stub.StreamObserver<StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentByAgeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<StudentRequest> getStudentWrapperByAges(
        io.grpc.stub.StreamObserver<StudentResponseList> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetStudentWrapperByAgesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<StreamRequest> biTask(
        io.grpc.stub.StreamObserver<StreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBiTaskMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRealNameByUsernameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MyRequest,
                MyResponse>(
                  this, METHODID_GET_REAL_NAME_BY_USERNAME)))
          .addMethod(
            getGetStudentByAgeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                StudentRequest,
                StudentResponse>(
                  this, METHODID_GET_STUDENT_BY_AGE)))
          .addMethod(
            getGetStudentWrapperByAgesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                StudentRequest,
                StudentResponseList>(
                  this, METHODID_GET_STUDENT_WRAPPER_BY_AGES)))
          .addMethod(
            getBiTaskMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                StreamRequest,
                StreamResponse>(
                  this, METHODID_BI_TASK)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServiceStub extends io.grpc.stub.AbstractStub<StudentServiceStub> {
    private StudentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StudentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRealNameByUsername(MyRequest request,
                                      io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRealNameByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentByAge(StudentRequest request,
                                io.grpc.stub.StreamObserver<StudentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStudentByAgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<StudentRequest> getStudentWrapperByAges(
        io.grpc.stub.StreamObserver<StudentResponseList> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetStudentWrapperByAgesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<StreamRequest> biTask(
        io.grpc.stub.StreamObserver<StreamResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBiTaskMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StudentServiceBlockingStub extends io.grpc.stub.AbstractStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StudentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public MyResponse getRealNameByUsername(MyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRealNameByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<StudentResponse> getStudentByAge(
        StudentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStudentByAgeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServiceFutureStub extends io.grpc.stub.AbstractStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StudentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MyResponse> getRealNameByUsername(
        MyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRealNameByUsernameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REAL_NAME_BY_USERNAME = 0;
  private static final int METHODID_GET_STUDENT_BY_AGE = 1;
  private static final int METHODID_GET_STUDENT_WRAPPER_BY_AGES = 2;
  private static final int METHODID_BI_TASK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REAL_NAME_BY_USERNAME:
          serviceImpl.getRealNameByUsername((MyRequest) request,
              (io.grpc.stub.StreamObserver<MyResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT_BY_AGE:
          serviceImpl.getStudentByAge((StudentRequest) request,
              (io.grpc.stub.StreamObserver<StudentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STUDENT_WRAPPER_BY_AGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getStudentWrapperByAges(
              (io.grpc.stub.StreamObserver<StudentResponseList>) responseObserver);
        case METHODID_BI_TASK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biTask(
              (io.grpc.stub.StreamObserver<StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return StudentProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getGetRealNameByUsernameMethod())
              .addMethod(getGetStudentByAgeMethod())
              .addMethod(getGetStudentWrapperByAgesMethod())
              .addMethod(getBiTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
