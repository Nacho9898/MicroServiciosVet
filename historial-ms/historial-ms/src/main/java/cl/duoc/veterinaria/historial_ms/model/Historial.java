package cl.duoc.veterinaria.historial_ms.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Data;

@Entity
@Data
public class Historial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long idMascota;
    private LocalDate fecha;
    private String evento;
    private String descripcion;
    private String profesional;

    @PrePersist
    public void asignarFecha() {
        this.fecha = LocalDate.now();
    }
}