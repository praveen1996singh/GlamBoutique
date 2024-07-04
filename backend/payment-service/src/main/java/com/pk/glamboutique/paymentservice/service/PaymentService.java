package com.pk.glamboutique.paymentservice.service;

import java.util.List;

import com.pk.glamboutique.paymentservice.model.Payment;

public interface PaymentService {
    List<Payment> getAllPayments();
    Payment getPaymentById(Long id);
    Payment createPayment(Payment payment);
    Payment updatePayment(Long id, Payment payment);
    void deletePayment(Long id);
}
