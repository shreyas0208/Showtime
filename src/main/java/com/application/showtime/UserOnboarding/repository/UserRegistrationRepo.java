package com.application.showtime.UserOnboarding.repository;

import com.application.showtime.UserOnboarding.entity.UserRegistrationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepo extends CrudRepository<UserRegistrationEntity,Long> {

}
