package com.samuel.politico_na_mao.dto;

import com.samuel.politico_na_mao.model.Cidade;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * CidadeRequestDto
 */
@Getter
@Setter
@ToString
public class CidadeRequestDto {

    private Long id;
    private String nome;
    private MicrorregiaoRequestDto microrregiao;


    public Cidade convertToEntity(){

        Cidade ciadadeEntity = new Cidade();
        ciadadeEntity.setId(this.getId());
        ciadadeEntity .setNome(this.getNome());
        ciadadeEntity.setEstado(this.getMicrorregiao().getMesorregiao().getUF().convertToEntity());

        return ciadadeEntity;
    } 
    
}