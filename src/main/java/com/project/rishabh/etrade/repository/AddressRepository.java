package com.project.rishabh.etrade.repository;

import com.project.rishabh.etrade.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {


}
