package com.samuel.politico_na_mao.service;

import com.samuel.politico_na_mao.model.Regiao;
import com.samuel.politico_na_mao.repository.RegiaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RegiaoService
 */
@Service
public class RegiaoService {

    private final RegiaoRepository regiaoRepository;
    @Autowired
    public RegiaoService(RegiaoRepository regiaoRepository) {
        this.regiaoRepository = regiaoRepository;
    }

    public Regiao saveService(Regiao regiao) {
        return regiaoRepository.save(regiao);
    }

    public Iterable<Regiao> findAllService(){
        return regiaoRepository.findAll();
    }
}