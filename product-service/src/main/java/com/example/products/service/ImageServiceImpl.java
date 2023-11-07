package com.example.products.service;

import com.example.products.model.Image;
import com.example.products.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService{
    private final ImageRepository repository;
    @Override
    public List<Image> getImagesByProdId(Long prod) {
        List<Image> images = repository.getImagesByProduct_Id(prod);
        return images;
    }

    @Override
    public Image getImageById(Long imageId) {
        return repository.getReferenceById(imageId);
    }
}
