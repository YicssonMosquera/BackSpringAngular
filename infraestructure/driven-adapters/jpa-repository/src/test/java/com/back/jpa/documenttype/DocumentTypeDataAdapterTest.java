package com.back.jpa.documenttype;

import com.back.model.DocumentType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
class DocumentTypeDataAdapterTest {
    @InjectMocks
    DocumentTypeDataAdapter adapter;

    @Mock
    DocumentTypeDataRepository repository;

    @Mock
    DocumentTypeDataMapper mapper;



    @Test
    void getAllDocument() {
        List<DocumentTypeData>documentTypeData = new ArrayList<>();
        Mockito.when(repository.findAll()).thenReturn(documentTypeData);
        StepVerifier.create(adapter.getAllDocument()).verifyComplete();
    }
}