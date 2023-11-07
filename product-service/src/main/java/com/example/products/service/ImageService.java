package com.example.products.service;

import com.example.products.model.Image;

import java.util.List;

public interface ImageService {
    List<Image> getImagesByProdId(Long product);
    Image getImageById(Long imageId);

}
