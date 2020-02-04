package com.samuel.politico_na_mao.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Cidade
 */

@Getter @Setter @NoArgsConstructor // Adicionando Getters e Setters e um construtor Vazio
public class Cidade {

    private int idCidade;
    private String nomeCidade;
    private Estado estadoCidade;

    public Cidade(int idCidade,String nomeCidade,Estado estadoCidade){
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
        this.estadoCidade = estadoCidade;
    };

}