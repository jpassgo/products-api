package com.pascoe.products_api.repositories;

import com.pascoe.products_api.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    @Query("SELECT product FROM products WHERE LOWER(product.name) = LOWER(:name)")
    Optional<ProductEntity> findByName(String name);
}
