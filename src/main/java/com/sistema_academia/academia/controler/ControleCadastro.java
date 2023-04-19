package com.sistema_academia.academia.controler;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema_academia.academia.entities.Cliente;
import com.sistema_academia.academia.entities.EnderecoCliente;
import com.sistema_academia.academia.entities.EnderecoInstrutor;
import com.sistema_academia.academia.entities.Exercicio;
import com.sistema_academia.academia.entities.Maquina;
import com.sistema_academia.academia.services.ClienteServico;
import com.sistema_academia.academia.services.InstrutorServico;
import com.sistema_academia.academia.services.MaquinaServico;


@RestController
@RequestMapping(value = "/cadastrar")
public class ControleCadastro {

    @Autowired
    private MaquinaServico servicoMaquuina;
    @Autowired 
    private ClienteServico clienteServico;
    @Autowired
    private InstrutorServico instrutorServico;

    @PostMapping("/maquina")
    public Maquina salvarMaquina(@RequestBody Maquina maquina){
        return servicoMaquuina.cadastrar(maquina);
    }

    @PostMapping("/maquina/list")
    public List<Maquina> salvarVariasMaquinas(@RequestBody List<Maquina> maquinas){
        return servicoMaquuina.CadastrarVariasMaquinas(maquinas);
    }

    @PostMapping("/cliente")
    public Cliente salvarCliente(@RequestBody Cliente cliente){
        return clienteServico.cadastrarModificar(cliente);
    }

    @PostMapping("/exercicio")
    public Exercicio salvarExercicio(@RequestBody Exercicio exercicio){
        return clienteServico.criarExercicio(exercicio);
    }

    @PostMapping("/cliente/endereco")
    public EnderecoCliente salvarEnderecoCliente(@RequestBody EnderecoCliente enderecoCliente){
        return clienteServico.cadastrarEndereco(enderecoCliente);
    }
    
    @PostMapping("/Instrutor/endereco")
    public EnderecoInstrutor salvarEnderecoInstrutor(@RequestBody EnderecoInstrutor enderecoInstrutor){
        return instrutorServico.cadastrarEndereco(enderecoInstrutor);
    }
    

}
