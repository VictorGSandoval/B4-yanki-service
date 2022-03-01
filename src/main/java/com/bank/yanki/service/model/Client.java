package com.bank.yanki.service.model;

import lombok.*;

import java.util.Date;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private String id;
    private String nameClient;
    private String typeClient;
    private String identityDocument;
    private String phoneNumber;
    private Date createDate;
}
