package com.samuel.politico_na_mao.Model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Legislatura
 */
@Getter @Setter @NoArgsConstructor // Adicionando Getters e Setters e um construtor Vazio
@AllArgsConstructor //Construtor com todos atributos definido na classe
public class Legislatura {

    private int idLegislatura;
    private  String uriLegislatura;
    private  Date dataInicioLegislatura;
    private  Date dataFimLegislatura;
    private  int anoEleicaoLegislatura;
    
}