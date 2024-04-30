package com.back.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder(toBuilder = true)
public class Register {
    public Integer getDocument() {
        return document;
    }

    public String getFirs_name() {
        return firs_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecond_surname() {
        return second_surname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Integer getSex() {
        return sex;
    }

    public Integer getDocumentType() {
        return documentType;
    }

    private final Integer document;
    private final String firs_name;
    private final String middle_name;
    private final String surname;
    private final String second_surname;
    private final String address;
    private final String email;
    private final Date birthdate;
    private final Integer sex;
    private final Integer documentType;



}
