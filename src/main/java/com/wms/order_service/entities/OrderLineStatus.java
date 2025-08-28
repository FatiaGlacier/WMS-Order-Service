package com.wms.order_service.entities;

public enum OrderLineStatus {
    PENDING,
    RECEIVED,
    COMPLETED,
    ALLOCATED,
    PICKED,
    SHIPPED,
    CANCELLED
}
