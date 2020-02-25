package com.samuel.politico_na_mao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

/**
 * Cidade
 */
@Data
@Entity
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCidade")
    private Long id;
    @Column(name="nomeCidade",nullable = false,length = 50)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "estado_id",nullable = false)
    private Estado estado;
    
}