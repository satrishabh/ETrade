package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.entity.Stock;
import com.project.rishabh.etrade.repository.StockRepository;
import com.project.rishabh.etrade.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public Stock saveStockDetails(Stock stock) {

        return stockRepository.save(stock);
    }

    @Override
    public Stock getStockDetails(Integer stockId) {

        Optional<Stock> stock = stockRepository.findById(stockId);
        return stock.get();
    }
}
