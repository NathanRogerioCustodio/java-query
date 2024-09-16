package java_queries.java_queries.service;

import java_queries.java_queries.entity.Cliente;
import java_queries.java_queries.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente criarCliente(Cliente cliente){
        return clienteRepository.save(cliente);

    }

    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }

    public List<Cliente> listarClientesByNome(String nome){
        return clienteRepository.findByNome(nome);
    }
}
