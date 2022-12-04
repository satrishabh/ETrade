package com.project.rishabh.etrade.service;

import com.project.rishabh.etrade.entity.Address;

public interface AddressService {

    Address saveAddress(Address address);

    Address getAddress(Integer addressId);
}
