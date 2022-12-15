package com.project.rishabh.etrade.controller;

import com.project.rishabh.etrade.dto.request.UserDto;
import com.project.rishabh.etrade.dto.response.UserResponseDto;
import com.project.rishabh.etrade.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<UserResponseDto> addUserDetails(@RequestBody UserDto userDto) {

        return ResponseEntity.status(HttpStatus.OK).body(userService.saveUserDetails(userDto));
    }

    @GetMapping("/retrieve/{userId}")
    public ResponseEntity<UserResponseDto> getUserDetails(@PathVariable Integer userId, @RequestHeader("Authorization") String authorization) {

        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserDetails(userId));
    }
}
