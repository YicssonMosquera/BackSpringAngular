package com.back.model.gateway;

import com.back.model.Register;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RegisterRepository {
    Mono<Register> saveRegister(Register register);
    Flux<Register> getAllRegister();
    Mono<Register>getByIdRegister(Integer id);
    Mono<Void>DeleteRegister(Integer id);
}
