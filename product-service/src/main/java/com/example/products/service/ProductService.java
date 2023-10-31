package com.example.products.service;
import com.example.products.model.Image;
import com.example.products.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.security.Principal;
import java.util.List;

public interface ProductService {

    Long saveProduct(Product product, List<Image> images);

    void addMany(Principal principal, List<MultipartFile> files);

    void deleteProduct(Long id);

    Product getProductById(Long id);

    List<Product> findAllByAttribute(Integer offset, Integer limit,
                                     Integer sortField, String category, String title);

    List<Product> findByCity(String city, Integer offset, Integer limit,
                             Integer sortField, String category, String title);

    int getPagesSize(Integer limit, String category, String title);

//    void likeProduct(Principal principal, Long prodId);
//
//    void dislikeProduct(Principal principal, Long prodId);
//
//    Set<Product> getLikesProduct(Principal principal);
}