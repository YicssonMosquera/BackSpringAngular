package com.back.usecase;

import com.back.model.DocumentType;
import com.back.model.gateway.DocumentTypeRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class GetDocumentTypeUseCase {
    private final DocumentTypeRepository repository;

    public Flux<DocumentType>getAllDocumentType(){
        return repository.getAllDocument();
    }
}
