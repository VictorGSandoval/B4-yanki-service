package com.bank.yanki.service.consumerKafka;


import com.bank.yanki.service.service.IYankiService;
import com.bank.yanki.service.service.PaymentDebitCardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class YankiConsumer {
    @Autowired
    private IYankiService service;

    @Autowired
    private PaymentDebitCardService paymentDebitCardService;


}
