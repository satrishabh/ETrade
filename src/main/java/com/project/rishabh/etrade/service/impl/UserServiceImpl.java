package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.entity.User;
import com.project.rishabh.etrade.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    @Override
    public User saveUserDetails(User user) {
        return null;
    }

    @Override
    public User getUserDetails(Integer userId) {
        return null;
    }
}
