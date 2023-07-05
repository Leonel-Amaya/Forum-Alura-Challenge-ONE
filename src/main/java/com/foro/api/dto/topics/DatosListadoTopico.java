package com.foro.api.dto.topics;

import com.foro.api.model.StatusTopico;
import com.foro.api.model.Topico;

public record DatosListadoTopico(String titulo, String mensaje, String fecha, StatusTopico estatus, String autor, String curso) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion().toString(),
                topico.getEstatus(), topico.getAutor().getNombre(), topico.getCurso().getCurso());
    }
}
