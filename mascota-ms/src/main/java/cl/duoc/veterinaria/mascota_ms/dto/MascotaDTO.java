package cl.duoc.veterinaria.mascota_ms.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MascotaDTO {

    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombreMascota;

    @NotBlank(message = "La especie es obligatoria")
    private String especie;

    @Min(value = 0, message = "La edad no puede ser negativa")
    private Integer edad;

    public MascotaDTO() {
    }

    public MascotaDTO(String nombreMascota, String especie, Integer edad) {

        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.edad = edad;
    }
}