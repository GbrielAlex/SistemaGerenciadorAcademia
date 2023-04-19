package com.sistema_academia.academia.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_academia.academia.entities.Cliente;
import com.sistema_academia.academia.entities.Exercicio;

public interface ExercicioRepository extends JpaRepository<Exercicio, Long>{

    List<Exercicio> findByCliente(Cliente cliente);
    
}
