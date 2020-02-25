package com.samuel.politico_na_mao.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * Estado
 */
@Data
@Entity
public class Estado {
    @Id
    @Column(name="idEstado")
    private int id;
    @Column(name="siglaEstado",nullable = false,length = 2)
    private String sigla ;
    @Column(name="nomeEstado",nullable = false,length = 30)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "regiao_id",nullable = false)
    private Regiao regiao;
    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private Set<Cidade> books;
    
}