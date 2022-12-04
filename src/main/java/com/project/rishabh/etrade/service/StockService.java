package com.project.rishabh.etrade.service;

import com.project.rishabh.etrade.entity.Stock;

public interface StockService {
    Stock saveStockDetails(Stock address);

    Stock getStockDetails(Integer stockId);
}
