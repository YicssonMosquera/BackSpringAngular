package com.back.web;

import com.back.model.DocumentType;
import com.back.usecase.GetDocumentTypeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping(value = "api/crudJavaAngular")
public class DocumentTypeController {
    private final GetDocumentTypeUseCase useCase;

    @GetMapping(path = "/documentType")
    public Flux<DocumentType>getAllDocumentType(){
        return useCase.getAllDocumentType();
    }
}
