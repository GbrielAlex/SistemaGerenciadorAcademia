package com.sistema_academia.academia.controler;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema_academia.academia.entities.Maquina;
import com.sistema_academia.academia.services.MaquinaServico;


@RestController
@RequestMapping(value = "/cadastrar")
public class ControleCadastro {

    @Autowired
    private MaquinaServico servicoMaquuina;

    @PostMapping("/maquina")
    public Maquina salvarMaquina(@RequestBody Maquina maquina){
        return servicoMaquuina.cadastrar(maquina);
    }

    @PostMapping("/maquina/list")
    public List<Maquina> salvarVariasMaquinas(@RequestBody List<Maquina> maquinas){
        return servicoMaquuina.CadastrarVariasMaquinas(maquinas);
    }
    


}
