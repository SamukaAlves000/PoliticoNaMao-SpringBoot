package com.samuel.politico_na_mao.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.samuel.politico_na_mao.model.Estado;

import lombok.Data;

/**
 * EstadoResponseDto
 */
@Data
public class EstadoResponseDto {

    private int id;
    private String sigla;
    private String nome;
    @JsonProperty("Regiao")
    private RegiaoResponseDto regiaoResponseDto;

    public EstadoResponseDto convertToDto(Estado entityEstado){
        
        this.setId(entityEstado.getId());
        this.setSigla(entityEstado.getSigla());
        this.setNome(entityEstado.getNome());

        RegiaoResponseDto regiaoResponseDto = new RegiaoResponseDto();
        
        this.setRegiaoResponseDto(regiaoResponseDto.convertToDto(entityEstado.getRegiao()));
        
        return this;
    }
}