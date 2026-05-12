package cl.duoc.veterinaria.consultas_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.veterinaria.consultas_ms.model.Consultas;

@Repository
public interface ConsultasRepository extends JpaRepository<Consultas, Long> {
}