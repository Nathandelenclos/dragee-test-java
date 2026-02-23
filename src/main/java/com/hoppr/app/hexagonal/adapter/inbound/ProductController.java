package com.hoppr.app.hexagonal.adapter.inbound;

import io.fixentropy.annotation.hexagonal.Hexagonal;
import com.hoppr.app.hexagonal.domain.entity.Product;
import com.hoppr.app.hexagonal.domain.service.ProductService;

import java.math.BigDecimal;
import java.util.Objects;

@Hexagonal.InboundAdapter
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = Objects.requireNonNull(productService);
    }

    public Product handleCreateProduct(String name, BigDecimal price) {
        return productService.create(name, price);
    }
}
