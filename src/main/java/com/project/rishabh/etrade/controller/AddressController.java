package com.project.rishabh.etrade.controller;

import com.project.rishabh.etrade.dto.request.AddressDto;
import com.project.rishabh.etrade.dto.response.AddressResponseDto;
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
    public ResponseEntity<AddressResponseDto> addAddress(@RequestBody AddressDto addressDto){

        return ResponseEntity.status(HttpStatus.OK).body(addressService.saveAddress(addressDto));
    }

    @GetMapping("/retrieve/{addressId}")
    public ResponseEntity<AddressResponseDto> getAddress(@PathVariable Integer addressId){

        return ResponseEntity.status(HttpStatus.OK).body(addressService.getAddress(addressId));
    }
}
