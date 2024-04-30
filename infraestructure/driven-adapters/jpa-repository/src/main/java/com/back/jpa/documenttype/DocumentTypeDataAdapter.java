package com.back.jpa.documenttype;

import com.back.model.DocumentType;
import com.back.model.gateway.DocumentTypeRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class DocumentTypeDataAdapter implements DocumentTypeRepository {
    private final DocumentTypeDataRepository repository;
    private final DocumentTypeDataMapper mapper;

    public DocumentTypeDataAdapter(DocumentTypeDataRepository repository, DocumentTypeDataMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Flux<DocumentType> getAllDocument() {
        return Flux.fromIterable(repository.findAll()).map(mapper::getDocumentType);
    }
}
