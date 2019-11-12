package com.algaworks.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@EqualsAndHashCode(of = {"id"})
public class Cozinha {

    @Id
    @Getter
    private Long id;

    @Column
    @Getter @Setter
    private String nome;
}
