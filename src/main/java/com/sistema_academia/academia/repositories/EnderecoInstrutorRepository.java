package com.sistema_academia.academia.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_academia.academia.entities.EnderecoInstrutor;
import com.sistema_academia.academia.entities.Instrutor;

public interface EnderecoInstrutorRepository extends JpaRepository<EnderecoInstrutor, Long>{
    List<EnderecoInstrutor> findByInstrutor(Instrutor instrutor);
}
