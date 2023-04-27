package com.sistema_academia.academia.controler;


import java.net.URI;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema_academia.academia.entities.Cliente;
import com.sistema_academia.academia.entities.EnderecoCliente;
import com.sistema_academia.academia.entities.EnderecoInstrutor;
import com.sistema_academia.academia.entities.Exercicio;
import com.sistema_academia.academia.entities.Maquina;
import com.sistema_academia.academia.entities.Plano;
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
    public ResponseEntity<Maquina> salvarMaquina(@RequestBody Maquina maquina){
        servicoMaquuina.cadastrar(maquina);
        return ResponseEntity.status(HttpStatus.CREATED).body(maquina);
    }

    @PostMapping("/maquina/list")
    public ResponseEntity<List<Maquina>> salvarVariasMaquinas(@RequestBody List<Maquina> maquinas){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicoMaquuina.CadastrarVariasMaquinas(maquinas));
    }

    @PostMapping("/cliente")
    public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteServico.cadastrarModificar(cliente));
    }

    @PostMapping("/exercicio")
    public ResponseEntity<Exercicio> salvarExercicio(@RequestBody Exercicio exercicio){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteServico.criarExercicio(exercicio));
    }

    @PostMapping("/cliente/endereco")
    public ResponseEntity<EnderecoCliente> salvarEnderecoCliente(@RequestBody EnderecoCliente enderecoCliente){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteServico.cadastrarEndereco(enderecoCliente));
    }
    
    @PostMapping("/Instrutor/endereco")
    public ResponseEntity<EnderecoInstrutor> salvarEnderecoInstrutor(@RequestBody EnderecoInstrutor enderecoInstrutor){
        return ResponseEntity.status(HttpStatus.CREATED).body(instrutorServico.cadastrarEndereco(enderecoInstrutor));
    }
    
    @PostMapping("/plano")
    public ResponseEntity<Plano> cadastrarPlano(Plano plano){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteServico.cadastrarPlano(plano));
    }


}
