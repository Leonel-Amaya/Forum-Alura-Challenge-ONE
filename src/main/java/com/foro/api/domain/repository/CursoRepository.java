package com.foro.api.domain.repository;

import com.foro.api.domain.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    @Override
    Optional<Curso> findById(Long aLong);
}
