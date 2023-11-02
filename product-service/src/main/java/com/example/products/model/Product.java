package com.example.products.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "products")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    @NotBlank(message = "Заполните название")
    private String title;

    @Column(name = "description", columnDefinition = "text")
    @NotBlank(message = "Заполните описание")
    private String description;

    @Column(name = "price")
    private int price;

    @Column(name = "city")
    private String city;

    @Column(name = "date_of_created")
    private LocalDateTime dateOfCreated;

    @Column(name = "category")
    private String category;

    @Column(name = "preview_image_id")
    private Long previewImageId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,
            mappedBy = "product")
    private List<Image> images = new ArrayList<>();
    private Long userId;
    @ElementCollection(targetClass = Long.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "like_prod",
            joinColumns = @JoinColumn(name = "product_id"))
    private Set<Long> preferUsers;

    @PrePersist
    private void init() {
        dateOfCreated = LocalDateTime.now();
    }


    public void addImageToProduct(Image image) {
        image.setProduct(this);
        images.add(image);
    }

    public boolean addLikeToProduct(Long userId) {
        return preferUsers.add(userId);
    }

    public boolean removeLikeToProduct(Long userId) {
        return preferUsers.remove(userId);
    }
}