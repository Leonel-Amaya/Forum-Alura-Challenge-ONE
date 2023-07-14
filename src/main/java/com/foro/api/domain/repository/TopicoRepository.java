package com.foro.api.domain.repository;

import com.foro.api.domain.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    @Override
    Optional<Topico> findById(Long id);
}
