package com.pk.glamboutique.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.glamboutique.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
