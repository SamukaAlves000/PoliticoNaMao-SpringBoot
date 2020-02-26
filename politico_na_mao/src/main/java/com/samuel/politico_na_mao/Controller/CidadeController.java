package com.samuel.politico_na_mao.controller;

import java.util.ArrayList;
import java.util.List;

import com.samuel.politico_na_mao.dto.CidadeRequestDto;
import com.samuel.politico_na_mao.dto.CidadeResponseDto;
import com.samuel.politico_na_mao.model.Cidade;
import com.samuel.politico_na_mao.service.CidadeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * CidadeController
 */
@RestController
@RequestMapping("cidades")
public class CidadeController {

    private final CidadeService cidadeService;
    CidadeController(CidadeService cidadeService){
        this.cidadeService = cidadeService;
    }

    @GetMapping
    public ResponseEntity<?> getAll(){ 
        
        Iterable<Cidade> list = cidadeService.findAllService();
        List<CidadeResponseDto> cidadeResponseDtos = new ArrayList<>();
        
        for (Cidade cidade :list) {
            
           CidadeResponseDto cidadeResponseDto = new CidadeResponseDto();
           cidadeResponseDtos.add(cidadeResponseDto.convertToDto(cidade));  
        }
        
        return new ResponseEntity<>(cidadeResponseDtos,HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<?> update() {
        RestTemplate restTemplate = new RestTemplate();
        String path = "http://servicodados.ibge.gov.br/api/v1/localidades/estados/52/municipios";
        CidadeRequestDto response[] = restTemplate.postForObject(path, null, CidadeRequestDto[].class);
        for (CidadeRequestDto CidadeRequestDto : response) {
             cidadeService.saveService(CidadeRequestDto.convertToEntity());
            
        }
        
        return new ResponseEntity<>(HttpStatus.OK);
    }
}