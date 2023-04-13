package com.sistema_academia.academia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema_academia.academia.entities.Maquina;
import com.sistema_academia.academia.repositories.MaquinaRepository;


@Service
public class MaquinaServico {


    @Autowired
    private MaquinaRepository repositorioMaquina;


    public Maquina cadastrar(Maquina maquina){
        return repositorioMaquina.save(maquina);
    }

    public List<Maquina> findAll(){
        List<Maquina> produtos = repositorioMaquina.findAll();
        return produtos; 
    }

    public Maquina findById(Long id) {
        Maquina result = repositorioMaquina.findById(id).get();
        return result;
    }
    public Maquina desativarMaquina(Long id) {
        Optional<Maquina> optionalMaquina = repositorioMaquina.findById(id);
        if (optionalMaquina.isPresent()) {
            Maquina maquina = optionalMaquina.get();
            maquina.setEstado_maquina("desativada");
            return repositorioMaquina.save(maquina);
        }
        return optionalMaquina.get();
    }

    public List<Maquina> CadastrarVariasMaquinas(List<Maquina> maquinas){
       return repositorioMaquina.saveAll(maquinas);
    }


}
