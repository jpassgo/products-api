package com.pascoe.products_api.services;

import com.pascoe.products_api.Exceptions.ProductNotFoundException;
import com.pascoe.products_api.models.Product;
import com.pascoe.products_api.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll().stream()
                .map(Product::fromEntity)
                .toList();
    }

    public Product getProduct(String name) {
        return Product.fromEntity(productRepository.findByName(name)
                .orElseThrow(() -> new ProductNotFoundException("Product not found")));
    }

    public Product createProduct(Product product) {
        return Product.fromEntity(productRepository.save(Product.toEntity(product)));
    }

}
