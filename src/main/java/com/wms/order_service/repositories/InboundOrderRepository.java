package com.wms.order_service.repositories;

import com.wms.order_service.entities.InboundOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InboundOrderRepository extends JpaRepository<InboundOrder, UUID> {
}
