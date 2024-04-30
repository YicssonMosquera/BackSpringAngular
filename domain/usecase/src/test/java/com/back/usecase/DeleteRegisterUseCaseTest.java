package com.back.usecase;

import com.back.model.gateway.RegisterRepository;
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
class DeleteRegisterUseCaseTest {

    @InjectMocks
    DeleteRegisterUseCase useCase;

    @Mock
    RegisterRepository registerRepository;

    @Test
    void delete() {
        Mockito.when(registerRepository.DeleteRegister(Mockito.any())).thenReturn(Mono.empty());
        StepVerifier.create(useCase.delete(Mockito.any())).verifyComplete();
    }
}