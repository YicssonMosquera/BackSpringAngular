package com.back;

import com.back.model.gateway.DocumentTypeRepository;
import com.back.model.gateway.RegisterRepository;
import com.back.model.gateway.SexRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class UseCaseConfigTest {
    @InjectMocks
    UseCaseConfig useCaseConfig;
    
    @Mock
    DocumentTypeRepository documentTypeRepository;
    
    @Mock
    SexRepository sexRepository;
    
    @Mock
    RegisterRepository registerRepository;

    @Test
    void getSexUseCase() {
        assertThat(useCaseConfig.getSexUseCase(sexRepository)).isNotNull();
    }

    @Test
    void getDocumentTypeUseCase() {
        assertThat(useCaseConfig.getDocumentTypeUseCase(documentTypeRepository)).isNotNull();
    }

    @Test
    void getRegisterUseCase() {
        assertThat(useCaseConfig.getRegisterUseCase(registerRepository)).isNotNull();
    }

    @Test
    void saveRegisterUseCase() {
        assertThat(useCaseConfig.saveRegisterUseCase(registerRepository)).isNotNull();
    }

    @Test
    void deleteRegisterUseCase() {
        assertThat(useCaseConfig.deleteRegisterUseCase(registerRepository)).isNotNull();
    }
}