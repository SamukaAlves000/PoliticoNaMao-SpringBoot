package com.samuel.politico_na_mao.Controller;

import com.samuel.politico_na_mao.Model.Estado;
import com.samuel.politico_na_mao.Repository.EstadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 * EstadoController
 */
@RestController
@RequestMapping("estados")
public class EstadoController {
    
    @Autowired
    EstadoRepository estadoRepository;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(estadoRepository.getAll(),HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET,path = "/{index}")
    public ResponseEntity<?> getById(@PathVariable("index") int index){
        return new ResponseEntity<>(estadoRepository.getById(index),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Estado estado){
        return new ResponseEntity<>(estadoRepository.save(estado),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Estado estado){
        return new ResponseEntity<>(estadoRepository.update(estado),HttpStatus.OK);
    }
   
    @DeleteMapping("/{index}")
    public ResponseEntity<?> delete(@PathVariable("index") int index){
        return new ResponseEntity<>(estadoRepository.delete(index),HttpStatus.OK);
    }

}