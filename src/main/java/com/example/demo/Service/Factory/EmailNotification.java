package com.example.demo.Service.Factory;

import org.springframework.stereotype.Service;

@Service
public class EmailNotification implements Notification {
    @Override
    public void Notify(String Message) {
        System.out.println("Sending Email Notification : "+Message);
    }
}
