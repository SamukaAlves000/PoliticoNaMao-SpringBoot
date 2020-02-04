package com.samuel.politico_na_mao.Controller;

import com.samuel.politico_na_mao.Model.Estado;
import com.samuel.politico_na_mao.Model.Pessoa;
import com.samuel.politico_na_mao.Model.PessoaFisica;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import com.samuel.politico_na_mao.Model.Cidade;
import com.samuel.politico_na_mao.Model.Deputado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * DeputadoController
 */
@RestController
@RequestMapping("deputados")
public class DeputadoController {
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> teste(){
        return new ResponseEntity<>("Hello Word!",HttpStatus.OK);
    }
}