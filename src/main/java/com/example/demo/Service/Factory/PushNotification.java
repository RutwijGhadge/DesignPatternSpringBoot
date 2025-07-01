package com.example.demo.Service.Factory;

import org.springframework.stereotype.Service;

@Service
public class PushNotification implements Notification{
    @Override
    public void Notify(String Message) {
        System.out.println("Sending Push Notification: "+Message);
    }
}
