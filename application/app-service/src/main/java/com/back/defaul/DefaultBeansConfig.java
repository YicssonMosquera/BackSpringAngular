package com.back.defaul;


import com.back.model.Register;
import com.back.model.gateway.DocumentTypeRepository;
import com.back.model.gateway.RegisterRepository;
import com.back.model.gateway.SexRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Configuration
public class DefaultBeansConfig {
    @Bean
    @ConditionalOnMissingBean
    public SexRepository sexRepository(){
        return sexRepository();
    }

    @Bean
    @ConditionalOnMissingBean
    DocumentTypeRepository documentTypeRepository(){
        return documentTypeRepository();
    }

    @Bean
    @ConditionalOnMissingBean
    public RegisterRepository registerRepository(){
        return registerRepository();
    }

    private final SexRepository sexRepository = () -> Flux.empty();

    private final DocumentTypeRepository documentTypeRepository = ()->Flux.empty();

    private final RegisterRepository registerRepository = new RegisterRepository() {
        @Override
        public Mono<Register> saveRegister(Register register) {
            return Mono.empty();
        }

        @Override
        public Flux<Register> getAllRegister() {
            return Flux.empty();
        }

        @Override
        public Mono<Register> getByIdRegister(Integer id) {
            return Mono.empty();
        }

        @Override
        public Mono<Void> DeleteRegister(Integer id) {
            return Mono.empty();
        }
    };
}
