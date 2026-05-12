package cl.duoc.veterinaria.cita_ms.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CitaDTO {

    @NotNull(message = "Ingrese fecha")
    @Future(message = "La cita debe ser en una fecha valida")
    private LocalDateTime fechaHora;


    @NotBlank(message = "Debe ingresar motivo de la cita")
    @Size(min = 5, message = "Motivo demasiado corto")
    private String motivo;


    // mascota relacionada a la cita
    @NotNull(message = "Falta id mascota")
    private Long idMascota;

}