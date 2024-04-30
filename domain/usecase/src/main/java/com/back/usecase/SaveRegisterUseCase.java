package com.back.usecase;

import com.back.model.Register;
import com.back.model.gateway.RegisterRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaveRegisterUseCase {
    private final RegisterRepository repository;

    public Mono<Register>save(Register register){
        return repository.saveRegister(register);
    }
}
