package com.foro.api.controller;

import com.foro.api.domain.dto.respuestas.DatosListadoRespuesta;
import com.foro.api.domain.dto.respuestas.DatosRegistroRespuesta;
import com.foro.api.domain.dto.respuestas.DetallarRespuesta;
import com.foro.api.domain.model.Respuesta;
import com.foro.api.domain.model.Topico;
import com.foro.api.domain.model.Usuario;
import com.foro.api.domain.repository.RespuestaRepository;
import com.foro.api.domain.repository.TopicoRepository;
import com.foro.api.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {
    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RespuestaRepository respuestaRepository;

    @PostMapping
    public void registroRespuesta(@RequestBody DatosRegistroRespuesta datosRegistroRespuesta) {
        Topico topico = topicoRepository.findById(datosRegistroRespuesta.id_topico()).orElseThrow();
        Usuario usuario = usuarioRepository.findById(datosRegistroRespuesta.id_autor()).orElseThrow();
        Respuesta respuesta = respuestaRepository.save(new Respuesta(datosRegistroRespuesta, topico, usuario));
    }

    @GetMapping
    public ResponseEntity<Page<DatosListadoRespuesta>> listarRespuestas(Pageable paginacion) {
        return ResponseEntity.ok(respuestaRepository.findAll(paginacion).map(DatosListadoRespuesta::new));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetallarRespuesta> detallarRespuesta(@PathVariable Long id) {
        var respuesta = respuestaRepository.getReferenceById(id);
        return ResponseEntity.ok(new DetallarRespuesta(respuesta));
    }

}
