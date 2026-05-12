package cl.duoc.veterinaria.dueno_ms.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class DuenoDTO {

    @NotBlank(message = "Debe ingresar rut")
    @Pattern(
        regexp = "^[0-9]{7,8}-[0-9Kk]{1}$",
        message = "Rut invalido"
    )
    private String rut;

    
    @NotBlank(message = "Ingrese nombre")
    @Size(min = 3, message = "Nombre demasiado corto")
    private String nombre;


    @NotBlank(message = "Ingrese correo")
    @Email(message = "Correo invalido")
    private String correo;


    // Dueño del telefono
    @Pattern(
        regexp = "^[0-9]{9}$",
        message = "Telefono incorrecto"
    )
    private String telefono;

}