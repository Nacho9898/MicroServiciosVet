package cl.duoc.veterinaria.mascota_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.veterinaria.mascota_ms.dto.MascotaDTO;
import cl.duoc.veterinaria.mascota_ms.model.Mascota;
import cl.duoc.veterinaria.mascota_ms.repository.MascotaRepository;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository repo;


    // retorna todas las mascotas registradas
    public List<Mascota> listarTodas() {

        return repo.findAll();
    }


    public Mascota guardar(MascotaDTO datos) {

        Mascota mascota = new Mascota();

        String nombre = datos.getNombreMascota();

        mascota.setNombre(nombre);
        mascota.setEspecie(datos.getEspecie());

        // validacion simple por si la edad viene null
        if(datos.getEdad() != null) {

            mascota.setEdad(datos.getEdad());
        }

        Mascota guardada = repo.save(mascota);

        return guardada;
    }


    // busca mascota usando el id
    public Mascota buscarPorId(Long idMascota) {

        Mascota dato = repo.findById(idMascota).orElse(null);

        return dato;
    }

}