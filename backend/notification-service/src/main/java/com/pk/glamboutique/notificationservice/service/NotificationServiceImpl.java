package com.pk.glamboutique.notificationservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.glamboutique.notificationservice.model.Notification;
import com.pk.glamboutique.notificationservice.observer.EmailNotificationObserver;
import com.pk.glamboutique.notificationservice.observer.NotificationSubject;
import com.pk.glamboutique.notificationservice.observer.SmsNotificationObserver;
import com.pk.glamboutique.notificationservice.repository.NotificationRepository;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    private NotificationSubject notificationSubject;

    public NotificationServiceImpl() {
        notificationSubject = new NotificationSubject();
        notificationSubject.addObserver(new EmailNotificationObserver());
        notificationSubject.addObserver(new SmsNotificationObserver());
    }

    @Override
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    @Override
    public Notification getNotificationById(Long id) {
        return notificationRepository.findById(id).orElse(null);
    }

    @Override
    public Notification createNotification(Notification notification) {
        Notification savedNotification = notificationRepository.save(notification);
        sendNotification(notification.getMessage());
        return savedNotification;
    }

    @Override
    public Notification updateNotification(Long id, Notification notification) {
        if (notificationRepository.existsById(id)) {
            notification.setId(id);
            return notificationRepository.save(notification);
        } else {
            return null;
        }
    }

    @Override
    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }

    @Override
    public void sendNotification(String message) {
        notificationSubject.notifyObservers(message);
    }
}
