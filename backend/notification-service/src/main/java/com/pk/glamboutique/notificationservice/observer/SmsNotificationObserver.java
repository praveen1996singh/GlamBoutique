package com.pk.glamboutique.notificationservice.observer;

public class SmsNotificationObserver implements Observer {
    @Override
    public void update(String message) {
        // Simulate sending SMS
        System.out.println("SMS sent with message: " + message);
    }
}