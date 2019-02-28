package com.ashwani.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwani.shopping.model.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long id);
}
