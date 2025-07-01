package com.example.demo.Service.Adapter;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void NotifyUser(String phone , String message){
        notificationSender.sendNotification(phone,message);
    }
}
