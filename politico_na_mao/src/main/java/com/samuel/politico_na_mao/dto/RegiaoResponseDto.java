package com.samuel.politico_na_mao.dto;

import com.samuel.politico_na_mao.model.Regiao;

import lombok.Data;

/**
 * RegiaoResponseDto
 */
@Data
public class RegiaoResponseDto {

    private int id;
    private String sigla;
    private String nome;


    public RegiaoResponseDto convertToDto(Regiao entityRegiao){
        
        this.setId(entityRegiao.getId());
        this.setSigla(entityRegiao.getSigla());
        this.setNome(entityRegiao.getNome());
        
        return this;
    }
}