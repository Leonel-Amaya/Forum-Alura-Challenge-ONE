package com.foro.api.domain.dto.respuestas;

import com.foro.api.domain.model.Respuesta;

public record DetallarRespuesta(String mensaje, String fecha, String autor) {

    public DetallarRespuesta(Respuesta respuesta) {
        this(respuesta.getMensaje(), respuesta.getFechaCreacion().toString(), respuesta.getAutor().getNombre());
    }
}
