package com.project.rishabh.etrade.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TradeDto {

    private Integer userId;

    private Integer unitPrice;

    private Integer quantity;

    private String type;

    private Integer stockId;

}
