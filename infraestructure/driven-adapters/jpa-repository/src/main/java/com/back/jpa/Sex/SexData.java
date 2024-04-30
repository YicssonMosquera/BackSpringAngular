package com.back.jpa.Sex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Table(name = "tblsexo")
public class SexData {
    @Column(name = "Id")
    @Id
    private Integer id;
    @Column(name = "Descripcion")
    private String description;
}
