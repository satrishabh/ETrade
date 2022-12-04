package com.project.rishabh.etrade.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="stock")
public class Stock {

    @Id
    @GeneratedValue
    @Column(name = "stock_id")
    private Integer stockId;

    private String name;

    private String sector;

    private String unitPrice;

    private String exchange;

    private long category;

    private String risk;

    private LocalDateTime date;
}
