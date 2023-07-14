package com.foro.api.domain.model;

import com.foro.api.domain.dto.users.UsuarioDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Usuario")
@Table(name = "usuarios1")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String contrasena;

    public Usuario(UsuarioDTO usuarioDTO) {
        this.nombre = usuarioDTO.nombre();
        this.email = usuarioDTO.email();
        this.contrasena = usuarioDTO.contrasena();
    }
}
