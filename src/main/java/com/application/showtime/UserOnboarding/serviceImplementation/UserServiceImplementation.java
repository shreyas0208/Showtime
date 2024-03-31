package com.application.showtime.UserOnboarding.serviceImplementation;

import com.application.showtime.UserOnboarding.repository.UsersRepository;
import com.application.showtime.UserOnboarding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UsersRepository usersRepository;
}
