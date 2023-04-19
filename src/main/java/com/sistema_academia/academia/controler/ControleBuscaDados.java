package com.sistema_academia.academia.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema_academia.academia.entities.Cliente;
import com.sistema_academia.academia.entities.EnderecoCliente;
import com.sistema_academia.academia.entities.EnderecoInstrutor;
import com.sistema_academia.academia.entities.Exercicio;
import com.sistema_academia.academia.entities.Instrutor;
import com.sistema_academia.academia.entities.Maquina;
import com.sistema_academia.academia.services.ClienteServico;
import com.sistema_academia.academia.services.InstrutorServico;
import com.sistema_academia.academia.services.MaquinaServico;

@RestController
@RequestMapping(value = "/buscar")
public class ControleBuscaDados {

    @Autowired
    private MaquinaServico servicoMaquina;

    @Autowired
    private ClienteServico servicoCliente;

    @Autowired
    private InstrutorServico instrutorServico;

    @GetMapping("/listar_maquinas")
    public List<Maquina> listarTodasAsMaquinas(){
        return servicoMaquina.findAll();
    }

    @GetMapping("/listar_maquina/{id}")
    public Maquina listarMaquina(@PathVariable Long id ){
        return servicoMaquina.findById(id);
    }
    
    @GetMapping("listar_Clientes")
    public List<Cliente> listarTodoClientes(){
        return servicoCliente.findAll();
    }

    @GetMapping("/listar_Cliente/{id}")
    public Cliente listarCLiente(@PathVariable Long id ){
        return servicoCliente.findById(id);
    }

    @GetMapping("/listar_exercicios/{cpf}")
    public List<Exercicio> listarExercicios(@PathVariable String cpf){
        return servicoCliente.getExercicios(cpf);
    }

    @GetMapping("/listar_enderecos/cliente/{id}")
    public List<EnderecoCliente> listarEnderecoCliente(@PathVariable Long id ){
        return servicoCliente.getEnderecos(id);
    }

    @GetMapping("/listar_instrutor/{id}")
    public Instrutor listarInstrutor(@PathVariable Long id ){
        return instrutorServico.findById(id);
    }


    @GetMapping("/listar_enderecos/instrutor/{id}")
    public List<EnderecoInstrutor> listarEnderecoInstrutors(@PathVariable Long id ){
        return instrutorServico.getEnderecos(id);
    }




}
