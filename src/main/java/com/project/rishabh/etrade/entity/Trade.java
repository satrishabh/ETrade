package com.project.rishabh.etrade.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="trade")
public class Trade {

    @Id
    @GeneratedValue
    @Column(name="trade_id")
    private Integer tradeId;

    @ManyToOne(targetEntity = User.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",referencedColumnName = "user_id")
    private User user;

    private Integer unitPrice;

    private Integer quantity;

    private String type;

    @ManyToOne(targetEntity = Stock.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="stock_id",referencedColumnName = "stock_id")
    private Stock stock;

}
