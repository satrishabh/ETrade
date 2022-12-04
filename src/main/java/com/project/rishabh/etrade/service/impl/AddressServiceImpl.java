package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.entity.Address;
import com.project.rishabh.etrade.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    @Override
    public Address saveAddress(Address address){
        return new Address();
    }

    @Override
    public Address getAddress(Integer addressId){
        return new Address();
    }
}
