package com.project.rishabh.etrade.controller;

import com.project.rishabh.etrade.dto.request.AddressDto;
import com.project.rishabh.etrade.dto.response.AddressResponseDto;
import com.project.rishabh.etrade.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/create")
    public ResponseEntity<AddressResponseDto> addAddress(@RequestBody AddressDto addressDto) {

        return ResponseEntity.status(HttpStatus.OK).body(addressService.saveAddress(addressDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable("id") Integer userId, @RequestHeader("Authorization") String authorization) {

        addressService.deleteAddress(userId);
        return new ResponseEntity<>(NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<AddressDto> updateAddress(@PathVariable("id") Integer userId, @RequestBody AddressDto addressDto, @RequestHeader("Authorization") String authorization) {
        return ResponseEntity.status(HttpStatus.OK).body(addressService.updateAddress(userId, addressDto));
    }


    @GetMapping("/retrieve/{addressId}")
    public ResponseEntity<AddressResponseDto> getAddress(@PathVariable Integer userId, @RequestHeader("Authorization") String authorization) {

        return ResponseEntity.status(HttpStatus.OK).body(addressService.getAddress(userId));
    }
}
