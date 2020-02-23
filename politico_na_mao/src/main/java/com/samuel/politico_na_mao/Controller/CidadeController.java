package com.samuel.politico_na_mao.Controller;

import com.samuel.politico_na_mao.Repository.CidadeRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CidadeController
 */
@RestController
@RequestMapping("cidades")
public class CidadeController {

    private final CidadeRepository cidadeRepository;
    CidadeController(CidadeRepository cidadeRepository){
        this.cidadeRepository = cidadeRepository;
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(cidadeRepository.findAll(),HttpStatus.OK);
    }
    
}