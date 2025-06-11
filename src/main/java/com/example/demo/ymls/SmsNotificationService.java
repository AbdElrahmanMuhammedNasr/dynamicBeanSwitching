package com.example.demo.ymls;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class SmsNotificationService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending sms: {}" + message);
    }
}
