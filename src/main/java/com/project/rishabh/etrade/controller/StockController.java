package com.project.rishabh.etrade.controller;

import com.project.rishabh.etrade.dto.request.StockDto;
import com.project.rishabh.etrade.dto.response.StockResponseDto;
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
    public ResponseEntity<StockResponseDto> addStockDetails(@RequestBody StockDto stockDto){

        return ResponseEntity.status(HttpStatus.OK).body(stockService.saveStockDetails(stockDto));
    }

    @GetMapping("retrieve/{stockId}")
    public ResponseEntity<StockResponseDto> getStockDetails(@PathVariable Integer stockId, @RequestHeader("Authorization") String authorization) {

        return ResponseEntity.status(HttpStatus.OK).body(stockService.getStockDetails(stockId));
    }

}
