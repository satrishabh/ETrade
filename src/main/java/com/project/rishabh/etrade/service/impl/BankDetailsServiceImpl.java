package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.entity.BankDetails;
import com.project.rishabh.etrade.service.BankDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankDetailsServiceImpl implements BankDetailsService {

    @Override
    public BankDetails saveBankDetails(BankDetails bankDetails) {
        return new BankDetails();
    }

    @Override
    public BankDetails getBankDetails(Integer bankId) {
        return new BankDetails();
    }
}
