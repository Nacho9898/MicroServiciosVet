package cl.duoc.veterinaria.facturacion_ms.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class FacturaDTO {

    @NotNull(message = "Id consulta obligatorio")
    private Long idConsulta;

    @NotBlank(message = "Rut obligatorio")
    private String rutCliente;

    @Positive
    private double montoTotal;

    // efectivo, debito o credito
    @NotBlank(message = "Ingrese metodo de pago")
    private String metodoPago;

}