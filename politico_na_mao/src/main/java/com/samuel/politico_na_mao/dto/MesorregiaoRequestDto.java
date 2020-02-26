package com.samuel.politico_na_mao.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * MesorregiaoRequestDto
 */
@Getter
@Setter
@ToString
public class MesorregiaoRequestDto {
    
    private int id;
    private String nome;
    @JsonProperty("UF")
    private EstadoRequestDto uF;
}