package com.wms.order_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class OutboundOrder extends OrderCore {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID uuid;
    String destination;
    UUID carrierUUID;
    LocalDateTime plannedShipmentDate;
    LocalDateTime shippedDate;
}
