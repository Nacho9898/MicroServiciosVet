package cl.duoc.veterinaria.consultas_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.veterinaria.consultas_ms.dto.ConsultasDTO;
import cl.duoc.veterinaria.consultas_ms.model.Consultas;
import cl.duoc.veterinaria.consultas_ms.repository.ConsultasRepository;

@Service
public class ConsultasService {

    @Autowired
    private ConsultasRepository repo;


    // mostrar consultas
    public List<Consultas> listarTodas() {

        return repo.findAll();
    }


    public Consultas guardar(ConsultasDTO dto) {

        Consultas consulta = new Consultas();

        consulta.setIdCita(dto.getIdCita());

        consulta.setRutMedico(dto.getRutMedico());

        consulta.setDiagnostico(dto.getDiagnostico());
        consulta.setReceta(dto.getReceta());

        Consultas nuevaConsulta = repo.save(consulta);

        return nuevaConsulta;
    }

}