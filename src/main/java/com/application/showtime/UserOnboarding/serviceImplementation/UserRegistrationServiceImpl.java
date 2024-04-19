package com.application.showtime.UserOnboarding.serviceImplementation;

import com.application.showtime.UserOnboarding.entity.UserRegistrationEntity;
import com.application.showtime.UserOnboarding.repository.UserRegistrationRepo;
import com.application.showtime.UserOnboarding.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import com.application.showtime.UserOnboarding.service.UserRegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
    @Autowired
    UserRegistrationRepo userRegistrationRepo;

    @Override
    public void createNewUser(UserRegistrationEntity userRegistrationEntity) {
        userRegistrationRepo.save(userRegistrationEntity);
    }

    @Override
    public List<UserRegistrationEntity> getAllUsers() {
        return userRegistrationRepo.findAll();
    }

    @Override
    public void deleteUser(long id) {
        userRegistrationRepo.deleteById(id);
    }

    @Override
    public Optional<UserRegistrationEntity> getUserByMail(String mail) {
        return userRegistrationRepo.findUserRegistrationEntityByEmailId(mail);
    }
}
