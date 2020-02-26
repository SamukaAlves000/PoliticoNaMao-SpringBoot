package com.samuel.politico_na_mao.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * MicrorregiaoRequestDto
 */
@Getter
@Setter
@ToString
public class MicrorregiaoRequestDto {
    private int id;
    private String nome;
    private MesorregiaoRequestDto mesorregiao;
    
}