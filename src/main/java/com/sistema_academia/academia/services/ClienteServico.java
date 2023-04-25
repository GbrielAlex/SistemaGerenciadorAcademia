package com.sistema_academia.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema_academia.academia.entities.Cliente;
import com.sistema_academia.academia.entities.EnderecoCliente;
import com.sistema_academia.academia.entities.Exercicio;
import com.sistema_academia.academia.entities.Plano;
import com.sistema_academia.academia.repositories.ClienteRepository;
import com.sistema_academia.academia.repositories.EnderecoClienteRepository;
import com.sistema_academia.academia.repositories.ExercicioRepository;
import com.sistema_academia.academia.repositories.PlanoRepository;

@Service
public class ClienteServico {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ExercicioRepository exercicioRepository;

    @Autowired
    private EnderecoClienteRepository enderecoRepository;

    @Autowired
    private PlanoRepository planoRepository;

    public Cliente cadastrarModificar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAll(){
       return clienteRepository.findAll();
    }

    public Cliente findById(Long id) {
        return clienteRepository.findById(id).get();
    }

    public Exercicio criarExercicio(Exercicio exercicio){
        return exercicioRepository.save(exercicio);
    }

    public List<Exercicio> getExercicios(String cpf){

        Cliente cliente = clienteRepository.findByCpf(cpf);
        return exercicioRepository.findByCliente(cliente);
    }

    public EnderecoCliente cadastrarEndereco(EnderecoCliente endereco){
        return enderecoRepository.save(endereco);
    }

    public List<EnderecoCliente> getEnderecos(Long id){
        return enderecoRepository.findByCliente(findById(id));
    }

    public Plano cadastrarPlano(Plano plano){
        return planoRepository.save(plano);
    }



}
