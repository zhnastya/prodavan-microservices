package users;

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
  private static volatile io.grpc.MethodDescriptor<users.UserOuterClass.CreateUserRequest,
      users.UserOuterClass.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = users.UserOuterClass.CreateUserRequest.class,
      responseType = users.UserOuterClass.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<users.UserOuterClass.CreateUserRequest,
      users.UserOuterClass.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<users.UserOuterClass.CreateUserRequest, users.UserOuterClass.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod = 
              io.grpc.MethodDescriptor.<users.UserOuterClass.CreateUserRequest, users.UserOuterClass.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.user.UserService", "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.CreateUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
                  .build();
          }
        }
     }
     return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<users.UserOuterClass.FindByUserIdRequest,
      users.UserOuterClass.FindUserByAttribute> getFindByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindByUserId",
      requestType = users.UserOuterClass.FindByUserIdRequest.class,
      responseType = users.UserOuterClass.FindUserByAttribute.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<users.UserOuterClass.FindByUserIdRequest,
      users.UserOuterClass.FindUserByAttribute> getFindByUserIdMethod() {
    io.grpc.MethodDescriptor<users.UserOuterClass.FindByUserIdRequest, users.UserOuterClass.FindUserByAttribute> getFindByUserIdMethod;
    if ((getFindByUserIdMethod = UserServiceGrpc.getFindByUserIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindByUserIdMethod = UserServiceGrpc.getFindByUserIdMethod) == null) {
          UserServiceGrpc.getFindByUserIdMethod = getFindByUserIdMethod = 
              io.grpc.MethodDescriptor.<users.UserOuterClass.FindByUserIdRequest, users.UserOuterClass.FindUserByAttribute>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.user.UserService", "FindByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.FindByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.FindUserByAttribute.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("FindByUserId"))
                  .build();
          }
        }
     }
     return getFindByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<users.UserOuterClass.FindByUserEmailRequest,
      users.UserOuterClass.FindUserByAttribute> getFindByEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindByEmail",
      requestType = users.UserOuterClass.FindByUserEmailRequest.class,
      responseType = users.UserOuterClass.FindUserByAttribute.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<users.UserOuterClass.FindByUserEmailRequest,
      users.UserOuterClass.FindUserByAttribute> getFindByEmailMethod() {
    io.grpc.MethodDescriptor<users.UserOuterClass.FindByUserEmailRequest, users.UserOuterClass.FindUserByAttribute> getFindByEmailMethod;
    if ((getFindByEmailMethod = UserServiceGrpc.getFindByEmailMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindByEmailMethod = UserServiceGrpc.getFindByEmailMethod) == null) {
          UserServiceGrpc.getFindByEmailMethod = getFindByEmailMethod = 
              io.grpc.MethodDescriptor.<users.UserOuterClass.FindByUserEmailRequest, users.UserOuterClass.FindUserByAttribute>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.user.UserService", "FindByEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.FindByUserEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.FindUserByAttribute.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("FindByEmail"))
                  .build();
          }
        }
     }
     return getFindByEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<users.UserOuterClass.FindAllUsersRequest,
      users.UserOuterClass.FindUserByAttribute> getFindAllUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAllUsers",
      requestType = users.UserOuterClass.FindAllUsersRequest.class,
      responseType = users.UserOuterClass.FindUserByAttribute.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<users.UserOuterClass.FindAllUsersRequest,
      users.UserOuterClass.FindUserByAttribute> getFindAllUsersMethod() {
    io.grpc.MethodDescriptor<users.UserOuterClass.FindAllUsersRequest, users.UserOuterClass.FindUserByAttribute> getFindAllUsersMethod;
    if ((getFindAllUsersMethod = UserServiceGrpc.getFindAllUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindAllUsersMethod = UserServiceGrpc.getFindAllUsersMethod) == null) {
          UserServiceGrpc.getFindAllUsersMethod = getFindAllUsersMethod = 
              io.grpc.MethodDescriptor.<users.UserOuterClass.FindAllUsersRequest, users.UserOuterClass.FindUserByAttribute>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.user.UserService", "FindAllUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.FindAllUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.FindUserByAttribute.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("FindAllUsers"))
                  .build();
          }
        }
     }
     return getFindAllUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<users.UserOuterClass.UpdateUserRequest,
      users.UserOuterClass.FindUserByAttribute> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = users.UserOuterClass.UpdateUserRequest.class,
      responseType = users.UserOuterClass.FindUserByAttribute.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<users.UserOuterClass.UpdateUserRequest,
      users.UserOuterClass.FindUserByAttribute> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<users.UserOuterClass.UpdateUserRequest, users.UserOuterClass.FindUserByAttribute> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod = 
              io.grpc.MethodDescriptor.<users.UserOuterClass.UpdateUserRequest, users.UserOuterClass.FindUserByAttribute>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.user.UserService", "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.FindUserByAttribute.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
                  .build();
          }
        }
     }
     return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<users.UserOuterClass.SaveImageUserRequest,
      users.UserOuterClass.SaveImageResponse> getSaveAvatarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveAvatar",
      requestType = users.UserOuterClass.SaveImageUserRequest.class,
      responseType = users.UserOuterClass.SaveImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<users.UserOuterClass.SaveImageUserRequest,
      users.UserOuterClass.SaveImageResponse> getSaveAvatarMethod() {
    io.grpc.MethodDescriptor<users.UserOuterClass.SaveImageUserRequest, users.UserOuterClass.SaveImageResponse> getSaveAvatarMethod;
    if ((getSaveAvatarMethod = UserServiceGrpc.getSaveAvatarMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSaveAvatarMethod = UserServiceGrpc.getSaveAvatarMethod) == null) {
          UserServiceGrpc.getSaveAvatarMethod = getSaveAvatarMethod = 
              io.grpc.MethodDescriptor.<users.UserOuterClass.SaveImageUserRequest, users.UserOuterClass.SaveImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.user.UserService", "SaveAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.SaveImageUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.SaveImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SaveAvatar"))
                  .build();
          }
        }
     }
     return getSaveAvatarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<users.UserOuterClass.UpdateImageUserRequest,
      users.UserOuterClass.SaveImageResponse> getUpdateAvatarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAvatar",
      requestType = users.UserOuterClass.UpdateImageUserRequest.class,
      responseType = users.UserOuterClass.SaveImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<users.UserOuterClass.UpdateImageUserRequest,
      users.UserOuterClass.SaveImageResponse> getUpdateAvatarMethod() {
    io.grpc.MethodDescriptor<users.UserOuterClass.UpdateImageUserRequest, users.UserOuterClass.SaveImageResponse> getUpdateAvatarMethod;
    if ((getUpdateAvatarMethod = UserServiceGrpc.getUpdateAvatarMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateAvatarMethod = UserServiceGrpc.getUpdateAvatarMethod) == null) {
          UserServiceGrpc.getUpdateAvatarMethod = getUpdateAvatarMethod = 
              io.grpc.MethodDescriptor.<users.UserOuterClass.UpdateImageUserRequest, users.UserOuterClass.SaveImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.user.UserService", "UpdateAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.UpdateImageUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.SaveImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateAvatar"))
                  .build();
          }
        }
     }
     return getUpdateAvatarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<users.UserOuterClass.GetAvatarRequest,
      users.UserOuterClass.GetAvatarResponse> getGetAvatarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvatar",
      requestType = users.UserOuterClass.GetAvatarRequest.class,
      responseType = users.UserOuterClass.GetAvatarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<users.UserOuterClass.GetAvatarRequest,
      users.UserOuterClass.GetAvatarResponse> getGetAvatarMethod() {
    io.grpc.MethodDescriptor<users.UserOuterClass.GetAvatarRequest, users.UserOuterClass.GetAvatarResponse> getGetAvatarMethod;
    if ((getGetAvatarMethod = UserServiceGrpc.getGetAvatarMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAvatarMethod = UserServiceGrpc.getGetAvatarMethod) == null) {
          UserServiceGrpc.getGetAvatarMethod = getGetAvatarMethod = 
              io.grpc.MethodDescriptor.<users.UserOuterClass.GetAvatarRequest, users.UserOuterClass.GetAvatarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.user.UserService", "GetAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.GetAvatarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  users.UserOuterClass.GetAvatarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAvatar"))
                  .build();
          }
        }
     }
     return getGetAvatarMethod;
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
    public void createUser(users.UserOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.CreateUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void findByUserId(users.UserOuterClass.FindByUserIdRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.FindUserByAttribute> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByUserIdMethod(), responseObserver);
    }

    /**
     */
    public void findByEmail(users.UserOuterClass.FindByUserEmailRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.FindUserByAttribute> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByEmailMethod(), responseObserver);
    }

    /**
     */
    public void findAllUsers(users.UserOuterClass.FindAllUsersRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.FindUserByAttribute> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllUsersMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(users.UserOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.FindUserByAttribute> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void saveAvatar(users.UserOuterClass.SaveImageUserRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.SaveImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveAvatarMethod(), responseObserver);
    }

    /**
     */
    public void updateAvatar(users.UserOuterClass.UpdateImageUserRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.SaveImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAvatarMethod(), responseObserver);
    }

    /**
     */
    public void getAvatar(users.UserOuterClass.GetAvatarRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.GetAvatarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAvatarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                users.UserOuterClass.CreateUserRequest,
                users.UserOuterClass.CreateUserResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getFindByUserIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                users.UserOuterClass.FindByUserIdRequest,
                users.UserOuterClass.FindUserByAttribute>(
                  this, METHODID_FIND_BY_USER_ID)))
          .addMethod(
            getFindByEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                users.UserOuterClass.FindByUserEmailRequest,
                users.UserOuterClass.FindUserByAttribute>(
                  this, METHODID_FIND_BY_EMAIL)))
          .addMethod(
            getFindAllUsersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                users.UserOuterClass.FindAllUsersRequest,
                users.UserOuterClass.FindUserByAttribute>(
                  this, METHODID_FIND_ALL_USERS)))
          .addMethod(
            getUpdateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                users.UserOuterClass.UpdateUserRequest,
                users.UserOuterClass.FindUserByAttribute>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getSaveAvatarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                users.UserOuterClass.SaveImageUserRequest,
                users.UserOuterClass.SaveImageResponse>(
                  this, METHODID_SAVE_AVATAR)))
          .addMethod(
            getUpdateAvatarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                users.UserOuterClass.UpdateImageUserRequest,
                users.UserOuterClass.SaveImageResponse>(
                  this, METHODID_UPDATE_AVATAR)))
          .addMethod(
            getGetAvatarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                users.UserOuterClass.GetAvatarRequest,
                users.UserOuterClass.GetAvatarResponse>(
                  this, METHODID_GET_AVATAR)))
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
    public void createUser(users.UserOuterClass.CreateUserRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.CreateUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByUserId(users.UserOuterClass.FindByUserIdRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.FindUserByAttribute> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByEmail(users.UserOuterClass.FindByUserEmailRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.FindUserByAttribute> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllUsers(users.UserOuterClass.FindAllUsersRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.FindUserByAttribute> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFindAllUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(users.UserOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.FindUserByAttribute> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveAvatar(users.UserOuterClass.SaveImageUserRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.SaveImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveAvatarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAvatar(users.UserOuterClass.UpdateImageUserRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.SaveImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAvatarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAvatar(users.UserOuterClass.GetAvatarRequest request,
        io.grpc.stub.StreamObserver<users.UserOuterClass.GetAvatarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAvatarMethod(), getCallOptions()), request, responseObserver);
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
    public users.UserOuterClass.CreateUserResponse createUser(users.UserOuterClass.CreateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public users.UserOuterClass.FindUserByAttribute findByUserId(users.UserOuterClass.FindByUserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public users.UserOuterClass.FindUserByAttribute findByEmail(users.UserOuterClass.FindByUserEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<users.UserOuterClass.FindUserByAttribute> findAllUsers(
        users.UserOuterClass.FindAllUsersRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFindAllUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public users.UserOuterClass.FindUserByAttribute updateUser(users.UserOuterClass.UpdateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public users.UserOuterClass.SaveImageResponse saveAvatar(users.UserOuterClass.SaveImageUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveAvatarMethod(), getCallOptions(), request);
    }

    /**
     */
    public users.UserOuterClass.SaveImageResponse updateAvatar(users.UserOuterClass.UpdateImageUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAvatarMethod(), getCallOptions(), request);
    }

    /**
     */
    public users.UserOuterClass.GetAvatarResponse getAvatar(users.UserOuterClass.GetAvatarRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAvatarMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<users.UserOuterClass.CreateUserResponse> createUser(
        users.UserOuterClass.CreateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<users.UserOuterClass.FindUserByAttribute> findByUserId(
        users.UserOuterClass.FindByUserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByUserIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<users.UserOuterClass.FindUserByAttribute> findByEmail(
        users.UserOuterClass.FindByUserEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<users.UserOuterClass.FindUserByAttribute> updateUser(
        users.UserOuterClass.UpdateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<users.UserOuterClass.SaveImageResponse> saveAvatar(
        users.UserOuterClass.SaveImageUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveAvatarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<users.UserOuterClass.SaveImageResponse> updateAvatar(
        users.UserOuterClass.UpdateImageUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAvatarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<users.UserOuterClass.GetAvatarResponse> getAvatar(
        users.UserOuterClass.GetAvatarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAvatarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_FIND_BY_USER_ID = 1;
  private static final int METHODID_FIND_BY_EMAIL = 2;
  private static final int METHODID_FIND_ALL_USERS = 3;
  private static final int METHODID_UPDATE_USER = 4;
  private static final int METHODID_SAVE_AVATAR = 5;
  private static final int METHODID_UPDATE_AVATAR = 6;
  private static final int METHODID_GET_AVATAR = 7;

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
          serviceImpl.createUser((users.UserOuterClass.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<users.UserOuterClass.CreateUserResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_USER_ID:
          serviceImpl.findByUserId((users.UserOuterClass.FindByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<users.UserOuterClass.FindUserByAttribute>) responseObserver);
          break;
        case METHODID_FIND_BY_EMAIL:
          serviceImpl.findByEmail((users.UserOuterClass.FindByUserEmailRequest) request,
              (io.grpc.stub.StreamObserver<users.UserOuterClass.FindUserByAttribute>) responseObserver);
          break;
        case METHODID_FIND_ALL_USERS:
          serviceImpl.findAllUsers((users.UserOuterClass.FindAllUsersRequest) request,
              (io.grpc.stub.StreamObserver<users.UserOuterClass.FindUserByAttribute>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((users.UserOuterClass.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<users.UserOuterClass.FindUserByAttribute>) responseObserver);
          break;
        case METHODID_SAVE_AVATAR:
          serviceImpl.saveAvatar((users.UserOuterClass.SaveImageUserRequest) request,
              (io.grpc.stub.StreamObserver<users.UserOuterClass.SaveImageResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AVATAR:
          serviceImpl.updateAvatar((users.UserOuterClass.UpdateImageUserRequest) request,
              (io.grpc.stub.StreamObserver<users.UserOuterClass.SaveImageResponse>) responseObserver);
          break;
        case METHODID_GET_AVATAR:
          serviceImpl.getAvatar((users.UserOuterClass.GetAvatarRequest) request,
              (io.grpc.stub.StreamObserver<users.UserOuterClass.GetAvatarResponse>) responseObserver);
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
      return users.UserOuterClass.getDescriptor();
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
              .addMethod(getFindByEmailMethod())
              .addMethod(getFindAllUsersMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getSaveAvatarMethod())
              .addMethod(getUpdateAvatarMethod())
              .addMethod(getGetAvatarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
