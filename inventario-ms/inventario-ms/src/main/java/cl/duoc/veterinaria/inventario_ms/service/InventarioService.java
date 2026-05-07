package cl.duoc.veterinaria.inventario_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.veterinaria.inventario_ms.dto.InventarioDTO;
import cl.duoc.veterinaria.inventario_ms.model.Inventario;
import cl.duoc.veterinaria.inventario_ms.repository.InventarioRepository;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository repository;


    public List<Inventario> listarTodo() {

        List<Inventario> lista = repository.findAll();

        return lista;
    }


    // guardar producto
    public Inventario guardar(InventarioDTO dto) {

        Inventario inventario = new Inventario();

        inventario.setNombre(dto.getNombre());
        inventario.setStock(dto.getStock());

        inventario.setCategoria(dto.getCategoria());

        double precio = dto.getPrecio();

        inventario.setPrecio(precio);

        return repository.save(inventario);
    }

}