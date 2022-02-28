package com.bank.yanki.service.service;

import com.bank.yanki.service.model.Yanki;
import com.bank.yanki.service.model.dto.YankiDto;
import com.bank.yanki.service.redis.Util.EntityDtoUtil;
import com.bank.yanki.service.repository.YankiRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RequiredArgsConstructor
@Service
@AllArgsConstructor
@ConditionalOnProperty(name = "cache.enabled", havingValue = "false")
public class YankiServiceWithNoCache implements IYankiService {

    //Clorox
    @Autowired
    private  YankiRepository repository;
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public Flux<Yanki> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<YankiDto> save(Yanki yanki) {
        return  repository.save(yanki).flatMap(this::getYankiDto);
    }


    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono<Void> update(String id, Mono<YankiDto> mono) {
        return this.repository.findById(id)
                .zipWith(mono)
                .doOnNext(t -> t.getT1().setAmount(t.getT2().getAmount()))
                .map(Tuple2::getT1)
                .flatMap(this.repository::save)
                .then();
    }


    @Override
    public Mono<YankiDto> getYanki(String id) {
        return repository.findById(id).map(EntityDtoUtil::toDto);
    }

    @Override
    public Mono<YankiDto> findByPhoneNumber(String phoneNumber) {
        return repository.findByPhoneNumber(phoneNumber).flatMap(this::getYankiDto);
    }

    @Override
    public Mono<Yanki> getYanki(YankiDto yankiDto) {
        return Mono.just(objectMapper.convertValue(yankiDto, Yanki.class));
    }

    @Override
    public Mono<YankiDto> getYankiDto(Yanki yanki) {
        return Mono.just(objectMapper.convertValue(yanki, YankiDto.class));
    }


}
