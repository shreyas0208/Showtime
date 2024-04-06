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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message = "Incorrect Password format")
    private String password;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
