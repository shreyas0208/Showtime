package com.application.showtime.UserOnboarding.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "SHOWTIME_USERS")
public class UsersTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private int userId;

    @Pattern(regexp = "^[a-zA-Z]+$", message = "First name must contain only alphabets")
    @Size(min = 2, message = "First name must be at least 3 characters long")
    @Column(name = "firstName")
    private String firstName;

    @Pattern(regexp = "^[a-zA-Z]+$", message = "Last name must contain only alphabets")
    @Size(min = 2, message = "Last name must be at least 3 characters long")
    @Column(name = "lastName")
    private String lastName;

    @Digits(integer = 10, fraction = 0, message = "Mobile number must be a 10-digit integer")
    @Column(name = "mobileNumber")
    private long mobileNumber;

    @Column(name = "address")
    private long address;

    @Email
    @Column(name = "emailId")
    private String emailId;

    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", message = "Incorrect Password format")
    @Column(name = "password")
    private String password;

}
