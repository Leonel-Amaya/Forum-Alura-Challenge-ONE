package com.foro.api.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Topico {
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    private StatusTopico estatus = StatusTopico.NO_SOLUCIONADO;
    private Usuario autor;
    private Curso curso;
    private List<Respuesta> respuestas = new ArrayList<>();
}
