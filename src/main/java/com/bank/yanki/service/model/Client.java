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
public class Client {
    private String id;
    private String nameClient;
    private String typeClient;
    private String identityDocument;
    private String phoneNumber;
    private Date createDate;
}
