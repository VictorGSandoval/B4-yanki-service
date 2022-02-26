package com.bank.yanki.service.service;

import com.bank.yanki.service.model.Yanki;
import com.bank.yanki.service.repository.YankiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class YankiService implements IYankiService{

    private final YankiRepository repository;

    @Override
    public Flux<Yanki> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Yanki> save(Yanki yanki) {
        return repository.save(yanki);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono<Yanki> findById(String id) {
        return repository.findById(id);
    }
}
