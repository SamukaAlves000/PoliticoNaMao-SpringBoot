package com.samuel.politico_na_mao.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.samuel.politico_na_mao.model.Estado;

import lombok.Data;

/**
 * EstadoRequestDto
 */
@Data
public class EstadoRequestDto {

    private int id;
    private String sigla;
    private String nome;
    @JsonProperty("regiao")
    private RegiaoRequestDto RegiaoRequestDto;

    public Estado convertToEntity(){

        Estado entityEstado = new Estado();
        entityEstado.setId(this.getId());
        entityEstado.setSigla(this.getSigla());
        entityEstado.setNome(this.getNome());

        entityEstado.setRegiao(RegiaoRequestDto.convertToEntity());

        return entityEstado;
    }
    
}