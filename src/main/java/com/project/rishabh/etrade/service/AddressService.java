package com.project.rishabh.etrade.service;

import com.project.rishabh.etrade.dto.request.AddressDto;
import com.project.rishabh.etrade.dto.response.AddressResponseDto;

public interface AddressService {

    AddressResponseDto saveAddress(AddressDto addressDto);

    AddressResponseDto getAddress(Integer addressId);

    void deleteAddress(Integer userId);

    AddressDto updateAddress(Integer userId, AddressDto addressDto);
}
