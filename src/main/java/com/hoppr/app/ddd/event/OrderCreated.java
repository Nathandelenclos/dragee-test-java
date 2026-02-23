package com.hoppr.app.ddd.event;

import io.fixentropy.annotation.ddd.DDD;
import com.hoppr.app.ddd.value.Money;
import java.util.UUID;

@DDD.Event
public record OrderCreated(UUID orderId, Money total) {
}
