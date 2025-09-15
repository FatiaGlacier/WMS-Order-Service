package com.wms.order_service.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class InboundOrder extends OrderCore {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID uuid;
    UUID supplierId;
    LocalDateTime expectedDeliveryDate;
    LocalDateTime receivedAt;
}
