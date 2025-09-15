package com.wms.order_service.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class OrderCore {
    String number;
    String invoice_number;
    OrderStatus status;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
