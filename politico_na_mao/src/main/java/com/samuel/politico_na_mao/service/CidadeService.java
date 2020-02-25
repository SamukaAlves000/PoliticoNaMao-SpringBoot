package com.samuel.politico_na_mao.service;

import com.samuel.politico_na_mao.model.Cidade;
import com.samuel.politico_na_mao.repository.CidadeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CidadeService
 */
@Service
public class CidadeService {

    private final CidadeRepository cidadeRepository;
    @Autowired
    public CidadeService(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    public Cidade saveService(Cidade estado) {
        return cidadeRepository.save(estado);
    }

    public Iterable<Cidade> findAllService(){
        return cidadeRepository.findAll();
    }
    
}