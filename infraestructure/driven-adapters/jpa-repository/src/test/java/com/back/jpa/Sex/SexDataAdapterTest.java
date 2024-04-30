package com.back.jpa.Sex;

import com.back.model.Sex;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
class SexDataAdapterTest {
    @InjectMocks
    SexDataAdapter sexDataAdapter;

    @Mock
    SexDataRepository repository;

    @Mock
    SexDataMapper mapper;



    @Test
    void getAllSex() {
        List<SexData>sexData = new ArrayList<>();
        Mockito.when(repository.findAll()).thenReturn(sexData);
        StepVerifier.create(sexDataAdapter.getAllSex()).verifyComplete();
    }
}