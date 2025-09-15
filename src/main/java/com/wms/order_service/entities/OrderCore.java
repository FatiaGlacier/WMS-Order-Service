package com.wms.order_service.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public abstract class OrderCore {
    String number;
    String invoice_number;
    OrderStatus status;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
