package com.back.jpa.Register;

import com.back.model.Register;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RegisterDataAdapterTest {
    @InjectMocks
    RegisterDataAdapter adapter;
    @Mock
    RegisterDataRepository repository;
    @Mock
    RegisterDataMapper mapper;

    @Test
    void saveRegister() {
        Mockito.when(mapper.getRegisterData(Mockito.any(Register.class))).thenReturn(new RegisterData());
        Mockito.when(mapper.getRegister(Mockito.any(RegisterData.class))).thenReturn(Register.builder().build());
        Mockito.when(repository.save(Mockito.any())).thenReturn(RegisterData.builder().build());
        StepVerifier.create(adapter.saveRegister(Register.builder().build()))
                .assertNext(Assertions::assertNotNull).verifyComplete();

    }

    @Test
    void getAllRegister() {
        List<RegisterData> registerData = new ArrayList<>();
        Mockito.when(repository.findAll()).thenReturn(registerData);
        StepVerifier.create(adapter.getAllRegister()).verifyComplete();
    }

    @Test
    void getByIdRegister() {
        Mockito.when(repository.findById(Mockito.any())).thenReturn(Optional.of(RegisterData.builder().build()));
        StepVerifier.create(adapter.getByIdRegister(Mockito.any()))
                .assertNext(Assertions::assertNotNull).verifyComplete();
    }

    @Test
    void deleteRegister() {

        StepVerifier.create(adapter.DeleteRegister(Mockito.any())).verifyComplete();
    }
}