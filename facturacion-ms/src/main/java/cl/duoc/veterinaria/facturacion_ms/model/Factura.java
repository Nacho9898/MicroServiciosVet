package cl.duoc.veterinaria.facturacion_ms.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "facturas")
@AllArgsConstructor
@NoArgsConstructor
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