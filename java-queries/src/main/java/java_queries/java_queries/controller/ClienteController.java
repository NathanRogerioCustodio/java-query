package java_queries.java_queries.controller;

import java_queries.java_queries.entity.Cliente;
import java_queries.java_queries.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteService.listarClientes();
    }

    @GetMapping("/buscar")
    public List<Cliente> buscarClientesPorNome(@RequestParam String nome) {
        return clienteService.listarClientesByNome(nome);
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteService.criarCliente(cliente);

    }
}
