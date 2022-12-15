package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.entity.User;
import com.project.rishabh.etrade.repository.UserRepository;
import com.project.rishabh.etrade.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JwtUserDetailsServiceImpl implements JwtUserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(username);
        if (!user.isPresent()) {
            throw new UsernameNotFoundException("User not found with username:" + username);
        }
        return new org.springframework.security.core.userdetails.User(user.get().getEmail(), user.get().getPassword(), new ArrayList<>());
    }
}
