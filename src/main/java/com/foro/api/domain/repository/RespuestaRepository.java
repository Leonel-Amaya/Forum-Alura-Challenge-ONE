package com.foro.api.domain.repository;

import com.foro.api.domain.model.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    Optional<Respuesta> findById(Long id);
}
