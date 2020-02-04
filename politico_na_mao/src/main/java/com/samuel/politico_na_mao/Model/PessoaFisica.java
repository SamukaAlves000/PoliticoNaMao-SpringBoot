package com.samuel.politico_na_mao.Model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * PessoaFisica
 */
@Getter @Setter @NoArgsConstructor // Adicionando Getters e Setters e um construtor Vazio
@AllArgsConstructor
public class PessoaFisica extends Pessoa{
    
    private String siglaSexoPessoaFisica;
    private Date dataNascimentoPessoaFisica;
    private Date dataFalecimentoPessoaFisica;

    public PessoaFisica(int idPessoa, String nomePessoa,String emailPessoa, Cidade cidadePessoa,String siglaSexoPessoaFisica,Date dataNascimentoPessoaFisica,Date dataFalecimentoPessoaFisica){
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
        this.cidadePessoa = cidadePessoa;
        this.siglaSexoPessoaFisica = siglaSexoPessoaFisica;
        this.dataNascimentoPessoaFisica = dataNascimentoPessoaFisica;
        this.dataFalecimentoPessoaFisica = dataFalecimentoPessoaFisica;
    }
}