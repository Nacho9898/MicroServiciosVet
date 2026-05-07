package cl.duoc.veterinaria.cita_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.veterinaria.cita_ms.model.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
}