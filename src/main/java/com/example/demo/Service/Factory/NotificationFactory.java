package com.example.demo.Service.Factory;

import org.springframework.stereotype.Service;

@Service
public class NotificationFactory {
    private final SMSNotification smsNotification;
    private final EmailNotification emailNotification;
    private final PushNotification pushNotification;


    public NotificationFactory(SMSNotification smsNotification, EmailNotification emailNotification, PushNotification pushNotification) {
        this.smsNotification = smsNotification;
        this.emailNotification = emailNotification;
        this.pushNotification = pushNotification;
    }

    //Factory of Objects : supply of Objects
    public Notification getNotification(String type){
        if(type.equalsIgnoreCase("SMS"))
            return smsNotification;
        else if (type.equalsIgnoreCase("PUSH")) {
            return pushNotification;
        }else if(type.equalsIgnoreCase("Email")){
            return emailNotification;
        }
        return null;
    }
}
