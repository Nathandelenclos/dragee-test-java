package com.hoppr.app.hexagonal.adapter.outbound;

import io.fixentropy.annotation.hexagonal.Hexagonal;
import com.hoppr.app.hexagonal.domain.entity.Product;

import java.util.*;

@Hexagonal.OutboundAdapter
public class InMemoryProductRepository {
    private final Map<UUID, Product> store = new HashMap<>();

    public void save(Product product) {
        store.put(product.id(), product);
    }

    public Optional<Product> findById(UUID id) {
        return Optional.ofNullable(store.get(id));
    }
}
