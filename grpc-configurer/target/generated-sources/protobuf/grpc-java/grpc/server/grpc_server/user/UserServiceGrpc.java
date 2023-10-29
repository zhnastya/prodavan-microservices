package grpc.server.grpc_server.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: User.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.server.grpc_server.user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.server.grpc_server.user.UserOuterClass.CreateUserRequest,
      grpc.server.grpc_server.user.UserOuterClass.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = grpc.server.grpc_server.user.UserOuterClass.CreateUserRequest.class,
      responseType = grpc.server.grpc_server.user.UserOuterClass.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.grpc_server.user.UserOuterClass.CreateUserRequest,
      grpc.server.grpc_server.user.UserOuterClass.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<grpc.server.grpc_server.user.UserOuterClass.CreateUserRequest, grpc.server.grpc_server.user.UserOuterClass.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod = 
              io.grpc.MethodDescriptor.<grpc.server.grpc_server.user.UserOuterClass.CreateUserRequest, grpc.server.grpc_server.user.UserOuterClass.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.user.UserService", "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.grpc_server.user.UserOuterClass.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.grpc_server.user.UserOuterClass.CreateUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
                  .build();
          }
        }
     }
     return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.grpc_server.user.UserOuterClass.FindByUserIdRequest,
      grpc.server.grpc_server.user.UserOuterClass.FindByUserIdResponse> getFindByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindByUserId",
      requestType = grpc.server.grpc_server.user.UserOuterClass.FindByUserIdRequest.class,
      responseType = grpc.server.grpc_server.user.UserOuterClass.FindByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.grpc_server.user.UserOuterClass.FindByUserIdRequest,
      grpc.server.grpc_server.user.UserOuterClass.FindByUserIdResponse> getFindByUserIdMethod() {
    io.grpc.MethodDescriptor<grpc.server.grpc_server.user.UserOuterClass.FindByUserIdRequest, grpc.server.grpc_server.user.UserOuterClass.FindByUserIdResponse> getFindByUserIdMethod;
    if ((getFindByUserIdMethod = UserServiceGrpc.getFindByUserIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindByUserIdMethod = UserServiceGrpc.getFindByUserIdMethod) == null) {
          UserServiceGrpc.getFindByUserIdMethod = getFindByUserIdMethod = 
              io.grpc.MethodDescriptor.<grpc.server.grpc_server.user.UserOuterClass.FindByUserIdRequest, grpc.server.grpc_server.user.UserOuterClass.FindByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.user.UserService", "FindByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.grpc_server.user.UserOuterClass.FindByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.grpc_server.user.UserOuterClass.FindByUserIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("FindByUserId"))
                  .build();
          }
        }
     }
     return getFindByUserIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(grpc.server.grpc_server.user.UserOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<grpc.server.grpc_server.user.UserOuterClass.CreateUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void findByUserId(grpc.server.grpc_server.user.UserOuterClass.FindByUserIdRequest request,
        io.grpc.stub.StreamObserver<grpc.server.grpc_server.user.UserOuterClass.FindByUserIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByUserIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.server.grpc_server.user.UserOuterClass.CreateUserRequest,
                grpc.server.grpc_server.user.UserOuterClass.CreateUserResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getFindByUserIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.server.grpc_server.user.UserOuterClass.FindByUserIdRequest,
                grpc.server.grpc_server.user.UserOuterClass.FindByUserIdResponse>(
                  this, METHODID_FIND_BY_USER_ID)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(grpc.server.grpc_server.user.UserOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<grpc.server.grpc_server.user.UserOuterClass.CreateUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByUserId(grpc.server.grpc_server.user.UserOuterClass.FindByUserIdRequest request,
        io.grpc.stub.StreamObserver<grpc.server.grpc_server.user.UserOuterClass.FindByUserIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByUserIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.server.grpc_server.user.UserOuterClass.CreateUserResponse createUser(grpc.server.grpc_server.user.UserOuterClass.CreateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.server.grpc_server.user.UserOuterClass.FindByUserIdResponse findByUserId(grpc.server.grpc_server.user.UserOuterClass.FindByUserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByUserIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.grpc_server.user.UserOuterClass.CreateUserResponse> createUser(
        grpc.server.grpc_server.user.UserOuterClass.CreateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.grpc_server.user.UserOuterClass.FindByUserIdResponse> findByUserId(
        grpc.server.grpc_server.user.UserOuterClass.FindByUserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByUserIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_FIND_BY_USER_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((grpc.server.grpc_server.user.UserOuterClass.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.grpc_server.user.UserOuterClass.CreateUserResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_USER_ID:
          serviceImpl.findByUserId((grpc.server.grpc_server.user.UserOuterClass.FindByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.grpc_server.user.UserOuterClass.FindByUserIdResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.server.grpc_server.user.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getFindByUserIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
