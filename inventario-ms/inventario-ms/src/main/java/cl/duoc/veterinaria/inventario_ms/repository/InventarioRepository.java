package cl.duoc.veterinaria.inventario_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.veterinaria.inventario_ms.model.Inventario;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Long> {

}
