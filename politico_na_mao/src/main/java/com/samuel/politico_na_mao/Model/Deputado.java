package com.samuel.politico_na_mao.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Deputados
 */
@Getter @Setter @NoArgsConstructor // Adicionando Getters e Setters e um construtor Vazio
public class Deputado extends PessoaFisica{

    String uriDeputados;
    String nomeDeputados;
    int idLegislaturaInicialDeputados;
    int idLegislaturaFinalDeputados;
    String urlRedeSocialDeputados;
    String urlWebsiteDeputados;

}