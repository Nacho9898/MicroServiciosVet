package cl.duoc.veterinaria.facturacion_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.veterinaria.facturacion_ms.dto.FacturaDTO;
import cl.duoc.veterinaria.facturacion_ms.model.Factura;
import cl.duoc.veterinaria.facturacion_ms.repository.FacturaRepository;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository repo;


    public List<Factura> listarTodas() {

        return repo.findAll();
    }


    // generar factura
    public Factura generar(FacturaDTO dto) {

        Factura factura = new Factura();

        factura.setIdConsulta(dto.getIdConsulta());

        factura.setRutCliente(dto.getRutCliente());
        factura.setMontoTotal(dto.getMontoTotal());

        factura.setMetodoPago(dto.getMetodoPago());

        return repo.save(factura);
    }

}