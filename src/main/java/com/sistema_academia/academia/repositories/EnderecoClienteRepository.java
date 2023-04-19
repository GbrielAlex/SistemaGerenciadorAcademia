package com.sistema_academia.academia.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_academia.academia.entities.Cliente;
import com.sistema_academia.academia.entities.EnderecoCliente;

public interface EnderecoClienteRepository extends JpaRepository<EnderecoCliente,Long>{
    
    List<EnderecoCliente> findByCliente(Cliente cliente);
}
