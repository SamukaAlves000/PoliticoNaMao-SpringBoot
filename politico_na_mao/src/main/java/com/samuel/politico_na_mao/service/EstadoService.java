package com.samuel.politico_na_mao.service;

import com.samuel.politico_na_mao.model.Estado;
import com.samuel.politico_na_mao.repository.EstadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * EstadoService
 */
@Service
public class EstadoService {

    private final EstadoRepository estadoRepository;
    @Autowired
    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    public Estado saveService(Estado estado) {
        return estadoRepository.save(estado);
    }

    public Iterable<Estado> findAllService(){
        return estadoRepository.findAll();
    }
}