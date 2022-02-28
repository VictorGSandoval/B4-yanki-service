package com.bank.yanki.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Debit {

    private String id;

    private String cardNumber;

    private String idClient;

    private String numberAccount;

    private LocalDate creationDate;

    private LocalDate expirationDate;

}
