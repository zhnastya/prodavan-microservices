package com.example.products.service;

import com.example.products.model.Image;
import com.example.products.model.Product;
import com.google.protobuf.Timestamp;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import net.devh.boot.grpc.server.service.GrpcService;
import products.ProductOuterClass.*;
import products.ProductServiceGrpc;

import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@GrpcService
@RequiredArgsConstructor
public class ProductGrpcService extends ProductServiceGrpc.ProductServiceImplBase {
    private final ProductService service;
    private final ImageService serviceImg;

    private Image toImageEntity(SaveProductRequest.Image file){
        Image imageForProduct = new Image();
        imageForProduct.setPath(file.getPath());
        imageForProduct.setPreviewImage(file.getIsPreview());
        return imageForProduct;
    }

    private GetProductResponse.Image toIterableEntity(Image image) {
        return GetProductResponse.Image
                .newBuilder()
                .setId(image.getId())
                .setPath(image.getPath())
                .setIsPreview(image.isPreviewImage())
                .build();
    }

    private GetProductResponse makeResponse(Product product){
        List<GetProductResponse.Image> files = new ArrayList<>();
        product.getImages().forEach(image -> files.add(toIterableEntity(image)));
        return GetProductResponse
                .newBuilder()
                .setProduct(GetProductResponse.Product
                        .newBuilder()
                        .setId(product.getId())
                        .setTitle(product.getTitle())
                        .setDescription(product.getDescription())
                        .setPrice(product.getPrice())
                        .setCity(product.getCity())
                        .setCategory(product.getCategory())
                        .setPreviewImageId(product.getPreviewImageId())
                        .setUserId(product.getUserId())
                        .setDateOfCreated(Timestamp.newBuilder()
                                .setSeconds(product.getDateOfCreated().toEpochSecond(ZoneOffset.UTC))
                                .setNanos(product.getDateOfCreated().getNano())
                                .build())
                        .build())
                .addAllImages(files)
                .build();
    }

    @SneakyThrows
    @Override
    public void createProduct(SaveProductRequest request,
                           StreamObserver<SaveProductResponse> response) {
        Product product = Product.builder()
                .title(request.getProduct().getTitle())
                .description(request.getProduct().getDescription())
                .price(request.getProduct().getPrice())
                .city(request.getProduct().getCity())
                .category(request.getProduct().getCategory())
                .userId(request.getProduct().getUserId())
                .images(new ArrayList<>())
                .build();

        List<SaveProductRequest.Image> files = request.getImagesList();
        List<Image> images = new ArrayList<>();
        if (!files.isEmpty()) {
            for (SaveProductRequest.Image file : files) {
                images.add(toImageEntity(file));
            }
        }
        SaveProductResponse response1 = SaveProductResponse.newBuilder()
                .setId(service.saveProduct(product, images))
                .build();
        response.onNext(response1);
        response.onCompleted();
    }

    @Override
    public void getProductById(GetProductByIdRequest request,
                           StreamObserver<GetProductResponse> response){
        Product product = service.getProductById(request.getId());

        response.onNext(makeResponse(product));
        response.onCompleted();
    }

    @Override
    public void getAllImagesByProd(GetImagesByProductIdRequest request,
                                   StreamObserver<GetProductResponse.Image> responseObserver) {
        Iterator<Image> images = serviceImg.getImagesByProdId(request.getProductId()).iterator();
        while (images.hasNext()){
            GetProductResponse.Image response = toIterableEntity(images.next());
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getMyProduct(GetProductByUserIdRequest request,
                             StreamObserver<GetProductResponse> responseObserver) {
        Iterator<Product> products = service.getMyProduct(request.getUserId()).iterator();
        while (products.hasNext()){
            GetProductResponse response = makeResponse(products.next());
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void saveLikeProduct(SaveLikeProductRequest request,
                                StreamObserver<SaveLikeProductResponse> responseObserver) {
        boolean isSave = service.likeProduct(request.getUserId(), request.getProdId());
        SaveLikeProductResponse response = SaveLikeProductResponse.newBuilder()
                .setIsApp(isSave)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void removeLikeProduct(RemoveLikeProductRequest request,
                                  StreamObserver<SaveLikeProductResponse> responseObserver) {
        boolean isSave = service.dislikeProduct(request.getUserId(), request.getProdId());
        SaveLikeProductResponse response = SaveLikeProductResponse.newBuilder()
                .setIsApp(isSave)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getLikesProduct(GetLikesProductRequest request,
                                StreamObserver<GetProductResponse> responseObserver) {
        Iterator<Product> products = service.getLikesProduct(request.getUserId()).iterator();
        while (products.hasNext()){
            GetProductResponse response = makeResponse(products.next());
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void findAllByAttribute(FindAllByAttributeRequest request,
                             StreamObserver<GetProductResponse> response){
        List<Product> products = service.findAllByAttribute(request.getOffset(), request.getLimit(),
                request.getSortField(), request.getCategory(), request.getTitle());
        for (Product product : products) {
            response.onNext(makeResponse(product));
        }
        response.onCompleted();
    }

    @Override
    public void findByCity(FindAllByAttributeRequest request,
                            StreamObserver<GetProductResponse> response){
        List<Product> products = service.findByCity(request.getCity(), request.getOffset(), request.getLimit(),
                request.getSortField(), request.getCategory(), request.getTitle());
        for (Product product : products) {
            response.onNext(makeResponse(product));
        }
        response.onCompleted();
    }

    @Override
    public void getPagesSize(GetPagesSizeRequest request,
                           StreamObserver<PagesSizeResponse> response){
        Integer size = service.getPagesSize(request.getLimit(), request.getCategory(), request.getTitle());
        PagesSizeResponse response1 = PagesSizeResponse.newBuilder().setSize(size).build();
        response.onNext(response1);
        response.onCompleted();
    }

    @Override
    public void getImageById(GetImageByIdRequest request,
                             StreamObserver<GetProductResponse.Image> response){
        Image image = serviceImg.getImageById(request.getId());
        GetProductResponse.Image response1 = toIterableEntity(image);
        response.onNext(response1);
        response.onCompleted();
    }
}

