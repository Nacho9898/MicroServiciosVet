package cl.duoc.veterinaria.dueno_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.veterinaria.dueno_ms.dto.DuenoDTO;
import cl.duoc.veterinaria.dueno_ms.model.Dueno;
import cl.duoc.veterinaria.dueno_ms.service.DuenoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/duenos")
public class DuenoController {

    @Autowired
    private DuenoService duenoService;


    @GetMapping
    public ResponseEntity<List<Dueno>> listar() {

        return ResponseEntity.ok(duenoService.listarTodos());
    }


    @PostMapping
    public ResponseEntity<Dueno> crear(@Valid @RequestBody DuenoDTO datosDueno) {

        Dueno nuevo = duenoService.guardar(datosDueno);

        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }

}