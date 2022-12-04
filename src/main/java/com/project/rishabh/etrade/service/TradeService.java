package com.project.rishabh.etrade.service;

import com.project.rishabh.etrade.entity.Trade;

public interface TradeService {
    Trade saveTradeDetails(Trade trade);

    Trade getTradeDetails(Integer tradeId);
}
