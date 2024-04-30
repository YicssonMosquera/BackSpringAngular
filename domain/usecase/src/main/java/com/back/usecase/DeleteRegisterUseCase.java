package com.back.usecase;

import com.back.model.gateway.RegisterRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class DeleteRegisterUseCase {
    private final RegisterRepository repository;

    public Mono<Void>delete(Integer id){
        return repository.DeleteRegister(id);
    }
}
