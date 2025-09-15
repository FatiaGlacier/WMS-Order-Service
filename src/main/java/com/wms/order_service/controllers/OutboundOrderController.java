package com.wms.order_service.controllers;

import com.wms.order_service.services.OutboundOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order/outbound")
@RequiredArgsConstructor
public class OutboundOrderController {
    private final OutboundOrderService orderService;
}
