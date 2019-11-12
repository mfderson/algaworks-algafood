package com.algaworks.algafood.domain.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Cozinha {

    @Id
    private Long id;

    @Column(length = 30)
    private String nome;
}
