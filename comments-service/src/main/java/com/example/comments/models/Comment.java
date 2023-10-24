package com.example.comments.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "comms")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @NonNull
    @Column(name = "userId")
    private Long userId;
    @NonNull
    @Column(name = "authorId")
    private Long authorId;
    @Column(name = "rating")
    private Double rating;
    @Column(name = "description", columnDefinition = "text")
    @NotBlank(message = "Напишите что-нибудь")
    private String description;
    @Column(name = "timeOfCreated")
    private LocalDateTime timeOfCreated;

    @PrePersist
    public void init() {
        timeOfCreated = LocalDateTime.now();
    }
}
