package com.back.jpa.Sex;

import com.back.model.Sex;
import org.springframework.stereotype.Component;

@Component
public class SexDataMapper {

    public Sex getSex(SexData sexData){
        return Sex.builder()
                .id(sexData.getId())
                .description(sexData.getDescription()).build();
    }
}
