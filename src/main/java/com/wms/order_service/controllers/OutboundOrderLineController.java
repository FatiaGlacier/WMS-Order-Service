package com.wms.order_service.controllers;

import com.wms.order_service.services.OutboundOrderLineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/outbound-order-line")
@RequiredArgsConstructor
public class OutboundOrderLineController {
    private final OutboundOrderLineService outboundOrderLineService;
}
