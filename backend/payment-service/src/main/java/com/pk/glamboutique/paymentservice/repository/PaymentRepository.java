package com.pk.glamboutique.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.glamboutique.paymentservice.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
