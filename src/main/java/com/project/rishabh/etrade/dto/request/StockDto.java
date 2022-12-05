package com.project.rishabh.etrade.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StockDto {

    private Integer stockId;

    private String name;

    private String sector;

    private String unitPrice;

    private String exchange;

    private String category;

    private String risk;

    private LocalDateTime date;
}
