package com.back.model;

import lombok.Builder;

@Builder(toBuilder = true)
public class DocumentType {
    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    private final Integer id;
    private final String description;
}
