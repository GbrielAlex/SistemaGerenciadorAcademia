package com.sistema_academia.academia.entities;

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
@Table(name = "id_plano")
public class Plano {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String formaPagamento;

    @NotNull
    private int diaPagamento;

    @NotNull
    private double valor;

    @NotNull
    private int quantMeses;

    private double valorMensal = valor * quantMeses;


}
