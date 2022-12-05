package com.project.rishabh.etrade.service;

import com.project.rishabh.etrade.dto.request.TradeDto;
import com.project.rishabh.etrade.dto.response.TradeResponseDto;

public interface TradeService {
    TradeResponseDto saveTradeDetails(TradeDto tradeDto);

    TradeResponseDto getTradeDetails(Integer tradeId);
}
