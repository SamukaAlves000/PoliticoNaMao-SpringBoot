package com.samuel.politico_na_mao.Controller;

import com.samuel.politico_na_mao.Model.Deputado;
import com.samuel.politico_na_mao.Repository.DeputadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DeputadoController
 */
@RestController
@RequestMapping("deputados")
public class DeputadoController {

    @Autowired
    DeputadoRepository deputatoRepository;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(deputatoRepository.getAll(),HttpStatus.OK);
    }

    @GetMapping("/{index}")
    public ResponseEntity<?> getById(@PathVariable int index){
        return new ResponseEntity<>(deputatoRepository.getById(index),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Deputado deputado){
        return new ResponseEntity<>(deputatoRepository.save(deputado),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Deputado deputado){
        return new ResponseEntity<>(deputatoRepository.update(deputado),HttpStatus.OK);
    }
}