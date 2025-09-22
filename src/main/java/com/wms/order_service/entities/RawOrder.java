package com.wms.order_service.entities;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "raw_orders")
@Data
public class RawOrder {

    @Id
    private String id;
    private String sourceSystem;
    private LocalDateTime receivedAt;

    private RawOrderInfo orderInfo;
    private List<RawOrderLine> lines;
}
