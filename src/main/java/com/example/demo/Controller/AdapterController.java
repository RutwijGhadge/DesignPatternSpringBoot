package com.example.demo.Controller;

import com.example.demo.Service.Adapter.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class AdapterController {

    @Autowired
    NotificationService notificationService;
    @PostMapping("/sms")
    public ResponseEntity<String>sendSMS(@RequestParam String phone , @RequestParam String message){
        notificationService.NotifyUser(phone, message);
        return ResponseEntity.ok("Sent SMS Notification");
    }

    //localhost:8080/notify/sms?phone=1234567890&message=Hello!
}
