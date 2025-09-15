package com.wms.order_service.repositories;

import com.wms.order_service.entities.OutboundOrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OutboundOrderLineRepository extends JpaRepository<OutboundOrderLine, UUID> {
}
