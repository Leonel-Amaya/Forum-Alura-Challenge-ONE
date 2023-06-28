package com.foro.api.controller;

import com.foro.api.dto.courses.CursoDTO;
import com.foro.api.model.Curso;
import com.foro.api.repository.CursoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepo cursoRepo;

    @PostMapping
    public void registrarCurso(@RequestBody CursoDTO cursoDTO) {
        System.out.println("Registrando un nuevo curso");
        Curso curso = cursoRepo.save(new Curso(cursoDTO));
    }
}
