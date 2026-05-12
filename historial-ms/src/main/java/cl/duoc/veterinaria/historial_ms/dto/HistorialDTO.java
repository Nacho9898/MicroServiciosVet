package cl.duoc.veterinaria.historial_ms.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class HistorialDTO {

    @NotNull(message = "Debe ingresar mascota")
    private Long idMascota;


    // ejemplo: vacuna o control
    @NotBlank(message = "Ingrese evento")
    private String evento;


    @NotBlank(message = "Falta descripcion")
    private String descripcion;


    @NotBlank(message = "Ingrese profesional")
    private String profesional;

}