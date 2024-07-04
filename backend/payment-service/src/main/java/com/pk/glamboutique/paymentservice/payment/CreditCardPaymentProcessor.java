package com.pk.glamboutique.paymentservice.payment;

public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public String processPayment(Double amount) {
        // Simulate credit card payment processing logic
        return "Processed " + amount + " using Credit Card.";
    }
}