package cl.duoc.veterinaria.mascota_ms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mascotas")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // nombre de la mascota
    @NotBlank(message = "El nombre de la mascota es obligatorio")
    private String nombre;

    // especie: perro, gato, etc
    @NotBlank(message = "La especie de la mascota es obligatoria")
    private String especie;

    @Min(value = 0, message = "La edad de la mascota no puede ser negativa")
    private int edad;

    // constructor para crear mascotas más rápido
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

}