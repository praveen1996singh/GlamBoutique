package com.pk.glamboutique.paymentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.glamboutique.paymentservice.model.Payment;
import com.pk.glamboutique.paymentservice.payment.PaymentProcessor;
import com.pk.glamboutique.paymentservice.payment.PaymentProcessorFactory;
import com.pk.glamboutique.paymentservice.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

    @Override
    public Payment createPayment(Payment payment) {
        PaymentProcessor paymentProcessor = PaymentProcessorFactory.getPaymentProcessor(payment.getPaymentMethod());
        String status = paymentProcessor.processPayment(payment.getAmount());
        payment.setStatus(status);
        return paymentRepository.save(payment);
    }

    @Override
    public Payment updatePayment(Long id, Payment payment) {
        if (paymentRepository.existsById(id)) {
            payment.setId(id);
            return paymentRepository.save(payment);
        } else {
            return null;
        }
    }

    @Override
    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
