package com.pk.glamboutique.notificationservice.service;


import java.util.List;

import com.pk.glamboutique.notificationservice.model.Notification;

public interface NotificationService {
    List<Notification> getAllNotifications();
    Notification getNotificationById(Long id);
    Notification createNotification(Notification notification);
    Notification updateNotification(Long id, Notification notification);
    void deleteNotification(Long id);
    void sendNotification(String message);
}
