package com.samuel.politico_na_mao.Controller;

import com.samuel.politico_na_mao.Repository.EstadoRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EstadoController
 */
@RestController
@RequestMapping("estados")
public class EstadoController {

    private final EstadoRepository  estadoRepository;

    EstadoController(EstadoRepository regiaoRepository){
        this.estadoRepository = regiaoRepository;
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(estadoRepository.findAll(),HttpStatus.OK);
    }
    
}