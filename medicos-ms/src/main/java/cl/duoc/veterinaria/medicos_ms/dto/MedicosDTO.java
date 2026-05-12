package cl.duoc.veterinaria.medicos_ms.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MedicosDTO {

    @NotBlank(message = "Ingrese rut")
    @Pattern(
        regexp = "^[0-9]{7,8}-[0-9Kk]{1}$",
        message = "Rut invalido"
    )
    private String rut;


    @NotBlank(message = "Falta nombre")
    private String nombre;


    // especialidad del medico
    @NotBlank(message = "Ingrese especialidad")
    @Size(min = 4, message = "Especialidad muy corta")
    private String especialidad;


    @Email(message = "Correo no valido")
    private String correo;

}