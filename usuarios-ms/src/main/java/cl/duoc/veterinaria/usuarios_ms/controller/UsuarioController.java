package cl.duoc.veterinaria.usuarios_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.veterinaria.usuarios_ms.dto.UsuarioDTO;
import cl.duoc.veterinaria.usuarios_ms.model.Usuario;
import cl.duoc.veterinaria.usuarios_ms.service.UsuarioService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Usuario> registrar(@Valid @RequestBody UsuarioDTO dto) {
        Usuario nuevo = service.crearUsuario(dto);
        return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
    }
}