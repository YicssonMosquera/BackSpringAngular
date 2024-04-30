package com.back.web.Register;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterData implements Serializable {


    @JsonProperty("Identificacion")
    private  Integer document;
    @JsonProperty("PrimerNombre")
    private  String firs_name;
    @JsonProperty("segundoNombre")
    private  String middle_name;
    @JsonProperty("PrimerApellido")
    private  String surname;
    @JsonProperty("SegundoApellido")
    private  String second_surname;
    @JsonProperty("Direccion")
    private  String address;
    @JsonProperty("correo")
    private  String email;
    @JsonProperty("FechaNacimiento")
    private Date birthdate;
    @JsonProperty("Sexo")
    private  Integer sex;
    @JsonProperty("TipoDocumento")
    private  Integer documentType;
}
