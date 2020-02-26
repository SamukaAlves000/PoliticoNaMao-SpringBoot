package com.samuel.politico_na_mao.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.samuel.politico_na_mao.model.Cidade;

import lombok.Data;

/**
 * CidadeResponseDto
 */
@Data
public class CidadeResponseDto {
 
   
    private Long id;
    private String nome;
    @JsonProperty("Estado")
    private EstadoResponseDto estadoResponseDto;

    public CidadeResponseDto convertToDto(Cidade entityCidade){
        
        this.setId(entityCidade.getId());
        this.setNome(entityCidade.getNome());
        EstadoResponseDto estadoResponseDto = new EstadoResponseDto();
        this.setEstadoResponseDto(estadoResponseDto.convertToDto(entityCidade.getEstado()));
        return this;
    }
    
}