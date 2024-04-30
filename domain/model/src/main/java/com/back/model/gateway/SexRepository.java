package com.back.model.gateway;

import com.back.model.Sex;
import reactor.core.publisher.Flux;

public interface SexRepository {
    Flux<Sex>getAllSex();
}
