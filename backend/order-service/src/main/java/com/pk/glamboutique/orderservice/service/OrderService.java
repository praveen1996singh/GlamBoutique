package com.pk.glamboutique.orderservice.service;

import com.pk.glamboutique.orderservice.model.Order;

public interface OrderService {

	Order createOrder(Order order);
    Order getOrderById(Long id);
}
