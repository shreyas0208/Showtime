package com.application.showtime.UserOnboarding.serviceImplementation;

import com.application.showtime.UserOnboarding.entity.UserRegistrationEntity;
import com.application.showtime.UserOnboarding.repository.UserRegistrationRepo;
import com.application.showtime.UserOnboarding.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import com.application.showtime.UserOnboarding.service.UserRegistrationService;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
    @Autowired
    UserRegistrationRepo userRegistrationRepo;

    @Override
    public void createNewUser(UserRegistrationEntity userRegistrationEntity) {
        userRegistrationRepo.save(userRegistrationEntity);
    }
}
