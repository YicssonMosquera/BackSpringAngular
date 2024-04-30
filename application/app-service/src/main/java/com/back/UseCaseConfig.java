package com.back;

import com.back.model.gateway.DocumentTypeRepository;
import com.back.model.gateway.RegisterRepository;
import com.back.model.gateway.SexRepository;
import com.back.usecase.DeleteRegisterUseCase;
import com.back.usecase.GetDocumentTypeUseCase;
import com.back.usecase.GetRegisterUseCase;
import com.back.usecase.GetSexUseCase;
import com.back.usecase.SaveRegisterUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public GetSexUseCase getSexUseCase(SexRepository repository){
        return new GetSexUseCase(repository);
    }

    @Bean
    public GetDocumentTypeUseCase getDocumentTypeUseCase(DocumentTypeRepository documentTypeRepository){
        return new GetDocumentTypeUseCase(documentTypeRepository);
    }

    @Bean
    public GetRegisterUseCase getRegisterUseCase(RegisterRepository repository){
        return new GetRegisterUseCase(repository);
    }

    @Bean
    public SaveRegisterUseCase saveRegisterUseCase(RegisterRepository repository){
        return new SaveRegisterUseCase(repository);
    }

    @Bean
    public DeleteRegisterUseCase deleteRegisterUseCase(RegisterRepository repository){
        return new DeleteRegisterUseCase((repository));
    }

}
