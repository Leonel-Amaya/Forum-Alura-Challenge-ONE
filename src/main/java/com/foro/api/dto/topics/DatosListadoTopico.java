package com.foro.api.dto.topics;

import com.foro.api.model.Topico;

public record DatosListadoTopico(String titulo, String mensaje, String fecha, String autor, String curso) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion().toString(),
                topico.getAutor().getNombre(), topico.getCurso().getCurso());
    }
}
