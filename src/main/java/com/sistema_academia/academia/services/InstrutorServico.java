package com.sistema_academia.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema_academia.academia.entities.EnderecoInstrutor;
import com.sistema_academia.academia.entities.Instrutor;
import com.sistema_academia.academia.repositories.EnderecoInstrutorRepository;
import com.sistema_academia.academia.repositories.InstrutorRepository;

@Service
public class InstrutorServico {
    @Autowired
    private InstrutorRepository instrutorRepository;
    @Autowired
    private EnderecoInstrutorRepository enderecoInstrutorRepository;

    public Instrutor cadastrarModificar(Instrutor instrutor){
        return instrutorRepository.save(instrutor);
    }

    public List<Instrutor> findAll(){
       return instrutorRepository.findAll();
    }

    public Instrutor findById(Long id) {
        return instrutorRepository.findById(id).get();
    }

    public EnderecoInstrutor cadastrarEndereco(EnderecoInstrutor endereco){
        return enderecoInstrutorRepository.save(endereco);
    }

    public List<EnderecoInstrutor> getEnderecos(Long id){
        return enderecoInstrutorRepository.findByInstrutor(findById(id));
    }



    
}
