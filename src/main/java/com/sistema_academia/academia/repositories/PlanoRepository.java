package com.sistema_academia.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_academia.academia.entities.Plano;

public interface PlanoRepository extends JpaRepository<Plano, Long> {
    
}
