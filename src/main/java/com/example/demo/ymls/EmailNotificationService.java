package com.example.demo.ymls;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "notification.type", havingValue = "email")
public class EmailNotificationService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending email: {}"+ message);
    }
}
