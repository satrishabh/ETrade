package com.project.rishabh.etrade.service;

import com.project.rishabh.etrade.entity.Stock;

public interface StockService {
    Stock saveStockDetails(Stock stock);

    Stock getStockDetails(Integer stockId);
}
