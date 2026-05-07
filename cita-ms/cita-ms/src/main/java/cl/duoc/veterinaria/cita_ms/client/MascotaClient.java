package cl.duoc.veterinaria.cita_ms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.duoc.veterinaria.cita_ms.dto.MascotaDTO;

@FeignClient(name = "mascota-ms", url = "http://localhost:8081")
public interface MascotaClient {

    @GetMapping("/mascotas/{id}")
    MascotaDTO obtenerMascotaPorId(@PathVariable("id") Long id);
}