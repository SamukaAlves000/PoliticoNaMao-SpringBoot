package com.samuel.politico_na_mao.Repository;

import java.util.ArrayList;

import com.samuel.politico_na_mao.Model.Estado;

import org.springframework.stereotype.Repository;

/**
 * EsatdoRepository
 */
@Repository
public class EstadoRepository {

    static ArrayList<Estado> listaEstado = new ArrayList<>();

    static {
        for (int i = 0; i < 10 ; i++) {
            listaEstado.add(new Estado(i+1, "nomeEstado"+(i+1), "siglaEstado"+(i+1)));
        }
        
    }

    public ArrayList<Estado> getAll(){
        return listaEstado;
    }

    public Estado getById(int index){
        return listaEstado.get(index);
    }

    public Estado save(Estado estado){
        listaEstado.add(estado);
        return estado;
    }

    public boolean update(Estado estado){
        listaEstado.remove(estado.getIdEstado());
        listaEstado.add(estado);
        return true;
    }
    
    public boolean delete(int index){
        listaEstado.remove(index);
        return true;
    }


}