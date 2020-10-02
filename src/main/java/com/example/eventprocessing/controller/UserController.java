package com.example.eventprocessing.controller;

import com.example.eventprocessing.Model.User;
import com.example.eventprocessing.event.AuditEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private AuditEventPublisher  auditEventPublisher;

    @PostMapping
    public String registerUser(@RequestBody User user) {
        // db call done
        auditEventPublisher.publishEvents("User Registered here");
        return "User Registered";
    }
}
