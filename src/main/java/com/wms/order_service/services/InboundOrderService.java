package com.wms.order_service.services;

import com.wms.order_service.repositories.InboundOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InboundOrderService {
    private final InboundOrderRepository inboundOrderRepository;
}
