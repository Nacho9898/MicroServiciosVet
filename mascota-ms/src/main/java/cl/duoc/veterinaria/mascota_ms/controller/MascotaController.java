package cl.duoc.veterinaria.mascota_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.veterinaria.mascota_ms.dto.MascotaDTO;
import cl.duoc.veterinaria.mascota_ms.model.Mascota;
import cl.duoc.veterinaria.mascota_ms.service.MascotaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    
    // lista todas las mascotas
    @GetMapping
    public ResponseEntity<List<Mascota>> listar() {

        List<Mascota> listaMascotas = mascotaService.listarTodas();

        return ResponseEntity.ok(listaMascotas);
    }

    
    // crear mascota nueva
    @PostMapping
    public ResponseEntity<Mascota> crear(@Valid @RequestBody MascotaDTO mascotaDTO) {

        Mascota mascotaGuardada = mascotaService.guardar(mascotaDTO);

        return new ResponseEntity<>(mascotaGuardada, HttpStatus.CREATED);
    }

    
    // buscar mascota por id
    @GetMapping("/{id}")
    public ResponseEntity<Mascota> obtener(@PathVariable Long id) {

        Mascota mascotaBuscada = mascotaService.buscarPorId(id);

        if (mascotaBuscada == null) {

            // si no encuentra la mascota retorna 404
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(mascotaBuscada);
    }

}