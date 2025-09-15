package com.wms.order_service.services;

import com.wms.order_service.repositories.OutboundOrderLineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OutboundOrderLineService {
    private final OutboundOrderLineRepository outboundOrderLineRepository;
}
