package com.sistema_academia.academia.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_exercicio")
public class Exercicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "maquina_id")
    private Maquina maquina;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_instrutor")
    private Instrutor instrutor;

    @NotNull
    private String diaSemana;

    @NotNull
    private int num_repeticoes;

    @NotNull
    private int num_series;

    @NotNull
    private int tempo_descanso_minutos;

}
