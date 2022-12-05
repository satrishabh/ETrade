package com.project.rishabh.etrade.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer userId;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Address address;

    private String firstName;

    private String lastName;

    private String Password;

    private long contactNumber;

    private String email;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private BankDetails bankdetails;

    @OneToMany(targetEntity = Trade.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Trade> trade;

}
