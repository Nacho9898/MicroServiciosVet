package cl.duoc.veterinaria.historial_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.veterinaria.historial_ms.dto.HistorialDTO;
import cl.duoc.veterinaria.historial_ms.model.Historial;
import cl.duoc.veterinaria.historial_ms.repository.HistorialRepository;

@Service
public class HistorialService {

    @Autowired
    private HistorialRepository repo;


    // obtener historial de una mascota
    public List<Historial> obtenerPorMascota(Long idMascota) {

        return repo.findAll()
                .stream()
                .filter(h -> h.getIdMascota().equals(idMascota))
                .toList();
    }


    public Historial guardar(HistorialDTO dto) {

        Historial historial = new Historial();

        historial.setIdMascota(dto.getIdMascota());

        historial.setEvento(dto.getEvento());
        historial.setDescripcion(dto.getDescripcion());

        historial.setProfesional(dto.getProfesional());

        return repo.save(historial);
    }

}