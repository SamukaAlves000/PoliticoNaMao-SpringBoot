package com.samuel.politico_na_mao.Model;

import lombok.Getter;
import lombok.Setter;

/**
 * Pessoa
 */
@Getter @Setter

public abstract class Pessoa {
    
    int idPessoa;
    String nomePessoa;
    String emailPessoa;
    Cidade cidadePessoa;
       
}