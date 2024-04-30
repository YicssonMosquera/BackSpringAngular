package com.back.usecase;

import com.back.model.Register;
import com.back.model.gateway.RegisterRepository;
import com.back.model.gateway.SexRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@ExtendWith(MockitoExtension.class)
class GetRegisterUseCaseTest {
    @InjectMocks
    GetRegisterUseCase useCase;

    @Mock
    RegisterRepository repository;

    @Test
    void getAllRegister() {
        Mockito.when(repository.getAllRegister()).thenReturn(Flux.just(Register.builder().build()));
        StepVerifier.create(useCase.getAllRegister())
                .assertNext(Assertions::assertNotNull).verifyComplete();
    }

    @Test
    void getOneRegister() {
        Mockito.when(repository.getByIdRegister(Mockito.any())).thenReturn(Mono.just(Register.builder().build()));
        StepVerifier.create(useCase.getOneRegister(Mockito.any()))
                .assertNext(Assertions::assertNotNull).verifyComplete();
    }
}