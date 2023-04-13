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
@Table(name = "tb_telefone")
public class telefone {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_telefone;
    
    @NotNull
    private String tipo_telefone;
    @NotNull
    private int ddd;
    @NotNull
    private int numero;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name = "instrutor_id")
    private Instrutor instrutor;


}
