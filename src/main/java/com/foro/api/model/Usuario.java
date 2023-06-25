package com.foro.api.model;

import com.foro.api.dto.UsuarioDTO;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class Usuario {
    //private Long id;
    private String nombre;
    private String email;
    //private String contrasena;


    public Usuario(UsuarioDTO usuarioDTO) {
        this.nombre = usuarioDTO.nombre();
        this.email = usuarioDTO.email();
    }
}
