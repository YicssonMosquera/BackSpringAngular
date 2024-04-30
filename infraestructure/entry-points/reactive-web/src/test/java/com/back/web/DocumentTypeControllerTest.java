package com.back.web;

import com.back.model.DocumentType;
import com.back.usecase.GetDocumentTypeUseCase;
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
class DocumentTypeControllerTest {

    @InjectMocks
    DocumentTypeController documentTypeController;
    @Mock
    GetDocumentTypeUseCase useCase;

    @Test
    void getAllDocumentType() {
        Mockito.when(useCase.getAllDocumentType()).thenReturn(Flux.just(DocumentType.builder().build()));
        StepVerifier.create(documentTypeController.getAllDocumentType())
                .assertNext(Assertions::assertNotNull).verifyComplete();
    }
}