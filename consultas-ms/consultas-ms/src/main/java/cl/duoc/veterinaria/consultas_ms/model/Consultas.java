package cl.duoc.veterinaria.consultas_ms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Consultas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long idCita;
    private String rutMedico;
    
    @Column(length = 1000) // Para que soporte textos largos en la BD
    private String diagnostico;
    
    @Column(length = 1000)
    private String receta;
}