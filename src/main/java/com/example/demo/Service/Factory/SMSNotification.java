package com.example.demo.Service.Factory;

import org.springframework.stereotype.Service;

@Service
public class SMSNotification implements Notification{

    @Override
    public void Notify(String Message) {
        System.out.println("Sending SMS Notification:"+ Message);
    }
}
