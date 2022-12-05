package com.project.rishabh.etrade.service.impl;

import com.project.rishabh.etrade.dto.request.AddressDto;
import com.project.rishabh.etrade.dto.response.AddressResponseDto;
import com.project.rishabh.etrade.entity.Address;
import com.project.rishabh.etrade.entity.User;
import com.project.rishabh.etrade.exception.NotFoundException;
import com.project.rishabh.etrade.repository.AddressRepository;
import com.project.rishabh.etrade.repository.UserRepository;
import com.project.rishabh.etrade.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AddressResponseDto saveAddress(AddressDto addressDto) {

        Optional<User> user = userRepository.findById(addressDto.getUserId());
        if (user.isPresent()) {

            Address address = modelMapper.map(addressDto, Address.class);
            address.setUser(user.get());
            address = addressRepository.save(address);
            return modelMapper.map(address, AddressResponseDto.class);
        }else {
            throw new NotFoundException("UserId is not Found");
        }

    }

    @Override
    public AddressResponseDto getAddress(Integer addressId) {

        Optional<Address> address1 = addressRepository.findById(addressId);
        if(address1.isPresent()){
            return modelMapper.map(address1, AddressResponseDto.class);
        }else{
            throw new NotFoundException("addressId is not Found");
        }

    }
}
