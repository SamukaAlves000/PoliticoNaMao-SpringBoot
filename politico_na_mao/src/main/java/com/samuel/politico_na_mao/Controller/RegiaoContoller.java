package com.samuel.politico_na_mao.controller;

import java.util.ArrayList;
import java.util.List;

import com.samuel.politico_na_mao.dto.RegiaoRequestDto;
import com.samuel.politico_na_mao.model.Regiao;
import com.samuel.politico_na_mao.service.RegiaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * RegiaoContoller
 */
@RestController
@RequestMapping("regioes")
public class RegiaoContoller {
    
    @Autowired
    private final RegiaoService regiaoService;

    RegiaoContoller(RegiaoService regiaoService){
        this.regiaoService = regiaoService;
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
      
        Iterable<Regiao> list = regiaoService.findAllService();
        List<RegiaoRequestDto> RegiaoRequestDtos = new ArrayList<>();
        
        for (Regiao regiao :list) {

           RegiaoRequestDto RegiaoRequestDto = new RegiaoRequestDto();
           RegiaoRequestDtos.add(RegiaoRequestDto.convertToDto(regiao)); 

        }
        return new ResponseEntity<>(RegiaoRequestDtos,HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<?> update(){

        final String uri = "https://servicodados.ibge.gov.br/api/v1/localidades/regioes";
        RestTemplate restTemplate = new RestTemplate();
        RegiaoRequestDto[] response = restTemplate.postForObject(uri, null, RegiaoRequestDto[].class);

        for (RegiaoRequestDto RegiaoRequestDto : response) {
            regiaoService.saveService(RegiaoRequestDto.convertToEntity());
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}