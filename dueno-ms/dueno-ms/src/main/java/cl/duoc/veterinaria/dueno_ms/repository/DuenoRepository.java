package cl.duoc.veterinaria.dueno_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.veterinaria.dueno_ms.model.Dueno;

@Repository
public interface DuenoRepository extends JpaRepository<Dueno, Long> {
}