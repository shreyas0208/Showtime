package com.application.showtime.UserOnboarding.controller;

import com.application.showtime.UserOnboarding.entity.UserRegistrationEntity;
import com.application.showtime.UserOnboarding.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserRegistrationController {

    @Autowired
    UserRegistrationService userRegistrationService;

    @PostMapping("/addUser")
    public String createNewUser(@RequestBody UserRegistrationEntity userRegistrationEntity)
    {
        userRegistrationService.createNewUser(userRegistrationEntity);
        return "User created";
    }
}
