package com.back.web;

import com.back.model.Register;
import com.back.model.Sex;
import com.back.usecase.GetSexUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "api/crudJavaAngular")
@RequiredArgsConstructor
public class SexController {
    private final GetSexUseCase useCase;

    @GetMapping(path = "/sex")
    public Flux<Sex>getAllSex(){
        return useCase.getAllSex();
    }
}
