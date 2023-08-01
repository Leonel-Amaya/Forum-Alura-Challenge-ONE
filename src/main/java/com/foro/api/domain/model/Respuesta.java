package com.foro.api.domain.model;

import com.foro.api.domain.dto.respuestas.DatosRegistroRespuesta;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name="Respuesta")
@Table(name = "respuestas2")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contenido")
    private String mensaje;

    @ManyToOne
    @JoinColumn(name = "id_topico")
    private Topico topico;
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario autor;
    //private Boolean solucion = false;


    public Respuesta(DatosRegistroRespuesta datosRegistroRespuesta, Topico topico, Usuario usuario) {
        this.mensaje = datosRegistroRespuesta.mensaje();
        this.topico = topico;
        this.autor = usuario;
    }
}
