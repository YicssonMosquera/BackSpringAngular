package com.back.usecase;

import com.back.model.Sex;
import com.back.model.gateway.SexRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class GetSexUseCase {
    private final SexRepository repository;

    public Flux<Sex>getAllSex(){
        return repository.getAllSex();
    }
}
