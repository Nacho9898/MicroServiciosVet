package cl.duoc.veterinaria.consultas_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.veterinaria.consultas_ms.dto.ConsultasDTO;
import cl.duoc.veterinaria.consultas_ms.model.Consultas;
import cl.duoc.veterinaria.consultas_ms.service.ConsultasService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/consultas")
public class ConsultasController {

    @Autowired
    private ConsultasService consultasService;


    // lista las consultas registradas
    @GetMapping
    public ResponseEntity<List<Consultas>> listar() {

        List<Consultas> lista = consultasService.listarTodas();

        return ResponseEntity.ok(lista);
    }


    @PostMapping
    public ResponseEntity<Consultas> crear(@Valid @RequestBody ConsultasDTO dto) {

        Consultas consulta = consultasService.guardar(dto);

        return new ResponseEntity<>(consulta, HttpStatus.CREATED);
    }

}