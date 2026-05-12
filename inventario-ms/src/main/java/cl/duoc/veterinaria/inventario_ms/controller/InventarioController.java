package cl.duoc.veterinaria.inventario_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.veterinaria.inventario_ms.dto.InventarioDTO;
import cl.duoc.veterinaria.inventario_ms.model.Inventario;
import cl.duoc.veterinaria.inventario_ms.service.InventarioService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;


    // mostrar productos del inventario
    @GetMapping
    public ResponseEntity<List<Inventario>> listar() {

        List<Inventario> lista = inventarioService.listarTodo();

        return ResponseEntity.ok(lista);
    }


    @PostMapping
    public ResponseEntity<Inventario> crear(@Valid @RequestBody InventarioDTO dto) {

        Inventario producto = inventarioService.guardar(dto);

        return new ResponseEntity<>(producto, HttpStatus.CREATED);
    }

}