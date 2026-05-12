package cl.duoc.veterinaria.medicos_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.veterinaria.medicos_ms.model.Medicos;

@Repository
public interface MedicosRepository extends JpaRepository<Medicos, Long> {
}