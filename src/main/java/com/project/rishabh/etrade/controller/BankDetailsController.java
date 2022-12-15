package com.project.rishabh.etrade.controller;

import com.project.rishabh.etrade.dto.request.BankDetailsDto;
import com.project.rishabh.etrade.dto.response.BankDetailsResponseDto;
import com.project.rishabh.etrade.service.BankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bankdetails")
public class BankDetailsController {

    @Autowired
    private BankDetailsService bankDetailsService;

    @PostMapping("/create")
    public ResponseEntity<BankDetailsResponseDto> saveBankDetails(@RequestBody BankDetailsDto bankDetailsDto) {

        return ResponseEntity.status(HttpStatus.OK).body(bankDetailsService.saveBankDetails(bankDetailsDto));
    }

    @GetMapping("retrieve/{bankId}")
    public ResponseEntity<BankDetailsResponseDto> getBankDetails(@PathVariable Integer bankId, @RequestHeader("Authorization") String authorization) {

        return ResponseEntity.status(HttpStatus.OK).body(bankDetailsService.getBankDetails(bankId));
    }

}
