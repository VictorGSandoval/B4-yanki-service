package com.bank.yanki.service.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Debit {

    private String id;

    private String cardNumber;

    private String idClient;

    private String numberAccount;

    private LocalDate creationDate;

    private LocalDate expirationDate;

}
