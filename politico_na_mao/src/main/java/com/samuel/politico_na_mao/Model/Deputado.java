package com.samuel.politico_na_mao.Model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Deputados
 */
@Getter @Setter @NoArgsConstructor // Adicionando Getters e Setters e um construtor Vazio
@AllArgsConstructor //Construtor com todos atributos definido na classe
public class Deputado extends PessoaFisica{

    private String uriDeputados;
    private String nomeDeputados;
    private int idLegislaturaInicialDeputados;
    private int idLegislaturaFinalDeputados;
    private String urlRedeSocialDeputados;
    private String urlWebsiteDeputados;

    
    public Deputado(int idPessoa, String nomePessoa,String emailPessoa,Cidade cidadePessoa,String siglaSexoPessoaFisica, Date dataNascimentoPessoaFisica, Date dataFalecimentoPessoaFisica,String uriDeputados, String nomeDeputados, int idLegislaturaInicialDeputados,int idLegislaturaFinalDeputados, String urlRedeSocialDeputados,String urlWebsiteDeputados){
        super(idPessoa, nomePessoa, emailPessoa, cidadePessoa, siglaSexoPessoaFisica, dataNascimentoPessoaFisica, dataFalecimentoPessoaFisica);
        this.uriDeputados = uriDeputados;
        this.nomeDeputados = nomeDeputados;
        this.idLegislaturaInicialDeputados = idLegislaturaInicialDeputados;
        this.idLegislaturaFinalDeputados = idLegislaturaFinalDeputados;
        this.urlRedeSocialDeputados = urlRedeSocialDeputados;
        this.urlWebsiteDeputados = urlWebsiteDeputados;
    }
}