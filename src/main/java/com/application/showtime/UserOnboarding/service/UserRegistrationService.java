package com.application.showtime.UserOnboarding.service;

import com.application.showtime.UserOnboarding.entity.UserRegistrationEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserRegistrationService {
    void createNewUser(UserRegistrationEntity userRegistrationEntity);

    List<UserRegistrationEntity> getAllUsers();

    void deleteUser(long id);

    Optional<UserRegistrationEntity> getUserByMail(String mail);
}
