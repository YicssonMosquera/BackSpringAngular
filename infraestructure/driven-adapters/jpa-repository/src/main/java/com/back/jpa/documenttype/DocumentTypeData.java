package com.back.jpa.documenttype;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbltipodocumento")
public class DocumentTypeData {

    @Column(name = "Id")
    @Id
    private Integer id;
    @Column(name = "Descripcion")
    private String Description;
}
