package com.example.demo.Controller;

import com.example.demo.Service.Factory.Notification;
import com.example.demo.Service.Factory.NotificationFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Notify")
public class FactoryController {
    private final NotificationFactory notificationFactory;

    public FactoryController(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    @PostMapping("/{type}")
    public ResponseEntity<String> getNotification(@PathVariable String type, @RequestBody String Message){
        try {
            Notification notification = notificationFactory.getNotification(type);
            notification.Notify(Message);
            return ResponseEntity.ok("Notification Sent Successfully Via " + type);
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Exception: "+ e.getMessage());
        }
    }
}
