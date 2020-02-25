package com.samuel.politico_na_mao.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * MicrorregiaoDto
 */
@Getter
@Setter
@ToString
public class MicrorregiaoDto {
    private int id;
    private String nome;
    private MesorregiaoDto mesorregiao;
    
}