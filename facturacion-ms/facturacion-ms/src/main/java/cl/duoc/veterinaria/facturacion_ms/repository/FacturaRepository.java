package cl.duoc.veterinaria.facturacion_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.duoc.veterinaria.facturacion_ms.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
}