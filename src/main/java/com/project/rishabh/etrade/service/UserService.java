package com.project.rishabh.etrade.service;

import com.project.rishabh.etrade.entity.User;

public interface UserService {

    User saveUserDetails(User user);

    User getUserDetails(Integer userId);
}
