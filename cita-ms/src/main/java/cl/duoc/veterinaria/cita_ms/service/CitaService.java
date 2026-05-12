package cl.duoc.veterinaria.cita_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.veterinaria.cita_ms.client.MascotaClient;
import cl.duoc.veterinaria.cita_ms.dto.CitaDTO;
import cl.duoc.veterinaria.cita_ms.dto.MascotaDTO;
import cl.duoc.veterinaria.cita_ms.model.Cita;
import cl.duoc.veterinaria.cita_ms.repository.CitaRepository;

@Service
public class CitaService {
    @Autowired
    private MascotaClient mascotaClient;

    public void validarYGuardar(CitaDTO citaDto) {

    MascotaDTO mascota = mascotaClient.obtenerMascotaPorId(citaDto.getIdMascota());
    
    if (mascota == null) {
        throw new RuntimeException("No existe la mascota, no se pudo crear la cita");
    }
}

    @Autowired
    private CitaRepository citaRepository;


    // retorna todas las citas
    public List<Cita> listarTodos() {

        return citaRepository.findAll();
    }


    public Cita guardar(CitaDTO dto) {

        Cita cita = new Cita();

        cita.setFechaHora(dto.getFechaHora());

        cita.setMotivo(dto.getMotivo());

        // relacion con mascota
        cita.setIdMascota(dto.getIdMascota());

        Cita nuevaCita = citaRepository.save(cita);

        return nuevaCita;
    }
}