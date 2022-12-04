package com.project.rishabh.etrade.controller;

import com.project.rishabh.etrade.entity.User;
import com.project.rishabh.etrade.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> addUserDetails(@RequestBody User user){

        return ResponseEntity.status(HttpStatus.OK).body(userService.saveUserDetails(user));
    }

    @GetMapping("/retrieve/{userId}")
    public ResponseEntity<User> getUserDetails(@PathVariable Integer userId){

        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserDetails(userId));
    }
}
