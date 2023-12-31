package com.example.products.repository;

import com.example.products.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByTitle(String title);

    List<Product> findAllByCategory(String category);

    List<Product> findAllByCategoryAndTitle(String category, String title);

    List<Product> findByTitleContaining(String companyName, Pageable paging);

    List<Product> findByCityContainingAndTitleContaining(String city, String title, Pageable paging);

    List<Product> findByCityContainingAndTitleContainingAndCategoryContaining(String city,
                                                                              String title,
                                                                              String category,
                                                                              Pageable paging);

    List<Product> findAllByCityContaining(String city, Pageable paging);

    List<Product> findByCategoryContaining(String category, Pageable paging);

    List<Product> findByCategoryAndTitleContaining(String category, String title, Pageable pageable);

    List<Product> findAllByPreferUsersContains(Long userId);
    List<Product> findAllByUserId(Long userId);
}