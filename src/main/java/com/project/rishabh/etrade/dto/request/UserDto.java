package com.project.rishabh.etrade.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    private String firstName;

    private String lastName;

    private String Password;

    private long contactNumber;

    private String email;

    private BankDetailsDto bankdetails;

    private AddressDto address;

}
