package com.example.sellars.service.product;

import com.example.sellars.dto.Product;
import com.example.sellars.dto.User;
import com.example.sellars.service.user.UserService;
import com.example.sellars.service.yandex.YandexPhoto;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import products.ProductOuterClass.*;
import products.ProductServiceGrpc.ProductServiceBlockingStub;

import java.io.IOException;
import java.security.Principal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;


@Service
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final UserService service;
    private final YandexPhoto photoService;

    @GrpcClient("product-service")
    ProductServiceBlockingStub stub;


    @SneakyThrows
    private Product addManyProd(Principal principal, List<MultipartFile> files) {
//        Product product1 = new Product();
//        List<String> category = List.of("Одежда", "Техника", "Товары для дома", "Товары для детей",
//                "Товары для животных", "Авто", "Красота и здоровье", "Недвижимость", "Хобби и отдых");
//        List<String> cities = List.of("Москва", "Санкт - Петербург", "Самара", "Воронеж", "Казань");
//        List<Image> images = new ArrayList<>();
//
//        for (MultipartFile file : files) {
//            Image image = toImageEntity(file);
//            images.add(image);
//            product1.addImageToProduct(image);
//        }
//        images.get(0).setPreviewImage(true);
//        Random random = new Random();
//        String randomName = category.get(random.nextInt(category.size()));
//
//        product1.setTitle(randomName + " " + cities.get(random.nextInt(cities.size())));
//        product1.setDescription("Товар предназначенный для - " + randomName);
//        product1.setPrice(random.nextInt(30000));
//        product1.setCity(cities.get(random.nextInt(cities.size())));
//        product1.setCategory(randomName);
////        product1.setUser(getUserByPrincipal(principal));
        return null;
    }

    @SneakyThrows
    private List<SaveProductRequest.Image> toIterableEntity(List<MultipartFile> files) {
        List<SaveProductRequest.Image> iterable = new ArrayList<>();
        for (MultipartFile file : files) {
            iterable.add(SaveProductRequest.Image
                    .newBuilder()
                    .setPath(photoService.savePhotos(file))
                    .setIsPreview(false)
                    .build());
        }
        iterable.get(0).newBuilderForType().setIsPreview(true).build();
        return iterable;
    }


    private User getUserByPrincipal(Principal principal) {
        if (principal == null) return new User();
        return service.getUserByEmail(principal.getName());
    }

    private Product getFromResponse(GetProductResponse response) throws IOException, InterruptedException {
        GetProductResponse.Product responseProduct = response.getProduct();
        LocalDateTime time = Instant
                .ofEpochSecond( responseProduct.getDateOfCreated().getSeconds(),
                        responseProduct.getDateOfCreated().getNanos())
                .atZone( ZoneId.of( "Europe/Moscow" ))
                .toLocalDateTime();
        Product product = new Product();
        product.setId(responseProduct.getId());
        product.setCity(responseProduct.getCity());
        product.setCategory(responseProduct.getCategory());
        product.setPrice(responseProduct.getPrice());
        product.setTitle(responseProduct.getTitle());
        product.setDescription(responseProduct.getDescription());
        product.setDateOfCreated(time);
        product.setPreviewImageId(responseProduct.getPreviewImageId());
        product.setUser(service.getUserById(responseProduct.getUserId()));
        for (GetProductResponse.Image image : response.getImagesList()) {
            MultipartFile image1 = toImageEntity(image);
            product.addImage(image1);
        }
        return product;
    }

    private MultipartFile toImageEntity(GetProductResponse.Image imageResponse) throws IOException, InterruptedException {
        return photoService.loadPhotos(imageResponse.getPath());
    }


    @SneakyThrows
    @Override
    public void saveProduct(Principal principal, Product product, List<MultipartFile> files) {
        User user = getUserByPrincipal(principal);
        Iterable<SaveProductRequest.Image> images = toIterableEntity(files);
        SaveProductRequest request = SaveProductRequest.newBuilder()
                .setProduct(SaveProductRequest.Product.newBuilder()
                        .setCity(product.getCity())
                        .setCategory(product.getCategory())
                        .setPrice(product.getPrice())
                        .setTitle(product.getTitle())
                        .setUserId(user.getId())
                        .setDescription(product.getDescription())
                        .build())
                .addAllImages(images)
                .build();
        SaveProductResponse response = stub.createProduct(request);
        System.out.println(response);
    }

    @Override
    public MultipartFile getImageById(Long id) throws IOException, InterruptedException {
        GetImageByIdRequest request = GetImageByIdRequest.newBuilder().setId(id).build();
        GetProductResponse.Image imageResponse = stub.getImageById(request);
        return toImageEntity(imageResponse);
    }

    @Override
    public void addMany(Principal principal, List<MultipartFile> files) {
//        for (int i = 0; i < 100; i++) {
//            Product product = addManyProd(principal, files);
//            Product productFromDb = productRepository.save(product);
//            productFromDb.setPreviewImageId(productFromDb.getImages().get(0).getId());
//            productRepository.save(product);
//        }
    }


    @Override
    public void deleteProduct(Long id) {
    }


    @Override
    public Product getProductById(Long id) throws IOException, InterruptedException {
        GetProductByIdRequest request = GetProductByIdRequest.newBuilder()
                .setId(id)
                .build();
        GetProductResponse response = stub.getProductById(request);
        return getFromResponse(response);
    }


    @Override
    public List<Product> findAllByAttribute(Integer offset, Integer limit,
                                            Integer sortField, String category, String title) throws IOException, InterruptedException {
        FindAllByAttributeRequest request = FindAllByAttributeRequest.newBuilder()
                .setCity("")
                .setLimit(limit)
                .setOffset(offset)
                .setCategory(category)
                .setSortField(sortField)
                .build();
        Iterator<GetProductResponse> response = stub.findAllByAttribute(request);
        List<Product> products = new ArrayList<>();
        while (response.hasNext()){
            Product product = getFromResponse(response.next());
            products.add(product);
        }
        log.info("get product - " + response);
        return products;
    }


    @Override
    public List<Product> findByCity(String city, Integer offset, Integer limit,
                                    Integer sortField, String category, String title) throws IOException, InterruptedException {
            FindAllByAttributeRequest request = FindAllByAttributeRequest.newBuilder()
                    .setCity(city)
                    .setLimit(limit)
                    .setOffset(offset)
                    .setCategory(category)
                    .setSortField(sortField)
                    .build();
            Iterator<GetProductResponse> response = stub.findByCity(request);
            List<Product> products = new ArrayList<>();
            while (response.hasNext()){
                Product product = getFromResponse(response.next());
                products.add(product);
            }
            log.info("get product - " + response);
            return products;
    }


    @Override
    public List<Integer> getPagesList(int size) {
        List<Integer> pages = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            pages.add(i);
        }
        return pages;
    }


    @Override
    public int getPagesSize(Integer limit, String category, String title) {
        GetPagesSizeRequest request = GetPagesSizeRequest.newBuilder()
                .setLimit(limit)
                .setCategory(category)
                .setTitle(title)
                .build();
        return stub.getPagesSize(request).getSize();
    }


    @Override
    public void likeProduct(Principal principal, Long prodId) {
        SaveLikeProductRequest request = SaveLikeProductRequest.newBuilder()
                .setUserId(getUserByPrincipal(principal).getId())
                .setProdId(prodId)
                .build();
        SaveLikeProductResponse response = stub.saveLikeProduct(request);
        log.info("saving like response - " + response);
    }


    @Override
    public void dislikeProduct(Principal principal, Long prodId) {
        RemoveLikeProductRequest request = RemoveLikeProductRequest.newBuilder()
                .setUserId(getUserByPrincipal(principal).getId())
                .setProdId(prodId)
                .build();
        SaveLikeProductResponse response = stub.removeLikeProduct(request);
        log.info("remove like response - " + response);
    }


    @Override
    public Set<Product> getLikesProduct(Principal principal) throws IOException, InterruptedException {
        if (principal==null) return Set.of();
        User user = getUserByPrincipal(principal);
        Set<Product> products = new HashSet<>();
        GetLikesProductRequest request = GetLikesProductRequest.newBuilder()
                .setUserId(user.getId()).build();
        Iterator<GetProductResponse> response = stub.getLikesProduct(request);
        while (response.hasNext()){
            products.add(getFromResponse(response.next()));
        }
        return products;
    }
}