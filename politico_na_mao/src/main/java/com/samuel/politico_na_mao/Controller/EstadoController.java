package com.samuel.politico_na_mao.controller;

import java.util.ArrayList;
import java.util.List;

import com.samuel.politico_na_mao.dto.UfDto;
import com.samuel.politico_na_mao.model.Estado;
import com.samuel.politico_na_mao.service.EstadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * EstadoController
 */
@RestController
@RequestMapping("estados")
public class EstadoController {

    private final EstadoService estadoService;

    @Autowired
    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping
    public ResponseEntity<?> getAll() {

        Iterable<Estado> list = estadoService.findAllService();
        List<UfDto> UfDtos = new ArrayList<>();
        
        for (Estado estado :list) {
            
           UfDto ufDto = new UfDto();
           UfDtos.add(ufDto.convertToDto(estado));  
        }
        
        return new ResponseEntity<>(UfDtos,HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<?> update(){

        final String uri = "https://servicodados.ibge.gov.br/api/v1/localidades/estados";
        RestTemplate restTemplate = new RestTemplate();
        UfDto[] response = restTemplate.postForObject(uri, null, UfDto[].class);

        for (UfDto ufDto : response) {
            estadoService.saveService(ufDto.convertToEntity());
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}