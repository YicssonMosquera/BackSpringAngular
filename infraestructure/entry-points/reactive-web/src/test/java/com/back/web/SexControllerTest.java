package com.back.web;

import com.back.model.Sex;
import com.back.usecase.GetSexUseCase;
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
class SexControllerTest {
    @InjectMocks
    SexController sexController;

    @Mock
    GetSexUseCase useCase;

    @Test
    void getAllSex() {
        Mockito.when(useCase.getAllSex()).thenReturn(Flux.just(Sex.builder().build()));
        StepVerifier.create(sexController.getAllSex())
                .assertNext(Assertions::assertNotNull).verifyComplete();
    }
}