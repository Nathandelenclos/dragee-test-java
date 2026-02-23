package com.hoppr.app.hexagonal.port.outbound;

import io.fixentropy.annotation.hexagonal.Hexagonal;
import com.hoppr.app.hexagonal.domain.entity.Product;

import java.util.Optional;
import java.util.UUID;

@Hexagonal.OutboundPort
public interface ProductRepository {
    void save(Product product);

    Optional<Product> findById(UUID id);
}
