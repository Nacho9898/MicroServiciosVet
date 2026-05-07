package cl.duoc.veterinaria.usuarios_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.veterinaria.usuarios_ms.dto.UsuarioDTO;
import cl.duoc.veterinaria.usuarios_ms.model.Usuario;
import cl.duoc.veterinaria.usuarios_ms.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario crearUsuario(UsuarioDTO dto) {
        Usuario u = new Usuario();
        u.setUsername(dto.getUsername());
        u.setPassword(dto.getPassword());
        u.setRol(dto.getRol());
        u.setEmail(dto.getEmail());
        return repository.save(u);
    }
}