package com.foro.api.dto.topics;

import com.foro.api.model.StatusTopico;

public record DatosActualizarTopico(Long id_topico, String titulo, String mensaje,
                                    StatusTopico estatus) {
}
