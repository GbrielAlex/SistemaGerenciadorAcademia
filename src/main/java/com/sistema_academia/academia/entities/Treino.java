package com.sistema_academia.academia.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_treino")
public class Treino {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exercicio_id;   
    
    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_instrutor")
    private Instrutor instrutor;

    @OneToMany(mappedBy = "cliente")
    private List<Exercicio> exercicio;

}
