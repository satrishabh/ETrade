package com.project.rishabh.etrade.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDto {

    private Integer addressId;

    private UserDto user;

    private String houseNumber;

    private String street;

    private String city;

    private String state;

    private String country;

    private long pincode;
}
