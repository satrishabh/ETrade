package com.project.rishabh.etrade.service;

import com.project.rishabh.etrade.entity.User;

public interface UserService {
    User saveUserDetails(User address);

    User getUserDetails(Integer userId);
}
