package com.project.rishabh.etrade.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TradeResponseDto {

    private Integer tradeId;

    private Integer userId;

    private Integer unitPrice;

    private Integer quantity;

    private String type;

    private Integer stockId;

}
