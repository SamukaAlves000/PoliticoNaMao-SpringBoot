package com.samuel.politico_na_mao.Controller;

import com.samuel.politico_na_mao.Repository.RegiaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RegiaoContoller
 */
@RestController
@RequestMapping("regioes")
public class RegiaoContoller {
    
    @Autowired
    private final RegiaoRepository regiaoRepository;

    RegiaoContoller(RegiaoRepository regiaoRepository){
        this.regiaoRepository = regiaoRepository;
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(regiaoRepository.findAll(),HttpStatus.OK);
    }
    
}