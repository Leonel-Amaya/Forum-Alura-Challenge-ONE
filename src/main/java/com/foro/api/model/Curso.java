package com.foro.api.model;

import com.foro.api.dto.CursoDTO;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class Curso {
    //private Long id;

    private String curso;

    private String categoria;

    public Curso(CursoDTO cursoDTO) {
        this.curso = cursoDTO.curso();
        this.categoria = cursoDTO.categoria();
    }
}
