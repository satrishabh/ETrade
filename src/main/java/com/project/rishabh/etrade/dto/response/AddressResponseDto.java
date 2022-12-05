package com.project.rishabh.etrade.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressResponseDto {

    private Integer addressId;

    private Integer userId;

    private String houseNumber;

    private String street;

    private String city;

    private String state;

    private String country;

    private long pincode;
}
