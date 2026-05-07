package cl.duoc.veterinaria.mascota_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.veterinaria.mascota_ms.model.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}