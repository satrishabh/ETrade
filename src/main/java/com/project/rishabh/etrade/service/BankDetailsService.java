package com.project.rishabh.etrade.service;

import com.project.rishabh.etrade.dto.request.BankDetailsDto;
import com.project.rishabh.etrade.dto.response.BankDetailsResponseDto;

public interface BankDetailsService {

    BankDetailsResponseDto saveBankDetails(BankDetailsDto bankDetailsDto);

    BankDetailsResponseDto getBankDetails(Integer bankId);
}
