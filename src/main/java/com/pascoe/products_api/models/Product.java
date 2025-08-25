package com.pascoe.products_api.models;

import com.pascoe.products_api.entities.ProductEntity;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Product {

    private Long id;
    private String name;

    public static Product fromEntity(ProductEntity entity) {
        return Product.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }

    public static ProductEntity toEntity(Product product) {
        return ProductEntity.builder()
                .name(product.getName())
                .build();
    }
}
