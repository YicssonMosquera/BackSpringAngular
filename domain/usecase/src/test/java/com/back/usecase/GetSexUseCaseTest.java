package com.back.usecase;

import com.back.model.Sex;
import com.back.model.gateway.SexRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GetSexUseCaseTest {

    @InjectMocks
    GetSexUseCase useCase;

    @Mock
    SexRepository repository;

    @Test
    void getAllSex() {
        Mockito.when(repository.getAllSex()).thenReturn(Flux.just(Sex.builder().build()));
        StepVerifier.create(useCase.getAllSex())
                .assertNext(Assertions::assertNotNull).verifyComplete();
    }
}