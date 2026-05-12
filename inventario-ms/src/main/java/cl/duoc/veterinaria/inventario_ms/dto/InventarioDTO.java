package cl.duoc.veterinaria.inventario_ms.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class InventarioDTO {

    @NotBlank(message = "Ingrese nombre del producto")
    private String nombre;


    // cantidad disponible
    @Min(value = 0, message = "Stock invalido")
    private int stock;


    @NotBlank(message = "Ingrese categoria")
    private String categoria;


    @Positive(message = "Precio incorrecto")
    private double precio;

}