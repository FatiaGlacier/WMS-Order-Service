package com.wms.order_service.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEntity {

    private UUID uuid;

    private String number;

    private String type;

    private String status;

    private Date createdAt;

    private Date completedAt;
}
