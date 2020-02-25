package com.samuel.politico_na_mao.dto;

import com.samuel.politico_na_mao.model.Regiao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * RegiaoDto
 */
@Getter
@Setter
@ToString
public class RegiaoDto {

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

    public RegiaoDto convertToDto(Regiao entityRegiao){
        
        this.setId(entityRegiao.getId());
        this.setSigla(entityRegiao.getSigla());
        this.setNome(entityRegiao.getNome());
        
        return this;
    }
}