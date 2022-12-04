package com.project.rishabh.etrade.service;

import com.project.rishabh.etrade.entity.BankDetails;

public interface BankDetailsService {
    BankDetails saveBankDetails(BankDetails address);

    BankDetails getBankDetails(Integer bankId);
}
