package products;

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
    comments = "Source: Product.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.server.grpc_server.product.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<products.ProductOuterClass.SaveProductRequest,
      products.ProductOuterClass.SaveProductResponse> getCreateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProduct",
      requestType = products.ProductOuterClass.SaveProductRequest.class,
      responseType = products.ProductOuterClass.SaveProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<products.ProductOuterClass.SaveProductRequest,
      products.ProductOuterClass.SaveProductResponse> getCreateProductMethod() {
    io.grpc.MethodDescriptor<products.ProductOuterClass.SaveProductRequest, products.ProductOuterClass.SaveProductResponse> getCreateProductMethod;
    if ((getCreateProductMethod = ProductServiceGrpc.getCreateProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getCreateProductMethod = ProductServiceGrpc.getCreateProductMethod) == null) {
          ProductServiceGrpc.getCreateProductMethod = getCreateProductMethod = 
              io.grpc.MethodDescriptor.<products.ProductOuterClass.SaveProductRequest, products.ProductOuterClass.SaveProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.product.ProductService", "CreateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.SaveProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.SaveProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("CreateProduct"))
                  .build();
          }
        }
     }
     return getCreateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<products.ProductOuterClass.GetProductByIdRequest,
      products.ProductOuterClass.GetProductResponse> getGetProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductById",
      requestType = products.ProductOuterClass.GetProductByIdRequest.class,
      responseType = products.ProductOuterClass.GetProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<products.ProductOuterClass.GetProductByIdRequest,
      products.ProductOuterClass.GetProductResponse> getGetProductByIdMethod() {
    io.grpc.MethodDescriptor<products.ProductOuterClass.GetProductByIdRequest, products.ProductOuterClass.GetProductResponse> getGetProductByIdMethod;
    if ((getGetProductByIdMethod = ProductServiceGrpc.getGetProductByIdMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductByIdMethod = ProductServiceGrpc.getGetProductByIdMethod) == null) {
          ProductServiceGrpc.getGetProductByIdMethod = getGetProductByIdMethod = 
              io.grpc.MethodDescriptor.<products.ProductOuterClass.GetProductByIdRequest, products.ProductOuterClass.GetProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.product.ProductService", "GetProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetProductByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProductById"))
                  .build();
          }
        }
     }
     return getGetProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<products.ProductOuterClass.FindAllByAttributeRequest,
      products.ProductOuterClass.GetProductResponse> getFindAllByAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAllByAttribute",
      requestType = products.ProductOuterClass.FindAllByAttributeRequest.class,
      responseType = products.ProductOuterClass.GetProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<products.ProductOuterClass.FindAllByAttributeRequest,
      products.ProductOuterClass.GetProductResponse> getFindAllByAttributeMethod() {
    io.grpc.MethodDescriptor<products.ProductOuterClass.FindAllByAttributeRequest, products.ProductOuterClass.GetProductResponse> getFindAllByAttributeMethod;
    if ((getFindAllByAttributeMethod = ProductServiceGrpc.getFindAllByAttributeMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getFindAllByAttributeMethod = ProductServiceGrpc.getFindAllByAttributeMethod) == null) {
          ProductServiceGrpc.getFindAllByAttributeMethod = getFindAllByAttributeMethod = 
              io.grpc.MethodDescriptor.<products.ProductOuterClass.FindAllByAttributeRequest, products.ProductOuterClass.GetProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.product.ProductService", "FindAllByAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.FindAllByAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("FindAllByAttribute"))
                  .build();
          }
        }
     }
     return getFindAllByAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<products.ProductOuterClass.FindAllByAttributeRequest,
      products.ProductOuterClass.GetProductResponse> getFindByCityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindByCity",
      requestType = products.ProductOuterClass.FindAllByAttributeRequest.class,
      responseType = products.ProductOuterClass.GetProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<products.ProductOuterClass.FindAllByAttributeRequest,
      products.ProductOuterClass.GetProductResponse> getFindByCityMethod() {
    io.grpc.MethodDescriptor<products.ProductOuterClass.FindAllByAttributeRequest, products.ProductOuterClass.GetProductResponse> getFindByCityMethod;
    if ((getFindByCityMethod = ProductServiceGrpc.getFindByCityMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getFindByCityMethod = ProductServiceGrpc.getFindByCityMethod) == null) {
          ProductServiceGrpc.getFindByCityMethod = getFindByCityMethod = 
              io.grpc.MethodDescriptor.<products.ProductOuterClass.FindAllByAttributeRequest, products.ProductOuterClass.GetProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.product.ProductService", "FindByCity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.FindAllByAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("FindByCity"))
                  .build();
          }
        }
     }
     return getFindByCityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<products.ProductOuterClass.GetPagesSizeRequest,
      products.ProductOuterClass.PagesSizeResponse> getGetPagesSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPagesSize",
      requestType = products.ProductOuterClass.GetPagesSizeRequest.class,
      responseType = products.ProductOuterClass.PagesSizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<products.ProductOuterClass.GetPagesSizeRequest,
      products.ProductOuterClass.PagesSizeResponse> getGetPagesSizeMethod() {
    io.grpc.MethodDescriptor<products.ProductOuterClass.GetPagesSizeRequest, products.ProductOuterClass.PagesSizeResponse> getGetPagesSizeMethod;
    if ((getGetPagesSizeMethod = ProductServiceGrpc.getGetPagesSizeMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetPagesSizeMethod = ProductServiceGrpc.getGetPagesSizeMethod) == null) {
          ProductServiceGrpc.getGetPagesSizeMethod = getGetPagesSizeMethod = 
              io.grpc.MethodDescriptor.<products.ProductOuterClass.GetPagesSizeRequest, products.ProductOuterClass.PagesSizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.product.ProductService", "GetPagesSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetPagesSizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.PagesSizeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetPagesSize"))
                  .build();
          }
        }
     }
     return getGetPagesSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<products.ProductOuterClass.GetImageByIdRequest,
      products.ProductOuterClass.GetProductResponse.Image> getGetImageByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImageById",
      requestType = products.ProductOuterClass.GetImageByIdRequest.class,
      responseType = products.ProductOuterClass.GetProductResponse.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<products.ProductOuterClass.GetImageByIdRequest,
      products.ProductOuterClass.GetProductResponse.Image> getGetImageByIdMethod() {
    io.grpc.MethodDescriptor<products.ProductOuterClass.GetImageByIdRequest, products.ProductOuterClass.GetProductResponse.Image> getGetImageByIdMethod;
    if ((getGetImageByIdMethod = ProductServiceGrpc.getGetImageByIdMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetImageByIdMethod = ProductServiceGrpc.getGetImageByIdMethod) == null) {
          ProductServiceGrpc.getGetImageByIdMethod = getGetImageByIdMethod = 
              io.grpc.MethodDescriptor.<products.ProductOuterClass.GetImageByIdRequest, products.ProductOuterClass.GetProductResponse.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.product.ProductService", "GetImageById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetImageByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetProductResponse.Image.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetImageById"))
                  .build();
          }
        }
     }
     return getGetImageByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<products.ProductOuterClass.GetImagesByProductIdRequest,
      products.ProductOuterClass.GetProductResponse.Image> getGetAllImagesByProdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllImagesByProd",
      requestType = products.ProductOuterClass.GetImagesByProductIdRequest.class,
      responseType = products.ProductOuterClass.GetProductResponse.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<products.ProductOuterClass.GetImagesByProductIdRequest,
      products.ProductOuterClass.GetProductResponse.Image> getGetAllImagesByProdMethod() {
    io.grpc.MethodDescriptor<products.ProductOuterClass.GetImagesByProductIdRequest, products.ProductOuterClass.GetProductResponse.Image> getGetAllImagesByProdMethod;
    if ((getGetAllImagesByProdMethod = ProductServiceGrpc.getGetAllImagesByProdMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetAllImagesByProdMethod = ProductServiceGrpc.getGetAllImagesByProdMethod) == null) {
          ProductServiceGrpc.getGetAllImagesByProdMethod = getGetAllImagesByProdMethod = 
              io.grpc.MethodDescriptor.<products.ProductOuterClass.GetImagesByProductIdRequest, products.ProductOuterClass.GetProductResponse.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.product.ProductService", "GetAllImagesByProd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetImagesByProductIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetProductResponse.Image.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetAllImagesByProd"))
                  .build();
          }
        }
     }
     return getGetAllImagesByProdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<products.ProductOuterClass.GetProductByUserIdRequest,
      products.ProductOuterClass.GetProductResponse> getGetMyProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyProduct",
      requestType = products.ProductOuterClass.GetProductByUserIdRequest.class,
      responseType = products.ProductOuterClass.GetProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<products.ProductOuterClass.GetProductByUserIdRequest,
      products.ProductOuterClass.GetProductResponse> getGetMyProductMethod() {
    io.grpc.MethodDescriptor<products.ProductOuterClass.GetProductByUserIdRequest, products.ProductOuterClass.GetProductResponse> getGetMyProductMethod;
    if ((getGetMyProductMethod = ProductServiceGrpc.getGetMyProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetMyProductMethod = ProductServiceGrpc.getGetMyProductMethod) == null) {
          ProductServiceGrpc.getGetMyProductMethod = getGetMyProductMethod = 
              io.grpc.MethodDescriptor.<products.ProductOuterClass.GetProductByUserIdRequest, products.ProductOuterClass.GetProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.product.ProductService", "GetMyProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetProductByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetMyProduct"))
                  .build();
          }
        }
     }
     return getGetMyProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<products.ProductOuterClass.SaveLikeProductRequest,
      products.ProductOuterClass.SaveLikeProductResponse> getSaveLikeProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveLikeProduct",
      requestType = products.ProductOuterClass.SaveLikeProductRequest.class,
      responseType = products.ProductOuterClass.SaveLikeProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<products.ProductOuterClass.SaveLikeProductRequest,
      products.ProductOuterClass.SaveLikeProductResponse> getSaveLikeProductMethod() {
    io.grpc.MethodDescriptor<products.ProductOuterClass.SaveLikeProductRequest, products.ProductOuterClass.SaveLikeProductResponse> getSaveLikeProductMethod;
    if ((getSaveLikeProductMethod = ProductServiceGrpc.getSaveLikeProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getSaveLikeProductMethod = ProductServiceGrpc.getSaveLikeProductMethod) == null) {
          ProductServiceGrpc.getSaveLikeProductMethod = getSaveLikeProductMethod = 
              io.grpc.MethodDescriptor.<products.ProductOuterClass.SaveLikeProductRequest, products.ProductOuterClass.SaveLikeProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.product.ProductService", "SaveLikeProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.SaveLikeProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.SaveLikeProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("SaveLikeProduct"))
                  .build();
          }
        }
     }
     return getSaveLikeProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<products.ProductOuterClass.RemoveLikeProductRequest,
      products.ProductOuterClass.SaveLikeProductResponse> getRemoveLikeProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveLikeProduct",
      requestType = products.ProductOuterClass.RemoveLikeProductRequest.class,
      responseType = products.ProductOuterClass.SaveLikeProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<products.ProductOuterClass.RemoveLikeProductRequest,
      products.ProductOuterClass.SaveLikeProductResponse> getRemoveLikeProductMethod() {
    io.grpc.MethodDescriptor<products.ProductOuterClass.RemoveLikeProductRequest, products.ProductOuterClass.SaveLikeProductResponse> getRemoveLikeProductMethod;
    if ((getRemoveLikeProductMethod = ProductServiceGrpc.getRemoveLikeProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getRemoveLikeProductMethod = ProductServiceGrpc.getRemoveLikeProductMethod) == null) {
          ProductServiceGrpc.getRemoveLikeProductMethod = getRemoveLikeProductMethod = 
              io.grpc.MethodDescriptor.<products.ProductOuterClass.RemoveLikeProductRequest, products.ProductOuterClass.SaveLikeProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.product.ProductService", "RemoveLikeProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.RemoveLikeProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.SaveLikeProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("RemoveLikeProduct"))
                  .build();
          }
        }
     }
     return getRemoveLikeProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<products.ProductOuterClass.GetLikesProductRequest,
      products.ProductOuterClass.GetProductResponse> getGetLikesProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLikesProduct",
      requestType = products.ProductOuterClass.GetLikesProductRequest.class,
      responseType = products.ProductOuterClass.GetProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<products.ProductOuterClass.GetLikesProductRequest,
      products.ProductOuterClass.GetProductResponse> getGetLikesProductMethod() {
    io.grpc.MethodDescriptor<products.ProductOuterClass.GetLikesProductRequest, products.ProductOuterClass.GetProductResponse> getGetLikesProductMethod;
    if ((getGetLikesProductMethod = ProductServiceGrpc.getGetLikesProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetLikesProductMethod = ProductServiceGrpc.getGetLikesProductMethod) == null) {
          ProductServiceGrpc.getGetLikesProductMethod = getGetLikesProductMethod = 
              io.grpc.MethodDescriptor.<products.ProductOuterClass.GetLikesProductRequest, products.ProductOuterClass.GetProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "grpc.server.grpc_server.product.ProductService", "GetLikesProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetLikesProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  products.ProductOuterClass.GetProductResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetLikesProduct"))
                  .build();
          }
        }
     }
     return getGetLikesProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    return new ProductServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProduct(products.ProductOuterClass.SaveProductRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.SaveProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProductMethod(), responseObserver);
    }

    /**
     */
    public void getProductById(products.ProductOuterClass.GetProductByIdRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductByIdMethod(), responseObserver);
    }

    /**
     */
    public void findAllByAttribute(products.ProductOuterClass.FindAllByAttributeRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllByAttributeMethod(), responseObserver);
    }

    /**
     */
    public void findByCity(products.ProductOuterClass.FindAllByAttributeRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByCityMethod(), responseObserver);
    }

    /**
     */
    public void getPagesSize(products.ProductOuterClass.GetPagesSizeRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.PagesSizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPagesSizeMethod(), responseObserver);
    }

    /**
     */
    public void getImageById(products.ProductOuterClass.GetImageByIdRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse.Image> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImageByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllImagesByProd(products.ProductOuterClass.GetImagesByProductIdRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse.Image> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllImagesByProdMethod(), responseObserver);
    }

    /**
     */
    public void getMyProduct(products.ProductOuterClass.GetProductByUserIdRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMyProductMethod(), responseObserver);
    }

    /**
     */
    public void saveLikeProduct(products.ProductOuterClass.SaveLikeProductRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.SaveLikeProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveLikeProductMethod(), responseObserver);
    }

    /**
     */
    public void removeLikeProduct(products.ProductOuterClass.RemoveLikeProductRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.SaveLikeProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveLikeProductMethod(), responseObserver);
    }

    /**
     */
    public void getLikesProduct(products.ProductOuterClass.GetLikesProductRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLikesProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                products.ProductOuterClass.SaveProductRequest,
                products.ProductOuterClass.SaveProductResponse>(
                  this, METHODID_CREATE_PRODUCT)))
          .addMethod(
            getGetProductByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                products.ProductOuterClass.GetProductByIdRequest,
                products.ProductOuterClass.GetProductResponse>(
                  this, METHODID_GET_PRODUCT_BY_ID)))
          .addMethod(
            getFindAllByAttributeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                products.ProductOuterClass.FindAllByAttributeRequest,
                products.ProductOuterClass.GetProductResponse>(
                  this, METHODID_FIND_ALL_BY_ATTRIBUTE)))
          .addMethod(
            getFindByCityMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                products.ProductOuterClass.FindAllByAttributeRequest,
                products.ProductOuterClass.GetProductResponse>(
                  this, METHODID_FIND_BY_CITY)))
          .addMethod(
            getGetPagesSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                products.ProductOuterClass.GetPagesSizeRequest,
                products.ProductOuterClass.PagesSizeResponse>(
                  this, METHODID_GET_PAGES_SIZE)))
          .addMethod(
            getGetImageByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                products.ProductOuterClass.GetImageByIdRequest,
                products.ProductOuterClass.GetProductResponse.Image>(
                  this, METHODID_GET_IMAGE_BY_ID)))
          .addMethod(
            getGetAllImagesByProdMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                products.ProductOuterClass.GetImagesByProductIdRequest,
                products.ProductOuterClass.GetProductResponse.Image>(
                  this, METHODID_GET_ALL_IMAGES_BY_PROD)))
          .addMethod(
            getGetMyProductMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                products.ProductOuterClass.GetProductByUserIdRequest,
                products.ProductOuterClass.GetProductResponse>(
                  this, METHODID_GET_MY_PRODUCT)))
          .addMethod(
            getSaveLikeProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                products.ProductOuterClass.SaveLikeProductRequest,
                products.ProductOuterClass.SaveLikeProductResponse>(
                  this, METHODID_SAVE_LIKE_PRODUCT)))
          .addMethod(
            getRemoveLikeProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                products.ProductOuterClass.RemoveLikeProductRequest,
                products.ProductOuterClass.SaveLikeProductResponse>(
                  this, METHODID_REMOVE_LIKE_PRODUCT)))
          .addMethod(
            getGetLikesProductMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                products.ProductOuterClass.GetLikesProductRequest,
                products.ProductOuterClass.GetProductResponse>(
                  this, METHODID_GET_LIKES_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractStub<ProductServiceStub> {
    private ProductServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProduct(products.ProductOuterClass.SaveProductRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.SaveProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductById(products.ProductOuterClass.GetProductByIdRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllByAttribute(products.ProductOuterClass.FindAllByAttributeRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFindAllByAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByCity(products.ProductOuterClass.FindAllByAttributeRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFindByCityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPagesSize(products.ProductOuterClass.GetPagesSizeRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.PagesSizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPagesSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImageById(products.ProductOuterClass.GetImageByIdRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse.Image> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImageByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllImagesByProd(products.ProductOuterClass.GetImagesByProductIdRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse.Image> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllImagesByProdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMyProduct(products.ProductOuterClass.GetProductByUserIdRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMyProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveLikeProduct(products.ProductOuterClass.SaveLikeProductRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.SaveLikeProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveLikeProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeLikeProduct(products.ProductOuterClass.RemoveLikeProductRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.SaveLikeProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveLikeProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLikesProduct(products.ProductOuterClass.GetLikesProductRequest request,
        io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetLikesProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public products.ProductOuterClass.SaveProductResponse createProduct(products.ProductOuterClass.SaveProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public products.ProductOuterClass.GetProductResponse getProductById(products.ProductOuterClass.GetProductByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<products.ProductOuterClass.GetProductResponse> findAllByAttribute(
        products.ProductOuterClass.FindAllByAttributeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFindAllByAttributeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<products.ProductOuterClass.GetProductResponse> findByCity(
        products.ProductOuterClass.FindAllByAttributeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFindByCityMethod(), getCallOptions(), request);
    }

    /**
     */
    public products.ProductOuterClass.PagesSizeResponse getPagesSize(products.ProductOuterClass.GetPagesSizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPagesSizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public products.ProductOuterClass.GetProductResponse.Image getImageById(products.ProductOuterClass.GetImageByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetImageByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<products.ProductOuterClass.GetProductResponse.Image> getAllImagesByProd(
        products.ProductOuterClass.GetImagesByProductIdRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllImagesByProdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<products.ProductOuterClass.GetProductResponse> getMyProduct(
        products.ProductOuterClass.GetProductByUserIdRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMyProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public products.ProductOuterClass.SaveLikeProductResponse saveLikeProduct(products.ProductOuterClass.SaveLikeProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveLikeProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public products.ProductOuterClass.SaveLikeProductResponse removeLikeProduct(products.ProductOuterClass.RemoveLikeProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveLikeProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<products.ProductOuterClass.GetProductResponse> getLikesProduct(
        products.ProductOuterClass.GetLikesProductRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetLikesProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<products.ProductOuterClass.SaveProductResponse> createProduct(
        products.ProductOuterClass.SaveProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<products.ProductOuterClass.GetProductResponse> getProductById(
        products.ProductOuterClass.GetProductByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<products.ProductOuterClass.PagesSizeResponse> getPagesSize(
        products.ProductOuterClass.GetPagesSizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPagesSizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<products.ProductOuterClass.GetProductResponse.Image> getImageById(
        products.ProductOuterClass.GetImageByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImageByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<products.ProductOuterClass.SaveLikeProductResponse> saveLikeProduct(
        products.ProductOuterClass.SaveLikeProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveLikeProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<products.ProductOuterClass.SaveLikeProductResponse> removeLikeProduct(
        products.ProductOuterClass.RemoveLikeProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveLikeProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCT_BY_ID = 1;
  private static final int METHODID_FIND_ALL_BY_ATTRIBUTE = 2;
  private static final int METHODID_FIND_BY_CITY = 3;
  private static final int METHODID_GET_PAGES_SIZE = 4;
  private static final int METHODID_GET_IMAGE_BY_ID = 5;
  private static final int METHODID_GET_ALL_IMAGES_BY_PROD = 6;
  private static final int METHODID_GET_MY_PRODUCT = 7;
  private static final int METHODID_SAVE_LIKE_PRODUCT = 8;
  private static final int METHODID_REMOVE_LIKE_PRODUCT = 9;
  private static final int METHODID_GET_LIKES_PRODUCT = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((products.ProductOuterClass.SaveProductRequest) request,
              (io.grpc.stub.StreamObserver<products.ProductOuterClass.SaveProductResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BY_ID:
          serviceImpl.getProductById((products.ProductOuterClass.GetProductByIdRequest) request,
              (io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL_BY_ATTRIBUTE:
          serviceImpl.findAllByAttribute((products.ProductOuterClass.FindAllByAttributeRequest) request,
              (io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_CITY:
          serviceImpl.findByCity((products.ProductOuterClass.FindAllByAttributeRequest) request,
              (io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse>) responseObserver);
          break;
        case METHODID_GET_PAGES_SIZE:
          serviceImpl.getPagesSize((products.ProductOuterClass.GetPagesSizeRequest) request,
              (io.grpc.stub.StreamObserver<products.ProductOuterClass.PagesSizeResponse>) responseObserver);
          break;
        case METHODID_GET_IMAGE_BY_ID:
          serviceImpl.getImageById((products.ProductOuterClass.GetImageByIdRequest) request,
              (io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse.Image>) responseObserver);
          break;
        case METHODID_GET_ALL_IMAGES_BY_PROD:
          serviceImpl.getAllImagesByProd((products.ProductOuterClass.GetImagesByProductIdRequest) request,
              (io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse.Image>) responseObserver);
          break;
        case METHODID_GET_MY_PRODUCT:
          serviceImpl.getMyProduct((products.ProductOuterClass.GetProductByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse>) responseObserver);
          break;
        case METHODID_SAVE_LIKE_PRODUCT:
          serviceImpl.saveLikeProduct((products.ProductOuterClass.SaveLikeProductRequest) request,
              (io.grpc.stub.StreamObserver<products.ProductOuterClass.SaveLikeProductResponse>) responseObserver);
          break;
        case METHODID_REMOVE_LIKE_PRODUCT:
          serviceImpl.removeLikeProduct((products.ProductOuterClass.RemoveLikeProductRequest) request,
              (io.grpc.stub.StreamObserver<products.ProductOuterClass.SaveLikeProductResponse>) responseObserver);
          break;
        case METHODID_GET_LIKES_PRODUCT:
          serviceImpl.getLikesProduct((products.ProductOuterClass.GetLikesProductRequest) request,
              (io.grpc.stub.StreamObserver<products.ProductOuterClass.GetProductResponse>) responseObserver);
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

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return products.ProductOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getCreateProductMethod())
              .addMethod(getGetProductByIdMethod())
              .addMethod(getFindAllByAttributeMethod())
              .addMethod(getFindByCityMethod())
              .addMethod(getGetPagesSizeMethod())
              .addMethod(getGetImageByIdMethod())
              .addMethod(getGetAllImagesByProdMethod())
              .addMethod(getGetMyProductMethod())
              .addMethod(getSaveLikeProductMethod())
              .addMethod(getRemoveLikeProductMethod())
              .addMethod(getGetLikesProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
