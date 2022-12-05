package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.dto.request.StockDto;
import com.project.rishabh.etrade.dto.response.StockResponseDto;
import com.project.rishabh.etrade.entity.Stock;
import com.project.rishabh.etrade.exception.NotFoundException;
import com.project.rishabh.etrade.repository.StockRepository;
import com.project.rishabh.etrade.service.StockService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public StockResponseDto saveStockDetails(StockDto stockDto) {
        Optional<Stock> stockOptional = stockRepository.findByName(stockDto.getName());
        if (stockOptional.isEmpty()) {
            Stock stock = modelMapper.map(stockDto, Stock.class);
            stock = stockRepository.save(stock);
            return modelMapper.map(stock, StockResponseDto.class);
        } else {
            throw new NotFoundException("Stock is already Present ");
        }
    }

    @Override
    public StockResponseDto getStockDetails(Integer stockId) {

        Optional<Stock> stock = stockRepository.findById(stockId);
        if (stock.isPresent()) {
            return modelMapper.map(stock, StockResponseDto.class);
        } else {
            throw new NotFoundException("Stock is not Found");
        }
    }
}
