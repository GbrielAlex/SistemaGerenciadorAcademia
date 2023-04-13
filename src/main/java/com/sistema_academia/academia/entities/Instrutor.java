package com.sistema_academia.academia.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_instrutor")
public class Instrutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_instutor;

    private String nome;

    @Size(max = 1, min = 1)
    private String sexo;

    @NotNull
    private LocalDate dataNascimento;
    
    @NotNull
    private String email;

    @NotNull
    private BigDecimal valorSalario;

    @NotNull
    private LocalDate dataPagamento;

    @NotNull
    @OneToMany(mappedBy = "instrutor")
    private List<Endereco> enderecos;

}
