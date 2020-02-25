package com.samuel.politico_na_mao.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
    private int id;
    @Column(name="siglaRegiao",nullable = false,length = 2)
    private String sigla ;
    @Column(name="nomeRegiao",nullable = false,length = 15)
    private String nome;
    @OneToMany(mappedBy = "regiao", cascade = CascadeType.ALL)
    private Set<Estado> books;
    
}