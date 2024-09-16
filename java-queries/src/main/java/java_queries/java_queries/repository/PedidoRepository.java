package java_queries.java_queries.repository;

import java_queries.java_queries.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    @Query("SELECT p FROM Pedido p JOIN p.cliente c where c.nome = :nomeCliente")
    List<Pedido> findPedidosByNomeCliente(String nomeCliente);
}
