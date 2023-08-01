package com.foro.api.controller;

import com.foro.api.domain.dto.respuestas.DatosRegistroRespuesta;
import com.foro.api.domain.model.Respuesta;
import com.foro.api.domain.model.Topico;
import com.foro.api.domain.model.Usuario;
import com.foro.api.domain.repository.RespuestaRepository;
import com.foro.api.domain.repository.TopicoRepository;
import com.foro.api.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
