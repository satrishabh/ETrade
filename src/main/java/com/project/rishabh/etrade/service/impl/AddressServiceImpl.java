package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.entity.Address;
import com.project.rishabh.etrade.repository.AddressRepository;
import com.project.rishabh.etrade.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address saveAddress(Address address){

        return addressRepository.save(address);
    }

    @Override
    public Address getAddress(Integer addressId){

        Optional<Address> address1 = addressRepository.findById(addressId);
        return address1.get();
    }
}
