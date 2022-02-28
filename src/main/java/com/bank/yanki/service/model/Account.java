package com.bank.yanki.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String id;
    private String number;
    private Double lineAvailable;
    private Double lineUsed;
    private Double balancePast;
    private Double amount;
    private Date createDate;
    private Integer countMovements;
    private String idClient;
    private String idProducts;
}
