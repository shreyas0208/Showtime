package com.application.showtime.UserOnboarding.controller;

import com.application.showtime.UserOnboarding.serviceImplementation.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceImplementation userServiceImplementation;
}
