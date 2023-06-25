package com.foro.api.dto;

public record DatosRegistroTopico(String titulo, String mensaje, UsuarioDTO autor, CursoDTO curso) {
}
