package cl.duoc.veterinaria.notificaciones_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.veterinaria.notificaciones_ms.dto.NotificacionDTO;
import cl.duoc.veterinaria.notificaciones_ms.model.Notificacion;
import cl.duoc.veterinaria.notificaciones_ms.service.NotificacionService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionController {

    @Autowired
    private NotificacionService service;


    // lista de notificaciones enviadas
    @GetMapping
    public ResponseEntity<List<Notificacion>> listar() {

        List<Notificacion> lista = service.listarEnviadas();

        return ResponseEntity.ok(lista);
    }


    @PostMapping
    public ResponseEntity<Notificacion> enviar(@Valid @RequestBody NotificacionDTO dto) {

        Notificacion notificacion = service.registrarEnvio(dto);

        return new ResponseEntity<>(notificacion, HttpStatus.CREATED);
    }

}