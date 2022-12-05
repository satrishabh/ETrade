package com.project.rishabh.etrade.service;

import com.project.rishabh.etrade.dto.request.UserDto;
import com.project.rishabh.etrade.dto.response.UserResponseDto;

public interface UserService {

    UserResponseDto saveUserDetails(UserDto userDto);

    UserResponseDto getUserDetails(Integer userId);
}
