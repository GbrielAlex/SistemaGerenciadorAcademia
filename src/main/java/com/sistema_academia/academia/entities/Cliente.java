package com.sistema_academia.academia.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @NotBlank
    @NotNull
    private String nome;

    @NotBlank
    @NotNull
    private String sexo;

    @NotBlank
    @NotNull
    private LocalDate dataNascimento;

    @NotBlank
    @NotNull
    private String email;
    
    @OneToOne
    private Plano plano;
    
    @OneToMany(mappedBy = "cliente")
    private List<Exercicio> treinos;

    @OneToMany(mappedBy = "cliente")
    private List<Endereco> enderecos;


}
