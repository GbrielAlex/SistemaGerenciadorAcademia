package com.sistema_academia.academia.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema_academia.academia.entities.Maquina;
import com.sistema_academia.academia.services.MaquinaServico;

@RestController
@RequestMapping(value = "/buscar")
public class ControleBuscaDados {

    @Autowired
    private MaquinaServico servicoMaquina;

    @GetMapping("/listar_maquinas")
    public List<Maquina> listarTodasAsMaquinas(){
        return servicoMaquina.findAll();
    }

    @GetMapping("/listar_maquina/{id}")
    public Maquina listarMaquina(@PathVariable Long id ){
        return servicoMaquina.findById(id);
    }
    
}
