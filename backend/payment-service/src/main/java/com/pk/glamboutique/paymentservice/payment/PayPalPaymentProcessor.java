package com.pk.glamboutique.paymentservice.payment;

public class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public String processPayment(Double amount) {
        // Simulate PayPal payment processing logic
        return "Processed " + amount + " using PayPal.";
    }
}