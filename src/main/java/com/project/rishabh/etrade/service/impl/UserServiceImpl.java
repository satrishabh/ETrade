package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.entity.User;
import com.project.rishabh.etrade.repository.UserRepository;
import com.project.rishabh.etrade.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUserDetails(User user) {

        return userRepository.save(user);
    }

    @Override
    public User getUserDetails(Integer userId) {

        Optional<User> user=userRepository.findById(userId);
        return user.get();
    }
}
