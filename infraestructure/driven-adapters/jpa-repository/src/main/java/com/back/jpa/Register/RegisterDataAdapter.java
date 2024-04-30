package com.back.jpa.Register;

import com.back.model.Register;
import com.back.model.gateway.RegisterRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class RegisterDataAdapter implements RegisterRepository {
    private final RegisterDataRepository repository;
    private final RegisterDataMapper mapper;

    public RegisterDataAdapter(RegisterDataRepository repository, RegisterDataMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Mono<Register> saveRegister(Register register) {
        return Mono.just(mapper.getRegister(repository.save(mapper.getRegisterData(register))));
    }

    @Override
    public Flux<Register> getAllRegister() {
        return Flux.fromIterable(repository.findAll()).map(mapper::getRegister);
    }

    @Override
    public Mono<Register> getByIdRegister(Integer id) {
        return Mono.just(repository.findById(id).map(mapper::getRegister).orElse(Register.builder().build()));
    }

    @Override
    public Mono<Void> DeleteRegister(Integer id) {
        repository.deleteById(id);
        return Mono.empty();
    }
}
