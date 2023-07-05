package com.foro.api.dto.topics;

import com.foro.api.model.StatusTopico;
import com.foro.api.model.Topico;

public record DatosDetallarTopico(Long id_topico,String titulo, String mensaje, String fecha,
                                  StatusTopico estatus, String autor, String curso) {
    public DatosDetallarTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion().toString(),
                topico.getEstatus(), topico.getAutor().getNombre(), topico.getCurso().getCurso());
    }
}
