package com.application.showtime.UserOnboarding.repository;

import com.application.showtime.UserOnboarding.entity.UserRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserRegistrationEntity,Long> {

    Optional<UserRegistrationEntity> findUserRegistrationEntityByEmailId(String mail);
}
