package com.foro.api.model;

import com.foro.api.dto.topics.DatosActualizarTopico;
import com.foro.api.dto.topics.DatosRegistroTopico;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
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

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario autor;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    @OneToMany(mappedBy = "topico")
    private List<Respuesta> respuestas;

    public Topico(DatosRegistroTopico datosTopico, Usuario usuario, Curso curso) {
        this.titulo = datosTopico.titulo();
        this.mensaje = datosTopico.mensaje();
        this.autor = usuario;
        this.curso = curso;
    }

    public void actualizar(DatosActualizarTopico datosActualizar){
        if(datosActualizar.titulo() != null) {
            this.titulo = datosActualizar.titulo();
        }
        if (datosActualizar.mensaje() != null) {
            this.mensaje = datosActualizar.mensaje();
        }
        if (datosActualizar.estatus() != null) {
            this.estatus = datosActualizar.estatus();
        }
    }
}
