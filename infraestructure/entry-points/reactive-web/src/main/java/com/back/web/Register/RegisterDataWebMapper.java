package com.back.web.Register;

import com.back.model.Register;
import org.springframework.stereotype.Component;

@Component
public class RegisterDataWebMapper {

    public Register getRegister(RegisterData registerData){
        return Register.builder()
                .document(registerData.getDocument())
                .firs_name(registerData.getFirs_name())
                .middle_name(registerData.getMiddle_name())
                .surname(registerData.getSurname())
                .second_surname(registerData.getSecond_surname())
                .address(registerData.getAddress())
                .email(registerData.getEmail())
                .birthdate(registerData.getBirthdate())
                .sex(registerData.getSex())
                .documentType(registerData.getDocumentType()).build();
    }

    public RegisterData getRegisterData(Register register){
        return RegisterData.builder()
                .document(register.getDocument())
                .firs_name(register.getFirs_name())
                .middle_name(register.getMiddle_name())
                .surname(register.getSurname())
                .second_surname(register.getSecond_surname())
                .address(register.getAddress())
                .email(register.getEmail())
                .birthdate(register.getBirthdate())
                .sex(register.getSex())
                .documentType(register.getDocumentType()).build();
    }
}
