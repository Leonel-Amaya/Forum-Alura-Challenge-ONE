package com.foro.api.model;

import com.foro.api.dto.DatosRegistroTopico;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name="Topico")
@Table(name="topicos1")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private StatusTopico estatus = StatusTopico.NO_SOLUCIONADO;

    @Embedded
    private Usuario autor;

    @Embedded
    private Curso curso;
    //private List<Respuesta> respuestas = new ArrayList<>();

    public Topico(DatosRegistroTopico datosTopico) {
        this.titulo = datosTopico.titulo();
        this.mensaje = datosTopico.mensaje();
        this.autor = new Usuario(datosTopico.autor());
        this.curso = new Curso(datosTopico.curso());
    }
}
