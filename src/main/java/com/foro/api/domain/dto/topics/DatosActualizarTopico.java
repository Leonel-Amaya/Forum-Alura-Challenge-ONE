package com.foro.api.domain.dto.topics;

import com.foro.api.domain.model.StatusTopico;

public record DatosActualizarTopico(Long id_topico, String titulo, String mensaje,
                                    StatusTopico estatus) {
}
