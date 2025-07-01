package com.example.demo.Service.Adapter;

import org.springframework.stereotype.Service;
//Target Class : we are accepting class/Interface in this format
@Service
public class Adapter implements NotificationSender{

    private final ThirdPartySMSNotification thirdPartySMSNotification;

    public Adapter(ThirdPartySMSNotification thirdPartySMSNotification) {
        this.thirdPartySMSNotification = thirdPartySMSNotification;
    }

    @Override
    public void sendNotification(String to, String message) {
        thirdPartySMSNotification.sendSMS(to,message);
    }

}
