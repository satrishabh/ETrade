package com.project.rishabh.etrade.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue
    @Column
    private Integer addressId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id",referencedColumnName="user_id")
    private User user;

    private String houseNumber;

    private String street;

    private long city;

    private String state;

    private String country;

    private String pincode;
}
