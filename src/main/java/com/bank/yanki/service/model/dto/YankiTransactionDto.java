package com.bank.yanki.service.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class YankiTransactionDto {
    private static final long serialVersionUID = 1L;

    private String id;

    private String originNumber;

    private String destinationNumber;

    private Double amount;

    private Status status;

    private LocalDateTime createAt;

    private String idDebitCardNumber;

    public enum Status {
        PENDING,
        REJECTED,
        SUCCESSFUL
    }

}
