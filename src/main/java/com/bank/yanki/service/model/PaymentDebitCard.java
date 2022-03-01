package com.bank.yanki.service.model;


import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Data
@Document("PaymentDebitCard")
public class PaymentDebitCard {
    @Id
    private String id;
    private String phoneNumber;
    private String idDebitCardNumber;

}
