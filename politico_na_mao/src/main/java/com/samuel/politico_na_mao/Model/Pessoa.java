package com.samuel.politico_na_mao.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Pessoa
 */
@Getter @Setter @NoArgsConstructor // Adicionando Getters e Setters e um construtor Vazio
public class Pessoa {

    int idPessoa;
    String nomePessoa;
    String emailPessoa;
    Cidade cidadePessoa;

    public Pessoa(int idPessoa, String nomePessoa,String emailPessoa,Cidade cidadePessoa){
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
        this.cidadePessoa = cidadePessoa;
    }
    
    public int getIdPessoa(){
        return this.idPessoa;
    }
    
    public void setIdPessoa(int idPessoa){
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa(){
        return this.nomePessoa;
    }
    
    public void setnomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa;
    }

    public String getEmailPessoa(){
        return this.emailPessoa;
    }
    
    public void setEmailPessoa(String emailPessoa){
        this.emailPessoa = emailPessoa;
    }

    public Cidade getCidadePessoa(){
        return this.cidadePessoa;
    }
    
    public void setcidadePessoa(Cidade cidadePessoa){
        this.cidadePessoa = cidadePessoa;
    }
    
}