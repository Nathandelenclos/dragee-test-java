package com.hoppr.app.hexagonal.domain.service;

import io.fixentropy.annotation.hexagonal.Hexagonal;
import com.hoppr.app.hexagonal.adapter.outbound.InMemoryProductRepository;
import com.hoppr.app.hexagonal.domain.entity.Product;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Hexagonal.DomainService
public class ProductService {
    private final InMemoryProductRepository repository;

    public ProductService(InMemoryProductRepository repository) {
        this.repository = Objects.requireNonNull(repository);
    }

    public Product create(String name, BigDecimal price) {
        Product product = new Product(UUID.randomUUID(), name, price);
        repository.save(product);
        return product;
    }
}
