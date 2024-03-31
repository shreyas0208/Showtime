package com.application.showtime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "SHOWTIME_USERS")
public class UsersTable {

    @Id
    @Column(name = "userId")
    private int userId;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "mobileNumber")
    private long mobileNumber;

    @Column(name = "emailAddress")
    private String emailAddress;

    @Column(name = "passwordString")
    private String passwordString;

}
