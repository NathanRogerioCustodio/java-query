package java_queries.java_queries.service;

import java_queries.java_queries.entity.Pedido;
import java_queries.java_queries.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public List<Pedido> buscarPedidosPorNomeCliente(String nomeCliente) {
        return pedidoRepository.findPedidosByNomeCliente(nomeCliente);
    }

    public Pedido adicionarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
}
