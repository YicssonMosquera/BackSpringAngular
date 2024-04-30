package com.back.web.Register;

import com.back.usecase.DeleteRegisterUseCase;
import com.back.usecase.GetRegisterUseCase;
import com.back.usecase.SaveRegisterUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping(value = "api/crudJavaAngular/register")
public class RegisterController {
    private final SaveRegisterUseCase saveRegisterUseCase;
    private final GetRegisterUseCase getRegisterUseCase;
    private final DeleteRegisterUseCase deleteRegisterUseCase;
    private final RegisterDataWebMapper mapper;

    @PostMapping(path = "/save")
    public ResponseEntity<?>saveRegister(@RequestBody RegisterData registerData){

        Mono.just(saveRegisterUseCase.save(mapper.getRegister(registerData)));

        return new ResponseEntity("Registro guardado con exito", HttpStatus.OK);
    }

    @GetMapping(path = "/getAll")
    public Flux<RegisterData>getAllRegister(){
        return getRegisterUseCase.getAllRegister().map(mapper::getRegisterData);
    }

    @GetMapping(path = "/getOne/{id}")
    public Mono<RegisterData>getOneRegister(@PathVariable Integer id){
        return getRegisterUseCase.getOneRegister(id).map(mapper::getRegisterData);
    }

    @DeleteMapping(path = "/delete{id}")
    public Mono<Void>deleteRegister(@PathVariable Integer id){
        return deleteRegisterUseCase.delete(id);
    }
}
