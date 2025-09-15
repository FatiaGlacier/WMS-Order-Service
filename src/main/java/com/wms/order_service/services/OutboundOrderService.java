package com.wms.order_service.services;

import com.wms.order_service.repositories.OutboundOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OutboundOrderService {
    private final OutboundOrderRepository outboundOrderRepository;
}
