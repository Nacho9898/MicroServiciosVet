package cl.duoc.veterinaria.notificaciones_ms.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class NotificacionDTO {

    @NotBlank(message = "Ingrese destinatario")
    @Email(message = "Correo invalido")
    private String destinatario;


    @NotBlank(message = "Falta asunto")
    private String asunto;


    // contenido de la notificacion
    @NotBlank(message = "Ingrese mensaje")
    private String mensaje;


    @NotBlank(message = "Ingrese tipo")
    private String tipo;

}