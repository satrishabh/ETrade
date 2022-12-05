package com.project.rishabh.etrade.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StockResponseDto {

    private Integer stockId;

    private String name;

    private String sector;

    private String unitPrice;

    private String exchange;

    private String category;

    private String risk;

    private LocalDateTime date;
}
