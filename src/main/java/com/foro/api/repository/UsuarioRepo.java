package com.foro.api.repository;

import com.foro.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
    @Override
    Optional<Usuario> findById(Long aLong);
}
