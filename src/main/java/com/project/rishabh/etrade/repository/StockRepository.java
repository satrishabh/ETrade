package com.project.rishabh.etrade.repository;

import com.project.rishabh.etrade.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock,Integer> {

    Optional<Stock> findByName(String stockName);
}
