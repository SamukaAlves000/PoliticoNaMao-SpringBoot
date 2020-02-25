package com.samuel.politico_na_mao.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.samuel.politico_na_mao.model.Estado;

import lombok.Data;

/**
 * UfDto
 */
@Data
public class UfDto {

    private int id;
    private String sigla;
    private String nome;
    @JsonProperty("regiao")
    private RegiaoDto regiaoDto;

    public Estado convertToEntity(){

        Estado entityEstado = new Estado();
        entityEstado.setId(this.getId());
        entityEstado.setSigla(this.getSigla());
        entityEstado.setNome(this.getNome());

        entityEstado.setRegiao(regiaoDto.convertToEntity());

        return entityEstado;
    }

    public UfDto convertToDto(Estado entityEstado){
        
        this.setId(entityEstado.getId());
        this.setSigla(entityEstado.getSigla());
        this.setNome(entityEstado.getNome());

        RegiaoDto regiaoDto = new RegiaoDto();

        this.setRegiaoDto(regiaoDto.convertToDto(entityEstado.getRegiao()));

        return this;
    }
    
}