package com.back.jpa.Sex;

import com.back.model.Sex;
import com.back.model.gateway.SexRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class SexDataAdapter implements SexRepository {
    private final SexDataRepository repository;
    private final SexDataMapper mapper;

    public SexDataAdapter(SexDataRepository repository, SexDataMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Flux<Sex> getAllSex() {
        return Flux.fromIterable(repository.findAll()).map(mapper::getSex);
    }
}
