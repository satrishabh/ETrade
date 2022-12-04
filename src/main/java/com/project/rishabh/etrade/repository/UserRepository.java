package com.project.rishabh.etrade.repository;

import com.project.rishabh.etrade.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


}
