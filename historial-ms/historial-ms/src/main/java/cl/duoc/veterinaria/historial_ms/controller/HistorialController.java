package cl.duoc.veterinaria.historial_ms.controller;

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

import cl.duoc.veterinaria.historial_ms.dto.HistorialDTO;
import cl.duoc.veterinaria.historial_ms.model.Historial;
import cl.duoc.veterinaria.historial_ms.service.HistorialService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/historial")
public class HistorialController {

    @Autowired
    private HistorialService service;


    @PostMapping
    public ResponseEntity<Historial> crear(@Valid @RequestBody HistorialDTO datos) {

        Historial nuevo = service.guardar(datos);

        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }


    // historial segun mascota
    @GetMapping("/mascota/{idMascota}")
    public ResponseEntity<List<Historial>> listarPorMascota(@PathVariable Long idMascota) {

        List<Historial> lista = service.obtenerPorMascota(idMascota);

        return ResponseEntity.ok(lista);
    }

}