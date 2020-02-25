package com.samuel.politico_na_mao.dto;

import com.samuel.politico_na_mao.model.Cidade;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * MunicipioDto
 */
@Getter
@Setter
@ToString
public class MunicipioDto {

    private Long id;
    private String nome;
    private MicrorregiaoDto microrregiao;


    public Cidade convertToEntity(){

        Cidade ciadadeEntity = new Cidade();
        ciadadeEntity.setId(this.getId());
        ciadadeEntity .setNome(this.getNome());
        ciadadeEntity.setEstado(this.getMicrorregiao().getMesorregiao().getUF().convertToEntity());

        return ciadadeEntity;
    }

    public MunicipioDto convertToDto(Cidade entityCidade){
        
        this.setId(entityCidade.getId());
        this.setNome(entityCidade.getNome());
        return this;
    }
    
}