package com.example.sellars.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String category;
    private Long previewImageId;
    private List<MultipartFile> images = new ArrayList<>();
    private LocalDateTime dateOfCreated;
    private User user;

    public void addImage(MultipartFile image){
        images.add(image);
    }
}