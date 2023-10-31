package comments;

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
    comments = "Source: Comment.proto")
public final class CommentServiceGrpc {

  private CommentServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.server.grpc_server.pet.CommentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<comments.CommentOuterClass.CreateCommentRequest,
      comments.CommentOuterClass.CreateCommentResponse> getCreateCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateComment",
      requestType = comments.CommentOuterClass.CreateCommentRequest.class,
      responseType = comments.CommentOuterClass.CreateCommentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<comments.CommentOuterClass.CreateCommentRequest,
      comments.CommentOuterClass.CreateCommentResponse> getCreateCommentMethod() {
    io.grpc.MethodDescriptor<comments.CommentOuterClass.CreateCommentRequest, comments.CommentOuterClass.CreateCommentResponse> getCreateCommentMethod;
    if ((getCreateCommentMethod = CommentServiceGrpc.getCreateCommentMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getCreateCommentMethod = CommentServiceGrpc.getCreateCommentMethod) == null) {
          CommentServiceGrpc.getCreateCommentMethod = getCreateCommentMethod = 
              io.grpc.MethodDescriptor.<comments.CommentOuterClass.CreateCommentRequest, comments.CommentOuterClass.CreateCommentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.pet.CommentService", "CreateComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  comments.CommentOuterClass.CreateCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  comments.CommentOuterClass.CreateCommentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("CreateComment"))
                  .build();
          }
        }
     }
     return getCreateCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<comments.CommentOuterClass.FindByUserIdCommentRequest,
      comments.CommentOuterClass.FindByUserIdCommentResponse> getFindByUserIdCommentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindByUserIdComments",
      requestType = comments.CommentOuterClass.FindByUserIdCommentRequest.class,
      responseType = comments.CommentOuterClass.FindByUserIdCommentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<comments.CommentOuterClass.FindByUserIdCommentRequest,
      comments.CommentOuterClass.FindByUserIdCommentResponse> getFindByUserIdCommentsMethod() {
    io.grpc.MethodDescriptor<comments.CommentOuterClass.FindByUserIdCommentRequest, comments.CommentOuterClass.FindByUserIdCommentResponse> getFindByUserIdCommentsMethod;
    if ((getFindByUserIdCommentsMethod = CommentServiceGrpc.getFindByUserIdCommentsMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getFindByUserIdCommentsMethod = CommentServiceGrpc.getFindByUserIdCommentsMethod) == null) {
          CommentServiceGrpc.getFindByUserIdCommentsMethod = getFindByUserIdCommentsMethod = 
              io.grpc.MethodDescriptor.<comments.CommentOuterClass.FindByUserIdCommentRequest, comments.CommentOuterClass.FindByUserIdCommentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.pet.CommentService", "FindByUserIdComments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  comments.CommentOuterClass.FindByUserIdCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  comments.CommentOuterClass.FindByUserIdCommentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("FindByUserIdComments"))
                  .build();
          }
        }
     }
     return getFindByUserIdCommentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommentServiceStub newStub(io.grpc.Channel channel) {
    return new CommentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CommentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createComment(comments.CommentOuterClass.CreateCommentRequest request,
        io.grpc.stub.StreamObserver<comments.CommentOuterClass.CreateCommentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCommentMethod(), responseObserver);
    }

    /**
     */
    public void findByUserIdComments(comments.CommentOuterClass.FindByUserIdCommentRequest request,
        io.grpc.stub.StreamObserver<comments.CommentOuterClass.FindByUserIdCommentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByUserIdCommentsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCommentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                comments.CommentOuterClass.CreateCommentRequest,
                comments.CommentOuterClass.CreateCommentResponse>(
                  this, METHODID_CREATE_COMMENT)))
          .addMethod(
            getFindByUserIdCommentsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                comments.CommentOuterClass.FindByUserIdCommentRequest,
                comments.CommentOuterClass.FindByUserIdCommentResponse>(
                  this, METHODID_FIND_BY_USER_ID_COMMENTS)))
          .build();
    }
  }

  /**
   */
  public static final class CommentServiceStub extends io.grpc.stub.AbstractStub<CommentServiceStub> {
    private CommentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommentServiceStub(channel, callOptions);
    }

    /**
     */
    public void createComment(comments.CommentOuterClass.CreateCommentRequest request,
        io.grpc.stub.StreamObserver<comments.CommentOuterClass.CreateCommentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByUserIdComments(comments.CommentOuterClass.FindByUserIdCommentRequest request,
        io.grpc.stub.StreamObserver<comments.CommentOuterClass.FindByUserIdCommentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFindByUserIdCommentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommentServiceBlockingStub extends io.grpc.stub.AbstractStub<CommentServiceBlockingStub> {
    private CommentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public comments.CommentOuterClass.CreateCommentResponse createComment(comments.CommentOuterClass.CreateCommentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<comments.CommentOuterClass.FindByUserIdCommentResponse> findByUserIdComments(
        comments.CommentOuterClass.FindByUserIdCommentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFindByUserIdCommentsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommentServiceFutureStub extends io.grpc.stub.AbstractStub<CommentServiceFutureStub> {
    private CommentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<comments.CommentOuterClass.CreateCommentResponse> createComment(
        comments.CommentOuterClass.CreateCommentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COMMENT = 0;
  private static final int METHODID_FIND_BY_USER_ID_COMMENTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_COMMENT:
          serviceImpl.createComment((comments.CommentOuterClass.CreateCommentRequest) request,
              (io.grpc.stub.StreamObserver<comments.CommentOuterClass.CreateCommentResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_USER_ID_COMMENTS:
          serviceImpl.findByUserIdComments((comments.CommentOuterClass.FindByUserIdCommentRequest) request,
              (io.grpc.stub.StreamObserver<comments.CommentOuterClass.FindByUserIdCommentResponse>) responseObserver);
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

  private static abstract class CommentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return comments.CommentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommentService");
    }
  }

  private static final class CommentServiceFileDescriptorSupplier
      extends CommentServiceBaseDescriptorSupplier {
    CommentServiceFileDescriptorSupplier() {}
  }

  private static final class CommentServiceMethodDescriptorSupplier
      extends CommentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommentServiceFileDescriptorSupplier())
              .addMethod(getCreateCommentMethod())
              .addMethod(getFindByUserIdCommentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
