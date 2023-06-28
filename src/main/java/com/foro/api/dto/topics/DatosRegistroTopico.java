package com.foro.api.dto.topics;

import com.foro.api.dto.courses.CursoDTO;
import com.foro.api.dto.users.UsuarioDTO;

public record DatosRegistroTopico(String titulo, String mensaje, UsuarioDTO autor, CursoDTO curso) {
}
