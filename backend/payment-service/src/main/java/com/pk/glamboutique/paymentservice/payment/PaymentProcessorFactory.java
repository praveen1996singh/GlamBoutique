package com.pk.glamboutique.paymentservice.payment;

public class PaymentProcessorFactory {
    public static PaymentProcessor getPaymentProcessor(String paymentMethod) {
        switch (paymentMethod) {
            case "CREDIT_CARD":
                return new CreditCardPaymentProcessor();
            case "PAYPAL":
                return new PayPalPaymentProcessor();
            default:
                throw new IllegalArgumentException("Invalid payment method: " + paymentMethod);
        }
    }
}
