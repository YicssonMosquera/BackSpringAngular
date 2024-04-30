package com.back.jpa.Register;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "tblregistro")
public class RegisterData {
    @Id
    @Column(name = "Identificacion")
    private  Integer document;
    @Column(name = "primer_nombre")
    private  String firs_name;
    @Column(name = "segundo_nombre")
    private  String middle_name;
    @Column(name = "primer_apellido")
    private  String surname;
    @Column(name = "segundo_apellido")
    private  String second_surname;
    @Column(name = "Direccion")
    private  String address;
    @Column(name = "correo")
    private  String email;
    @Column(name = "fecha_nacimiento")
    private Date birthdate;
    @Column(name = "Sexo")
    private  Integer sex;
    @Column(name = "tipo_documento")
    private  Integer documentType;
}
