package com.application.showtime.UserOnboarding.repository;

import com.application.showtime.UserOnboarding.entity.UserRegistrationEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRegistrationRepo extends CrudRepository<UserRegistrationEntity,Integer> {
}
