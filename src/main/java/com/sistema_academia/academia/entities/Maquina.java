package com.sistema_academia.academia.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_maquina")
public class Maquina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_maquina;

    @NotNull
    private String nome;

    @NotNull
    private String marca;

    @NotNull
    private LocalDate data_compra;

    private String estado_maquina;

    public Maquina() {
    }

}
