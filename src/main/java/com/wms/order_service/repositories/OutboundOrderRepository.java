package com.wms.order_service.repositories;

import com.wms.order_service.entities.InboundOrder;
import com.wms.order_service.entities.OutboundOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OutboundOrderRepository extends JpaRepository<OutboundOrder, UUID> {
}
