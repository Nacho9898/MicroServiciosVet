package cl.duoc.veterinaria.dueno_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.veterinaria.dueno_ms.dto.DuenoDTO;
import cl.duoc.veterinaria.dueno_ms.model.Dueno;
import cl.duoc.veterinaria.dueno_ms.repository.DuenoRepository;

@Service
public class DuenoService {

    @Autowired
    private DuenoRepository repo;


    // obtiene todos los dueños
    public List<Dueno> listarTodos() {

        return repo.findAll();
    }


    public Dueno guardar(DuenoDTO dto) {

        Dueno dueno = new Dueno();

        dueno.setRut(dto.getRut());
        dueno.setNombre(dto.getNombre());

        dueno.setCorreo(dto.getCorreo());
        dueno.setTelefono(dto.getTelefono());

        Dueno nuevo = repo.save(dueno);

        return nuevo;
    }

}