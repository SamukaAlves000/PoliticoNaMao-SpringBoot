package com.samuel.politico_na_mao.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

/**
 * Estado
 */
@Data
@Entity
public class Estado {
    @Id
    @Column(name="idEstado")
    private Long id;
    @Column(name="siglaEstado",nullable = false,length = 2)
    private String sigla ;
    @Column(name="nomeEstado",nullable = false,length = 30)
    private String nome;
    @Transient
    private Regiao regiao;
}