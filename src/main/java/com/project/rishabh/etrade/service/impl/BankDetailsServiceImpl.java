package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.entity.BankDetails;
import com.project.rishabh.etrade.service.BankDetailsService;
import org.springframework.stereotype.Service;

@Service
public class BankDetailsServiceImpl implements BankDetailsService {

    @Override
    public BankDetails saveBankDetails(BankDetails address) {
        return new BankDetails();
    }

    @Override
    public BankDetails getBankDetails(Integer bankId) {
        return new BankDetails();
    }
}
