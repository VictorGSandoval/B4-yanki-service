package com.bank.yanki.service.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("PaymentDebitCard")
public class PaymentDebitCard {
    @Id
    private String id;
    private String phoneNumber;
    private String cardNumber;

}
