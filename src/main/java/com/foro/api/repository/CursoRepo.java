package com.foro.api.repository;

import com.foro.api.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepo extends JpaRepository<Curso, Long> {
}
