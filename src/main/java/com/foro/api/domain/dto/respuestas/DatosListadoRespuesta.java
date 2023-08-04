package com.foro.api.domain.dto.respuestas;

import com.foro.api.domain.model.Respuesta;

public record DatosListadoRespuesta(String mensaje, String fecha, String autor, Long topico) {

    public DatosListadoRespuesta(Respuesta respuesta) {
        this(respuesta.getMensaje(), respuesta.getFechaCreacion().toString(),
                respuesta.getAutor().getNombre(), respuesta.getTopico().getId());
    }

}
