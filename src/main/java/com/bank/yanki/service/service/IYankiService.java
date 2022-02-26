package com.bank.yanki.service.service;

import com.bank.yanki.service.model.Yanki;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IYankiService {

    Flux<Yanki> findAll();

     Mono<Yanki> save(Yanki yanki);

     Mono<Void> delete(String id);

     Mono<Yanki> findById(String id);
    
}
