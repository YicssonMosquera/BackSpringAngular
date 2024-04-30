package com.back.usecase;

import com.back.model.Register;
import com.back.model.gateway.RegisterRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class GetRegisterUseCase {
    private final RegisterRepository repository;

    public Flux<Register>getAllRegister(){
        return repository.getAllRegister();
    }

    public Mono<Register>getOneRegister(Integer id){
        return repository.getByIdRegister(id);
    }
}
