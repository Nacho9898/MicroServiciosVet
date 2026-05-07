package cl.duoc.veterinaria.cita_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.veterinaria.cita_ms.dto.CitaDTO;
import cl.duoc.veterinaria.cita_ms.model.Cita;
import cl.duoc.veterinaria.cita_ms.service.CitaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;


    // mostrar citas registradas
    @GetMapping
    public ResponseEntity<List<Cita>> listar() {

        List<Cita> citas = citaService.listarTodos();

        return ResponseEntity.ok(citas);
    }


    @PostMapping
    public ResponseEntity<Cita> crear(@Valid @RequestBody CitaDTO datos) {

        Cita citaNueva = citaService.guardar(datos);

        return new ResponseEntity<>(citaNueva, HttpStatus.CREATED);
    }

}