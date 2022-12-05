package com.project.rishabh.etrade.repository;

import com.project.rishabh.etrade.entity.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends JpaRepository<Trade,Integer> {


}
