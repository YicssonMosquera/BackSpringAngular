package com.back.jpa.Sex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SexDataMapperTest {
    @InjectMocks
    SexDataMapper mapper;

    @Test
    void getSex() {
        assertThat(mapper.getSex(SexData.builder().build())).isNotNull();
    }
}