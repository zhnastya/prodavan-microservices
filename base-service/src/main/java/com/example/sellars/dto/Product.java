package com.example.sellars.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private List<CustomMultipartFile> images = new ArrayList<>();
    private LocalDateTime dateOfCreated;
    private User user;

    public void addImage(CustomMultipartFile image){
        images.add(image);
    }
}