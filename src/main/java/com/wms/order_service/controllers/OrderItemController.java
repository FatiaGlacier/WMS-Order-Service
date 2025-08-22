package com.wms.order_service.controllers;

import com.wms.order_service.services.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order-item")
@RequiredArgsConstructor
public class OrderItemController {
    private final OrderItemService orderItemService;
}
