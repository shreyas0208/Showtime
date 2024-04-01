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
public class UserRegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Pattern(regexp = "^[a-zA-Z]+$", message = "First name must contain only alphabets")
    @Size(min = 2, message = "First name must be at least 2 characters long")
    private String firstName;

    @Pattern(regexp = "^[a-zA-Z]+$", message = "Last name must contain only alphabets")
    @Size(min = 2, message = "Last name must be at least 2 characters long")
    private String lastName;

    @Digits(integer = 10, fraction = 0, message = "Mobile number must be a 10-digit integer")
    private long mobileNumber;

    private String address;

    @Email
    private String emailId;

    //@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", message = "Incorrect Password format")
    private String password;

}
