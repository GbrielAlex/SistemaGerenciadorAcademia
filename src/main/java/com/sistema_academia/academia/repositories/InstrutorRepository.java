package com.sistema_academia.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_academia.academia.entities.Instrutor;

public interface InstrutorRepository extends JpaRepository<Instrutor, Long>{
    
}
