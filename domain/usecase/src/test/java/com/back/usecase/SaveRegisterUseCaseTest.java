package com.back.usecase;

import com.back.model.Register;
import com.back.model.gateway.RegisterRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SaveRegisterUseCaseTest {
    @InjectMocks
    SaveRegisterUseCase saveRegisterUseCase;

    @Mock
    RegisterRepository repository;

    @Test
    void save() {
        Mockito.when(repository.saveRegister(Mockito.any())).thenReturn(Mono.just(Register.builder().build()));
        StepVerifier.create(saveRegisterUseCase.save(Mockito.any()))
                .assertNext(Assertions::assertNotNull).verifyComplete();
    }
}