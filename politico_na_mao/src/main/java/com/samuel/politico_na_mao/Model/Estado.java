package com.samuel.politico_na_mao.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Estado
 */
@Getter @Setter @NoArgsConstructor // Adicionando Getters e Setters e um construtor Vazio
@AllArgsConstructor //Construtor com todos atributos definido na classe
public class Estado {

    private int idEstado;
    private String nomeEstado;
    private String siglaEstado;
}