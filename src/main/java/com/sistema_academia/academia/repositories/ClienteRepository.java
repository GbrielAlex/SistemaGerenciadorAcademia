package com.sistema_academia.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_academia.academia.entities.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
