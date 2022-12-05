package com.project.rishabh.etrade.repository;

import com.project.rishabh.etrade.entity.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails,Integer> {


}
