package com.project.rishabh.etrade.controller;

import com.project.rishabh.etrade.entity.Trade;
import com.project.rishabh.etrade.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trade")
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @PostMapping("/create")
    public ResponseEntity<Trade> addTradeDetails(@RequestBody Trade trade){

        return ResponseEntity.status(HttpStatus.OK).body(tradeService.saveTradeDetails(trade));
    }

    @GetMapping("retrieve/{tradeId}")
    public ResponseEntity<Trade> getTradeDetails(@PathVariable Integer tradeId){

        return ResponseEntity.status(HttpStatus.OK).body(tradeService.getTradeDetails(tradeId));
    }

}
