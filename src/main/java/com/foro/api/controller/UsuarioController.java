package com.foro.api.controller;

import com.foro.api.dto.users.UsuarioDTO;
import com.foro.api.model.Usuario;
import com.foro.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepo;

    @PostMapping
    public void crearUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        System.out.println("Creando un nuevo usuario");
        Usuario usuario = usuarioRepo.save(new Usuario(usuarioDTO));
    }
}
