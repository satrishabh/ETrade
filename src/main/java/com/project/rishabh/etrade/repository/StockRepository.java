package com.project.rishabh.etrade.repository;

import com.project.rishabh.etrade.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Integer> {


}
