package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.dto.request.TradeDto;
import com.project.rishabh.etrade.dto.response.TradeResponseDto;
import com.project.rishabh.etrade.entity.Stock;
import com.project.rishabh.etrade.entity.Trade;
import com.project.rishabh.etrade.entity.User;
import com.project.rishabh.etrade.exception.NotFoundException;
import com.project.rishabh.etrade.repository.StockRepository;
import com.project.rishabh.etrade.repository.TradeRepository;
import com.project.rishabh.etrade.repository.UserRepository;
import com.project.rishabh.etrade.service.TradeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeRepository tradeRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TradeResponseDto saveTradeDetails(TradeDto tradeDto) {

        Optional<User> user = userRepository.findById(tradeDto.getUserId());
        Optional<Stock> stock = stockRepository.findById(tradeDto.getStockId());
        if (user.isPresent()) {
            if (stock.isPresent()) {
                Trade trade = modelMapper.map(tradeDto, Trade.class);
                trade.setUser(user.get());
                trade = tradeRepository.save(trade);
                return modelMapper.map(trade, TradeResponseDto.class);
            } else {
                throw new NotFoundException("Stock is not Found");
            }
        } else {
            throw new NotFoundException("UserId is not Found");
        }
    }

    @Override
    public TradeResponseDto getTradeDetails(Integer tradeId) {
        Optional<Trade> trade = tradeRepository.findById(tradeId);
        if (trade.isPresent()) {
            return modelMapper.map(trade, TradeResponseDto.class);
        } else {
            throw new NotFoundException("TradeId is not Found");
        }
    }

}
