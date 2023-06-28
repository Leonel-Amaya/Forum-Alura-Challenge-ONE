package com.foro.api.repository;

import com.foro.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
