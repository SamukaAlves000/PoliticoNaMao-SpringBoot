package com.samuel.politico_na_mao.Repository;

import java.util.ArrayList;
import java.util.Date;

import com.samuel.politico_na_mao.Model.Cidade;
import com.samuel.politico_na_mao.Model.Deputado;
import com.samuel.politico_na_mao.Model.Estado;
import org.springframework.stereotype.Repository;

/**
 * DeputadoRepository
 */
@Repository
public class DeputadoRepository {
    
    static ArrayList<Deputado> lista = new ArrayList<>();

    static {
        for (int i = 0; i < 1000 ; i++) {
            Deputado deputado = new Deputado();
            deputado.setCidadePessoa(new Cidade(i+1, "nomeCidade:"+(i+1),new Estado(i+1, "nomeEstado:"+(i+1),"siglaEstado:"+(i+1))));
            deputado.setDataFalecimentoPessoaFisica(new Date());
            deputado.setDataNascimentoPessoaFisica(new Date());
            deputado.setEmailPessoa("emailPessoa:"+(i+1));
            deputado.setIdLegislaturaFinalDeputados(i+1);
            deputado.setIdLegislaturaInicialDeputados(i+3);
            deputado.setIdPessoa(i+1);
            deputado.setNomeDeputados("nomeDeputados:"+(i+1));
            deputado.setNomePessoa("nomePessoa:"+(i+1));
            deputado.setSiglaSexoPessoaFisica("siglaSexoPessoaFisica:"+(i+1));
            deputado.setUriDeputados("uriDeputados:"+(i+1));
            deputado.setUrlRedeSocialDeputados("urlRedeSocialDeputados:"+i+1);
            lista.add(deputado);
        }
        
    }

    public ArrayList<Deputado> getAll(){
        return lista;
    }

    public Deputado getById(int index){
        return lista.get(index);
    }

    public Deputado save(Deputado deputado){
        lista.add(deputado);
        return deputado;
    }

    public boolean update(Deputado deputado){
        lista.remove(deputado.getIdPessoa());
        lista.add(deputado);
        return true;
    }
    
    public boolean delete(int index){
        lista.remove(index);
        return true;
    }
    
}