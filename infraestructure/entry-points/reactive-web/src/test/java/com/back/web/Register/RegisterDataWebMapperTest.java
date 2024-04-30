package com.back.web.Register;

import com.back.model.Register;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RegisterDataWebMapperTest {
    @InjectMocks
    RegisterDataWebMapper mapper;


    @Test
    void getRegister() {
        assertThat(mapper.getRegister(RegisterData.builder().build())).isNotNull();
    }

    @Test
    void getRegisterData() {
        assertThat(mapper.getRegisterData(Register.builder().build())).isNotNull();
    }
}