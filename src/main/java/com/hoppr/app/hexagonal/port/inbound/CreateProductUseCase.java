package com.hoppr.app.hexagonal.port.inbound;

import io.fixentropy.annotation.hexagonal.Hexagonal;
import com.hoppr.app.hexagonal.domain.entity.Product;

import java.math.BigDecimal;

@Hexagonal.InboundPort
public interface CreateProductUseCase {
    Product create(String name, BigDecimal price);
}
