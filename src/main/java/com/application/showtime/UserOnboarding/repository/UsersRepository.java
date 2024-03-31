package com.application.showtime.UserOnboarding.repository;

import com.application.showtime.UserOnboarding.entity.UsersTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersTable,Long> {
}
