package com.foro.api.controller;

import com.foro.api.domain.dto.courses.CursoDTO;
import com.foro.api.domain.model.Curso;
import com.foro.api.domain.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepo;

    @PostMapping
    public void registrarCurso(@RequestBody CursoDTO cursoDTO) {
        System.out.println("Registrando un nuevo curso");
        Curso curso = cursoRepo.save(new Curso(cursoDTO));
    }
}
