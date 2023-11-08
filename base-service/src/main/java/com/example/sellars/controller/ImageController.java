package com.example.sellars.controller;

import com.example.sellars.dto.CustomMultipartFile;
import com.example.sellars.exeption.NotFoundException;
import com.example.sellars.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
@Slf4j
@RequestMapping("/images")
@RequiredArgsConstructor
public class ImageController {
    private final ProductService service;

    @GetMapping("/{id}")
    private ResponseEntity<?> getImageById(@PathVariable long id) throws IOException, InterruptedException {
        CustomMultipartFile imageForProduct = service.getImageById(id);
        if (imageForProduct != null) {
            ResponseEntity<?> entity =  ResponseEntity.ok()
                    .header("fileName", imageForProduct.getOriginalFilename())
                    .contentType(MediaType.IMAGE_PNG)
                    .contentLength(imageForProduct.getSize())
                    .body(new InputStreamResource(new ByteArrayInputStream(imageForProduct.getBytes())));
            return entity;
        }
        throw new NotFoundException("Фотография с id - " + id + "не найдена");
    }

//    @GetMapping("/avatar/{id}")
//    private ResponseEntity<?> getAvatarById(@PathVariable Long id) {
////        Image avatar = imageRepository.findById(id).orElse(null);
////        if (avatar != null) {
////            log.info("Отправлена аватарка с id - " + id);
////            return ResponseEntity.ok()
////                    .header("fileName", avatar.getOriginalFileName())
////                    .contentType(MediaType.valueOf(avatar.getContentType()))
////                    .contentLength(avatar.getSize())
////                    .body(new InputStreamResource(new ByteArrayInputStream(avatar.getBytes())));
////        }
////        throw new NotFoundException("Аватарка с id - " + id + "не найдена");
////    }
//    }
}