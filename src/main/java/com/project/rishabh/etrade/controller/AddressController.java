package com.project.rishabh.etrade.controller;

import com.project.rishabh.etrade.entity.Address;
import com.project.rishabh.etrade.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/create")
    public ResponseEntity<Address> addAddress(@RequestBody Address address){

        return ResponseEntity.status(HttpStatus.OK).body(addressService.saveAddress(address));
    }

    @GetMapping("/retrieve/{addressId}")
    public ResponseEntity<Address> getAddress(@PathVariable Integer addressId){

        return ResponseEntity.status(HttpStatus.OK).body(addressService.getAddress(addressId));
    }
}
