package com.samuel.politico_na_mao.Model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * PessoaFisica
 */
@Getter @Setter @NoArgsConstructor // Adicionando Getters e Setters e um construtor Vazio
public class PessoaFisica extends Pessoa{
    String siglaSexoPessoaFisica;
    Date dataNascimentoPessoaFisica;
    Date dataFalecimentoPessoaFisica;
    
}