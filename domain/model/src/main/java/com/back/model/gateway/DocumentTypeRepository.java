package com.back.model.gateway;

import com.back.model.DocumentType;
import reactor.core.publisher.Flux;

public interface DocumentTypeRepository {
    Flux<DocumentType> getAllDocument();
}
