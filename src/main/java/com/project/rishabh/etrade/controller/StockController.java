package com.project.rishabh.etrade.controller;

import com.project.rishabh.etrade.entity.Stock;
import com.project.rishabh.etrade.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping("/create")
    public ResponseEntity<Stock> addStockDetails(@RequestBody Stock stock){

        return ResponseEntity.status(HttpStatus.OK).body(stockService.saveStockDetails(stock));
    }

    @GetMapping("retrieve/{stockId}")
    public ResponseEntity<Stock> getStockDetails(@PathVariable Integer stockId){

        return ResponseEntity.status(HttpStatus.OK).body(stockService.getStockDetails(stockId));
    }

}
