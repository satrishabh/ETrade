package com.project.rishabh.etrade.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user_bank")
public class BankDetails {

    @Id
    @GeneratedValue
    @Column
    private Integer bankId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    private String accountNumber;

    private String accountType;

    private String bankName;

    private long savingAmount;

    private String ifscCode;
}
