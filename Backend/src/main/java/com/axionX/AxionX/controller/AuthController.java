package com.axionX.AxionX.controller;

import com.axionX.AxionX.model.User;
import com.axionX.AxionX.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private UserRepository userRepository;
    
    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
//    @PostMapping("/login")
//    public ResponseEntity<User> login(String username, String password) {
//        
//    }
    
    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody User user) {
        User newUser = new User();
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        newUser.setFullName(user.getFullName());
        System.out.println("came" + newUser);
        User userSaved = userRepository.save(newUser);
        return new ResponseEntity<>(userSaved ,HttpStatus.CREATED);
    }
    





}
