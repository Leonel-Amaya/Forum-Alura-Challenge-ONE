package com.foro.api.repository;

import com.foro.api.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CursoRepo extends JpaRepository<Curso, Long> {
    @Override
    Optional<Curso> findById(Long aLong);
}
