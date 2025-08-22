package com.wms.order_service.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemEntity {
    private UUID uuid;
    private UUID batchItemUuid;
    private Integer quantity;
    private String status;
}
