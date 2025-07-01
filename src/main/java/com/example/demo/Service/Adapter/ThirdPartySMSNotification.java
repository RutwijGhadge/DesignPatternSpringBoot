package com.example.demo.Service.Adapter;

import org.springframework.stereotype.Service;
//Legacy Class
@Service
public class ThirdPartySMSNotification {
    void sendSMS(String phone , String Message){
        System.out.println("Sending SMS to "+ phone +" Message:" + Message);
    }
}
