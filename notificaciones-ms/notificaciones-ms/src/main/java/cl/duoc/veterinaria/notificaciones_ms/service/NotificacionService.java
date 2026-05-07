package cl.duoc.veterinaria.notificaciones_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.veterinaria.notificaciones_ms.dto.NotificacionDTO;
import cl.duoc.veterinaria.notificaciones_ms.model.Notificacion;
import cl.duoc.veterinaria.notificaciones_ms.repository.NotificacionRepository;

@Service
public class NotificacionService {

    @Autowired
    private NotificacionRepository repo;


    // retorna notificaciones registradas
    public List<Notificacion> listarEnviadas() {

        return repo.findAll();
    }


    public Notificacion registrarEnvio(NotificacionDTO dto) {

        Notificacion notificacion = new Notificacion();

        notificacion.setDestinatario(dto.getDestinatario());

        notificacion.setAsunto(dto.getAsunto());
        notificacion.setMensaje(dto.getMensaje());

        notificacion.setTipo(dto.getTipo());

        return repo.save(notificacion);
    }

}