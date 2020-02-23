package com.samuel.politico_na_mao.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 * Regiao
 */
@Data
@Entity
public class Regiao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idRegiao")
    private Long id;
    @Column(name="siglaRegiao",nullable = false,length = 2)
    private String sigla ;
    @Column(name="nomeRegiao",nullable = false,length = 15)
    private String nome;
    
}