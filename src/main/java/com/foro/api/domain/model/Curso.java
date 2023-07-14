package com.foro.api.domain.model;

import com.foro.api.domain.dto.courses.CursoDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="Curso")
@Table(name="cursos1")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Curso {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    private String curso;

    private String categoria;

    public Curso(CursoDTO cursoDTO) {
        this.curso = cursoDTO.curso();
        this.categoria = cursoDTO.categoria();
    }
}
