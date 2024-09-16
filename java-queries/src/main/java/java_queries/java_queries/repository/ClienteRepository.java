package java_queries.java_queries.repository;

import java_queries.java_queries.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    @Query("SELECT c FROM Cliente c where c.nome LIKE %:nome%")
    List<Cliente> findByNome (String nome);
}
