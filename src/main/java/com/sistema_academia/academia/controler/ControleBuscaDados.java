package com.sistema_academia.academia.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Maquina>> listarTodasAsMaquinas(){
        return ResponseEntity.ok(servicoMaquina.findAll()) ;
    }

    @GetMapping("/listar_maquina/{id}")
    public ResponseEntity<Maquina> listarMaquina(@PathVariable Long id ){
        return ResponseEntity.ok(servicoMaquina.findById(id));
    }
    
    @GetMapping("listar_Clientes")
    public ResponseEntity<List<Cliente>> listarTodoClientes(){
        return ResponseEntity.ok(servicoCliente.findAll());
    }

    @GetMapping("/listar_Cliente/{id}")
    public ResponseEntity<Cliente> listarCLiente(@PathVariable Long id ){
        return ResponseEntity.ok(servicoCliente.findById(id));
    }

    @GetMapping("/listar_exercicios/{cpf}")
    public ResponseEntity<List<Exercicio>> listarExercicios(@PathVariable String cpf){
        return ResponseEntity.ok(servicoCliente.getExercicios(cpf));
    }

    @GetMapping("/listar_enderecos/cliente/{id}")
    public ResponseEntity<List<EnderecoCliente>> listarEnderecoCliente(@PathVariable Long id ){
        return ResponseEntity.ok(servicoCliente.getEnderecos(id));
    }

    @GetMapping("/listar_instrutor/{id}")
    public ResponseEntity<Instrutor> listarInstrutor(@PathVariable Long id ){
        return ResponseEntity.ok(instrutorServico.findById(id));
    }

    @GetMapping("/listar_enderecos/instrutor/{id}")
    public ResponseEntity<List<EnderecoInstrutor>> listarEnderecoInstrutors(@PathVariable Long id ){
        return ResponseEntity.ok(instrutorServico.getEnderecos(id));
    }

}
