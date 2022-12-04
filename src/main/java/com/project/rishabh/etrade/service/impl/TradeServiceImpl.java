package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.entity.Trade;
import com.project.rishabh.etrade.repository.TradeRepository;
import com.project.rishabh.etrade.service.TradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeRepository tradeRepository;

    @Override
    public Trade saveTradeDetails(Trade trade) {


        return tradeRepository.save(trade);
    }

    @Override
    public Trade getTradeDetails(Integer tradeId) {
        Optional<Trade> trade=tradeRepository.findById(tradeId);
        return trade.get();
    }

}
