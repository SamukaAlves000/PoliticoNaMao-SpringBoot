package com.samuel.politico_na_mao.Controller;

import com.samuel.politico_na_mao.Model.Legislatura;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LegislaturaController
 */
@RestController
@RequestMapping("legislaturas")
public class LegislaturaController {

    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>("GET",HttpStatus.OK);
    }
    
    @GetMapping("/{index}")
    public ResponseEntity<?> getById(@PathVariable int index){
        return new ResponseEntity<>("GETById",HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Legislatura legislatura) {
        return new ResponseEntity<>("POST",HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Legislatura legislatura){
        return new ResponseEntity<>("PUT",HttpStatus.OK);
    }

    @DeleteMapping("/{index}")
    public ResponseEntity<?> delete(@PathVariable int index){
        return new ResponseEntity<>("DELETE",HttpStatus.OK);
    }
}