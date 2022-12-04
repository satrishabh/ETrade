package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.entity.BankDetails;
import com.project.rishabh.etrade.repository.BankDetailsRepository;
import com.project.rishabh.etrade.service.BankDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BankDetailsServiceImpl implements BankDetailsService {

    @Autowired
    private BankDetailsRepository bankDetailsRepository;

    @Override
    public BankDetails saveBankDetails(BankDetails bankDetails) {

        return bankDetailsRepository.save(bankDetails);
    }

    @Override
    public BankDetails getBankDetails(Integer bankId) {

        Optional<BankDetails> bankDetails1 = bankDetailsRepository.findById(bankId);
        return bankDetails1.get();
    }
}
