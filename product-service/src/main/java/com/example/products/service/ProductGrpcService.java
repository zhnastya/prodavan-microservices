package com.example.products.service;

import com.example.products.model.Image;
import com.example.products.model.Product;
import com.google.protobuf.ByteString;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import net.devh.boot.grpc.server.service.GrpcService;
import products.ProductOuterClass.*;
import products.ProductServiceGrpc;

import java.util.ArrayList;
import java.util.List;

@GrpcService
@RequiredArgsConstructor
public class ProductGrpcService extends ProductServiceGrpc.ProductServiceImplBase {
    private final ProductService service;

    private Image toImageEntity(SaveProductRequest.Image file){
        Image imageForProduct = new Image();
        imageForProduct.setName(file.getName());
        imageForProduct.setOriginalFileName(file.getOriginalFileName());
        imageForProduct.setContentType(file.getContentType());
        imageForProduct.setSize(file.getSize());
        imageForProduct.setBytes(file.getBytes().toByteArray());
        return imageForProduct;
    }

    private GetProductResponse.Image toIterableEntity(Image image) {
        return GetProductResponse.Image
                .newBuilder()
                .setName(image.getName())
                .setOriginalFileName(image.getOriginalFileName())
                .setContentType(image.getContentType())
                .setSize(image.getSize())
                .setBytes(ByteString.copyFrom(image.getBytes()))
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
                .build();

        List<SaveProductRequest.Image> files = request.getImagesList();
        List<Image> images = new ArrayList<>();
        for (SaveProductRequest.Image file : files) {
            images.add(toImageEntity(file));
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
                        .build())
                .addAllImages(files)
                .build();
    }
}

