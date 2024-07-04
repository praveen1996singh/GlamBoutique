package com.pk.glamboutique.notificationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.glamboutique.notificationservice.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
