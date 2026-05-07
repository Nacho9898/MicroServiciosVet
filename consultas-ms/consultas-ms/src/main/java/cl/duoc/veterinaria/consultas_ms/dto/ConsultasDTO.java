package cl.duoc.veterinaria.consultas_ms.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ConsultasDTO {

    @NotNull(message = "Debe ingresar id cita")
    private Long idCita;


    // rut del medico que atendio
    @NotBlank(message = "Ingrese rut medico")
    private String rutMedico;


    @NotBlank(message = "Ingrese diagnostico")
    @Size(min = 10, message = "Diagnostico muy corto")
    private String diagnostico;


    @NotBlank(message = "Falta receta")
    private String receta;

}