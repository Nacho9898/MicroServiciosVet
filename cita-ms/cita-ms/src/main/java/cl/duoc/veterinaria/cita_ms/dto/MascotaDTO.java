package cl.duoc.veterinaria.cita_ms.dto;

import lombok.Data;

@Data
public class MascotaDTO {
    private Long id;
    private String nombre;
    private String especie;
    private String raza;
}