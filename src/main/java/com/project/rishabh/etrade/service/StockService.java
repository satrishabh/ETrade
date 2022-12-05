package com.project.rishabh.etrade.service;

import com.project.rishabh.etrade.dto.request.StockDto;
import com.project.rishabh.etrade.dto.response.StockResponseDto;

public interface StockService {
    StockResponseDto saveStockDetails(StockDto stock);

    StockResponseDto getStockDetails(Integer stockId);
}
