package com.back.jpa.documenttype;

import com.back.model.DocumentType;
import org.springframework.stereotype.Component;

@Component
public class DocumentTypeDataMapper {

    public DocumentType getDocumentType(DocumentTypeData documentTypeData){
        return DocumentType.builder()
                .id(documentTypeData.getId())
                .description(documentTypeData.getDescription()).build();
    }
}
