package com.back.web.Register;

import com.back.model.Register;
import com.back.usecase.DeleteRegisterUseCase;
import com.back.usecase.GetRegisterUseCase;
import com.back.usecase.SaveRegisterUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.sql.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RegisterControllerTest {
    @InjectMocks
    RegisterController registerController;
    @Mock
    GetRegisterUseCase getRegisterUseCase;
    @Mock
    SaveRegisterUseCase saveRegisterUseCase;
    @Mock
    DeleteRegisterUseCase deleteRegisterUseCase;
    @Mock
    RegisterDataWebMapper mapper;
    RegisterData registerData = RegisterData.builder()
            .firs_name("prueba").middle_name("test").surname("test").second_surname("test").address("test").email("test")
            .birthdate(Date.valueOf("1998-05-05")).sex(1).documentType(2).document(2).build();

    Register register = Register.builder()
            .firs_name("prueba").middle_name("test").surname("test").second_surname("test").address("test").email("test")
            .birthdate(Date.valueOf("1998-05-05")).sex(1).documentType(2).document(2).build();
    @Test
    void saveRegister() {
        ResponseEntity responseEntity = ResponseEntity.ok().build();
        Mockito.when(saveRegisterUseCase.save(Mockito.any())).thenReturn(Mono.just(register));
        assertThat(registerController.saveRegister(registerData).getStatusCode()).isEqualTo(responseEntity.getStatusCode());
        assertThat(registerController.saveRegister(registerData).getBody()).isEqualTo("Registro guardado con exito");


    }

    @Test
    void getAllRegister() {
        Mockito.when(getRegisterUseCase.getAllRegister()).thenReturn(Flux.just(register));
        Mockito.when(mapper.getRegisterData(register)).thenReturn(registerData);
        StepVerifier.create(registerController.getAllRegister())
                .assertNext(Assertions::assertNotNull).verifyComplete();
    }

    @Test
    void getOneRegister() {
        Mockito.when(getRegisterUseCase.getOneRegister(Mockito.any())).thenReturn(Mono.just(register));
        Mockito.when(mapper.getRegisterData(register)).thenReturn(registerData);
        StepVerifier.create(registerController.getOneRegister(Mockito.any()))
                .assertNext(Assertions::assertNotNull).verifyComplete();
    }

    @Test
    void deleteRegister() {
        Mockito.when(deleteRegisterUseCase.delete(Mockito.any())).thenReturn(Mono.empty());
        StepVerifier.create(registerController.deleteRegister(Mockito.any())).verifyComplete();
    }
}