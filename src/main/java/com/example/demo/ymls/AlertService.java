package com.example.demo.ymls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertService {
    private final NotificationService notificationService;

    @Autowired
    public AlertService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void alert(String message) {
        notificationService.sendNotification(message);
    }
}
