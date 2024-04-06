package com.application.showtime.UserOnboarding.controller;

import com.application.showtime.UserOnboarding.entity.UserLogin;
import com.application.showtime.UserOnboarding.entity.UserRegistrationEntity;
import com.application.showtime.UserOnboarding.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserRegistrationController {

    @Autowired
    UserRegistrationService userRegistrationService;

    @PostMapping("/registration/add")
    public ResponseEntity<String> createNewUser(@RequestBody UserRegistrationEntity userRegistrationEntity)
    {
        userRegistrationService.createNewUser(userRegistrationEntity);
        return new ResponseEntity<>("User created", HttpStatus.CREATED);
    }
    @GetMapping("/registration/get")
    public ResponseEntity<List<UserRegistrationEntity>> getAllUsers(){
        return new ResponseEntity<>(userRegistrationService.getAllUsers(),HttpStatus.OK);
    }

    @DeleteMapping("/registration/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable long id){
        userRegistrationService.deleteUser(id);
        return new ResponseEntity<>("User Deleted",HttpStatus.OK);
    }

    @PostMapping("/login")
    public  ResponseEntity<String> userLogin(@RequestBody UserLogin userLogin){
        Optional<UserRegistrationEntity> user = userRegistrationService.getUserByMail(userLogin.getLoginEmailId());
        if(user.isPresent()){
            if(userLogin.getLoginPassword().equals(user.get().getPassword())){
                return new ResponseEntity<>("login successful!",HttpStatus.OK);
            }else {
                return new ResponseEntity<>("user not found", HttpStatus.NOT_FOUND);
            }
        }else{
            return new ResponseEntity<>("user not found",HttpStatus.NOT_FOUND);
        }

    }
}
