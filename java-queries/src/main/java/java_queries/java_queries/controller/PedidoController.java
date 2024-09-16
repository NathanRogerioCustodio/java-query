package java_queries.java_queries.controller;

import java_queries.java_queries.entity.Cliente;
import java_queries.java_queries.entity.Pedido;
import java_queries.java_queries.repository.PedidoRepository;
import java_queries.java_queries.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> listPedidos(){
        return pedidoService.listarPedidos();

    }

    @GetMapping("/buscar")
    public List<Pedido> buscarPedidoPorNomeCliente (@RequestParam String nomeCliente){
        return pedidoService.buscarPedidosPorNomeCliente(nomeCliente);
    }

    @PostMapping
    public Pedido adicionarPedido(@RequestBody Pedido pedido){
        return pedidoService.adicionarPedido(pedido);
    }

}
