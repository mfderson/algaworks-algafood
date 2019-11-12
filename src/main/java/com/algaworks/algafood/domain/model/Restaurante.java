package com.algaworks.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@EqualsAndHashCode(of = {"id"})
public class Restaurante {

    @Id
    @Getter
    private Long id;

    @Column
    @Getter @Setter
    private String nome;

    @Column
    @Getter @Setter
    private BigDecimal taxaFrete;
}
