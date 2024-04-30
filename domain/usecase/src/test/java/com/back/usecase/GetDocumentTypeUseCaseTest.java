package com.back.usecase;

import com.back.model.DocumentType;
import com.back.model.gateway.DocumentTypeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;

import reactor.test.StepVerifier;



@ExtendWith(MockitoExtension.class)
class GetDocumentTypeUseCaseTest {
    @InjectMocks
    GetDocumentTypeUseCase documentTypeUseCase;

    @Mock
    DocumentTypeRepository repository;

    @Test
    void getAllDocumentType() {
        Mockito.when(repository.getAllDocument()).thenReturn(Flux.just(DocumentType.builder().build()));
        StepVerifier.create(documentTypeUseCase.getAllDocumentType()).
                assertNext(Assertions::assertNotNull).verifyComplete();
    }
}