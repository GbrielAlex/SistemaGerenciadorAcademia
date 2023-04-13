package com.sistema_academia.academia.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema_academia.academia.entities.Maquina;
import com.sistema_academia.academia.services.MaquinaServico;

@RestController
@RequestMapping(value = "/modificar")
public class ControleModificarDados {
    
    
    @Autowired
    private MaquinaServico servicoMaquuina;

    @PatchMapping("/desativar/{id}")
    public Maquina desativar(@PathVariable Long id){
        return servicoMaquuina.desativarMaquina(id);
    }
    


}
