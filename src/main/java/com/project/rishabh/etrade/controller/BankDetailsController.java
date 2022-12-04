package com.project.rishabh.etrade.controller;

import com.project.rishabh.etrade.entity.BankDetails;
import com.project.rishabh.etrade.service.BankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank-details")
public class BankDetailsController {

    @Autowired
    private BankDetailsService bankDetailsService;

    @PostMapping("/create")
    public ResponseEntity<BankDetails> saveBankDetails(@RequestBody BankDetails bankDetails) {

        return ResponseEntity.status(HttpStatus.OK).body(bankDetailsService.saveBankDetails(bankDetails));
    }

    @GetMapping("retrieve/{bankId}")
    public ResponseEntity<BankDetails> getBankDetails(@PathVariable Integer bankId) {

        return ResponseEntity.status(HttpStatus.OK).body(bankDetailsService.getBankDetails(bankId));
    }

}
