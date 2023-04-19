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

@Setter
@Getter
@Entity
@Table(name = "tb_endereco_cliente")
public class EnderecoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_endereco;

    @NotNull
    private String pais;
    @NotNull
    private String UF;
    @NotNull
    private String cidade;
    @NotNull
    private String bairro;
    @NotNull
    private String Rua;
    @NotNull
    private int numero;

    private String complemento;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public EnderecoCliente() {
    }

}
