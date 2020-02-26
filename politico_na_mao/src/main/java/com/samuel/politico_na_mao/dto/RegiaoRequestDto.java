package com.samuel.politico_na_mao.dto;

import com.samuel.politico_na_mao.model.Regiao;

import lombok.Data;

/**
 * RegiaoRequestDto
 */
@Data
public class RegiaoRequestDto {

    private int id;
    private String sigla;
    private String nome;


    public Regiao convertToEntity(){

        Regiao regiaoEntity = new Regiao();
        regiaoEntity .setId(this.getId());
        regiaoEntity .setSigla(this.getSigla());
        regiaoEntity .setNome(this.getNome());

        return regiaoEntity;
    }

    public RegiaoRequestDto convertToDto(Regiao entityRegiao){
        
        this.setId(entityRegiao.getId());
        this.setSigla(entityRegiao.getSigla());
        this.setNome(entityRegiao.getNome());
        
        return this;
    }
}