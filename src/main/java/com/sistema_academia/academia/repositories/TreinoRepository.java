package com.sistema_academia.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_academia.academia.entities.Treino;

public interface TreinoRepository extends JpaRepository<Treino, Long> {
    
}
