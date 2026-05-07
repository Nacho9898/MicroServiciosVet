package cl.duoc.veterinaria.facturacion_ms.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long idConsulta;
    private String rutCliente;
    private double montoTotal;
    private String metodoPago;
    private LocalDateTime fechaEmision;

    @PrePersist
    public void asignarFecha() {
        this.fechaEmision = LocalDateTime.now();
    }
}