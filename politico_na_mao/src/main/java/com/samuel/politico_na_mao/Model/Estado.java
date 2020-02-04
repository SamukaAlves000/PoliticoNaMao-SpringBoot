package com.samuel.politico_na_mao.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Estado
 */
@Getter @Setter @NoArgsConstructor // Adicionando Getters e Setters e um construtor Vazio

public class Estado {

    private int idEstado;
    private String nomeEstado;
    private String siglaEstado;

    public Estado(int idEstado,String nomeEstado,String siglaEstado){
        this.idEstado = idEstado;
        this.nomeEstado = nomeEstado;
        this.siglaEstado = siglaEstado;
    };

    

}