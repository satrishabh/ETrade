package com.project.rishabh.etrade.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtUserDetailsService {
    UserDetails loadUserByUsername(String username);
}
