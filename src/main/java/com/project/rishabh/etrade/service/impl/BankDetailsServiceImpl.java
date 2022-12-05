package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.dto.request.BankDetailsDto;
import com.project.rishabh.etrade.dto.response.BankDetailsResponseDto;
import com.project.rishabh.etrade.entity.BankDetails;
import com.project.rishabh.etrade.entity.User;
import com.project.rishabh.etrade.exception.NotFoundException;
import com.project.rishabh.etrade.repository.BankDetailsRepository;
import com.project.rishabh.etrade.repository.UserRepository;
import com.project.rishabh.etrade.service.BankDetailsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BankDetailsServiceImpl implements BankDetailsService {

    @Autowired
    private BankDetailsRepository bankDetailsRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public BankDetailsResponseDto saveBankDetails(BankDetailsDto bankDetailsDto) {

        Optional<User> user = userRepository.findById(bankDetailsDto.getUserId());
        if (user.isPresent()) {

            BankDetails bankDetails = modelMapper.map(bankDetailsDto, BankDetails.class);
            bankDetails.setUser(user.get());
            bankDetails = bankDetailsRepository.save(bankDetails);
            return modelMapper.map(bankDetails, BankDetailsResponseDto.class);
        }else {
            throw new NotFoundException("UserId is not Found");
        }
    }

    @Override
    public BankDetailsResponseDto getBankDetails(Integer bankId) {

        Optional<BankDetails> bankDetails = bankDetailsRepository.findById(bankId);
        if(bankDetails.isPresent()){
            return modelMapper.map(bankDetails, BankDetailsResponseDto.class);
        }else{
            throw new NotFoundException("bankId is not Found");
        }
    }
}
