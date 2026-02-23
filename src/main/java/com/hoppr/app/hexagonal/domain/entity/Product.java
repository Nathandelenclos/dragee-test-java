package com.hoppr.app.hexagonal.domain.entity;

import io.fixentropy.annotation.hexagonal.Hexagonal;

import java.math.BigDecimal;
import java.util.UUID;

@Hexagonal.DomainEntity
public class Product {
    private final UUID id;
    private final String name;
    private final BigDecimal price;

    public Product(UUID id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public UUID id() {
        return id;
    }

    public String name() {
        return name;
    }

    public BigDecimal price() {
        return price;
    }
}
