package com.application.showtime.UserOnboarding.entity;

import lombok.Data;

@Data
public class UserLogin {
    private String loginEmailId;
    private String loginPassword;

    public String getLoginEmailId() {
        return loginEmailId;
    }

    public void setLoginEmailId(String loginEmailId) {
        this.loginEmailId = loginEmailId;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
}
