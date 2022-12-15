package com.project.rishabh.etrade.controller;

import com.project.rishabh.etrade.dto.request.TradeDto;
import com.project.rishabh.etrade.dto.response.TradeResponseDto;
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
    public ResponseEntity<TradeResponseDto> addTradeDetails(@RequestBody TradeDto tradeDto) {

        return ResponseEntity.status(HttpStatus.OK).body(tradeService.saveTradeDetails(tradeDto));
    }

    @GetMapping("retrieve/{tradeId}")
    public ResponseEntity<TradeResponseDto> getTradeDetails(@PathVariable Integer tradeId, @RequestHeader("Authorization") String authorization) {

        return ResponseEntity.status(HttpStatus.OK).body(tradeService.getTradeDetails(tradeId));
    }

}
