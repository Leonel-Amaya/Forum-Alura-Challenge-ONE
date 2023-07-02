package com.foro.api.controller;

import com.foro.api.dto.topics.DatosDetallarTopico;
import com.foro.api.dto.topics.DatosListadoTopico;
import com.foro.api.dto.topics.DatosRegistroTopico;
import com.foro.api.model.Curso;
import com.foro.api.model.Topico;
import com.foro.api.model.Usuario;
import com.foro.api.repository.CursoRepo;
import com.foro.api.repository.TopicoRepo;
import com.foro.api.repository.UsuarioRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepo topicoRepo;

    @Autowired
    private UsuarioRepo usuarioRepo;

    @Autowired
    private CursoRepo cursoRepo;

    /*
    Los tópicos deben tener los siguientes datos (título, mensaje, autor y curso)
    Todos son obligatorios
    No se permite registros duplicados (mismo título ni mensaje)
     */

    //Método que recibe los nuevos tópicos creados
    @PostMapping
    public void nuevoTopico(@RequestBody DatosRegistroTopico datosRegistro) {
        System.out.println("Creando nuevo tópico");
        System.out.println(datosRegistro);
        Usuario usuario = usuarioRepo.findById(datosRegistro.id_usuario()).orElseThrow();
        Curso curso = cursoRepo.findById(datosRegistro.id_curso()).orElseThrow();
        Topico topico = topicoRepo.save(new Topico(datosRegistro, usuario, curso));
    }

    @GetMapping
    public Page<DatosListadoTopico> listarTopicos(Pageable paginacion) {
        return topicoRepo.findAll(paginacion).map(DatosListadoTopico::new);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosDetallarTopico> detallarTopico(@PathVariable Long id) {
        var topico = topicoRepo.getReferenceById(id);
        return ResponseEntity.ok(new DatosDetallarTopico(topico));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarTopico(@PathVariable Long id) {
        Topico topico = topicoRepo.getReferenceById(id);
        topicoRepo.delete(topico);
        return ResponseEntity.noContent().build();
    }
}
