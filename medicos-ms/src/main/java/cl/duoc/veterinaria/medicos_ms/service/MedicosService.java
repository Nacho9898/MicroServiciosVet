package cl.duoc.veterinaria.medicos_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.veterinaria.medicos_ms.dto.MedicosDTO;
import cl.duoc.veterinaria.medicos_ms.model.Medicos;
import cl.duoc.veterinaria.medicos_ms.repository.MedicosRepository;

@Service
public class MedicosService {

    @Autowired
    private MedicosRepository repo;


    // retorna los medicos guardados
    public List<Medicos> listarTodos() {

        return repo.findAll();
    }


    public Medicos guardar(MedicosDTO dto) {

        Medicos medico = new Medicos();

        medico.setRut(dto.getRut());

        medico.setNombre(dto.getNombre());
        medico.setEspecialidad(dto.getEspecialidad());

        medico.setCorreo(dto.getCorreo());

        Medicos nuevo = repo.save(medico);

        return nuevo;
    }

}