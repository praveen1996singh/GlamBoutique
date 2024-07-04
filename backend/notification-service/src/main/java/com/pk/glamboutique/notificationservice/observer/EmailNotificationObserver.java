package com.pk.glamboutique.notificationservice.observer;

public class EmailNotificationObserver implements Observer {
    @Override
    public void update(String message) {
        // Simulate sending email
        System.out.println("Email sent with message: " + message);
    }
}