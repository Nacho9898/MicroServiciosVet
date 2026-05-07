package cl.duoc.veterinaria.medicos_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.veterinaria.medicos_ms.dto.MedicosDTO;
import cl.duoc.veterinaria.medicos_ms.model.Medicos;
import cl.duoc.veterinaria.medicos_ms.service.MedicosService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/medicos")
public class MedicosController {

    @Autowired
    private MedicosService service;


    @GetMapping
    public ResponseEntity<List<Medicos>> listar() {

        List<Medicos> lista = service.listarTodos();

        return ResponseEntity.ok(lista);
    }


    // registrar medico
    @PostMapping
    public ResponseEntity<Medicos> crear(@Valid @RequestBody MedicosDTO datos) {

        Medicos medico = service.guardar(datos);

        return ResponseEntity.status(HttpStatus.CREATED).body(medico);
    }

}