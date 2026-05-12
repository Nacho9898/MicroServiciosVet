package cl.duoc.veterinaria.facturacion_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.veterinaria.facturacion_ms.dto.FacturaDTO;
import cl.duoc.veterinaria.facturacion_ms.model.Factura;
import cl.duoc.veterinaria.facturacion_ms.service.FacturaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/facturacion")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;


    // listar facturas registradas
    @GetMapping
    public ResponseEntity<List<Factura>> listar() {

        List<Factura> lista = facturaService.listarTodas();

        return ResponseEntity.ok(lista);
    }


    @PostMapping
    public ResponseEntity<Factura> crear(@Valid @RequestBody FacturaDTO dto) {

        Factura factura = facturaService.generar(dto);

        return new ResponseEntity<>(factura, HttpStatus.CREATED);
    }

}