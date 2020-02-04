package com.samuel.politico_na_mao.Model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Legislatura
 */
@Getter @Setter @NoArgsConstructor // Adicionando Getters e Setters e um construtor Vazio
public class Legislatura {

    private int idLegislatura;
    private  String uriLegislatura;
    private  Date dataInicioLegislatura;
    private  Date dataFimLegislatura;
    private  int anoEleicaoLegislatura;

    public Legislatura(int idLegislatura,String uriLegislatura,Date dataInicioLegislatura,Date dataFimLegislatura,int anoEleicaoLegislatura){
        this.idLegislatura = idLegislatura;
        this.uriLegislatura = uriLegislatura;
        this.dataInicioLegislatura = dataInicioLegislatura;
        this.dataFimLegislatura = dataFimLegislatura;
        this.anoEleicaoLegislatura = anoEleicaoLegislatura;
    }
    
}