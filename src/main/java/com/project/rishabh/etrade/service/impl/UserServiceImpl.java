package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.dto.request.UserDto;
import com.project.rishabh.etrade.dto.response.UserResponseDto;
import com.project.rishabh.etrade.entity.User;
import com.project.rishabh.etrade.exception.NotFoundException;
import com.project.rishabh.etrade.repository.UserRepository;
import com.project.rishabh.etrade.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserResponseDto saveUserDetails(UserDto userDto) {

        Optional<User> userByEmailId = userRepository.findByEmail(userDto.getEmail());
        if (userByEmailId.isEmpty()) {

            User user = modelMapper.map(userDto, User.class);
            user.setPassword(bcryptEncoder.encode(userDto.getPassword()));
            user = userRepository.save(user);
            return modelMapper.map(user, UserResponseDto.class);
        } else {
            throw new NotFoundException("UserId is already Present ");
        }
    }

    @Override
    public UserResponseDto getUserDetails(Integer userId) {

        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            return modelMapper.map(user, UserResponseDto.class);
        } else {
            throw new NotFoundException("userId is not Found");
        }
    }
}
