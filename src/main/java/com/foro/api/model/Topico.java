package com.foro.api.model;

import com.foro.api.dto.topics.DatosRegistroTopico;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Usuario autor;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;
    //private List<Respuesta> respuestas = new ArrayList<>();

    public Topico(DatosRegistroTopico datosTopico, Usuario usuario, Curso curso) {
        this.titulo = datosTopico.titulo();
        this.mensaje = datosTopico.mensaje();
        this.autor = usuario;
        this.curso = curso;
    }
}
