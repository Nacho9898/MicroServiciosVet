package cl.duoc.veterinaria.historial_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.veterinaria.historial_ms.model.Historial;

@Repository
public interface HistorialRepository extends JpaRepository<Historial, Long> {
}