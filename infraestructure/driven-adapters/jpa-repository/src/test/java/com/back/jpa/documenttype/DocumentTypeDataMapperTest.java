package com.back.jpa.documenttype;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DocumentTypeDataMapperTest {
    @InjectMocks
    DocumentTypeDataMapper mapper;

    @Test
    void getDocumentType() {
        assertThat(mapper.getDocumentType(DocumentTypeData.builder().build())).isNotNull();
    }
}