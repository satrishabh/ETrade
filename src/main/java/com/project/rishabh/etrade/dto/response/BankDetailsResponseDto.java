package com.project.rishabh.etrade.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BankDetailsResponseDto {

    private Integer bankId;

    private Integer userId;

    private String accountNumber;

    private String accountType;

    private String bankName;

    private long savingAmount;

    private String ifscCode;
}
