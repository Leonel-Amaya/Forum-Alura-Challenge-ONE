package com.foro.api.controller;

import com.foro.api.dto.DatosRegistroTopico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    /*
    Los tópicos deben tener los siguientes datos (título, mensaje, autor y curso)
    Todos son obligatorios
    No se permite registros duplicados (mismo título ni mensaje)
     */

    //Método que recibe los nuevos tópicos creados
    @PostMapping
    public void nuevoTopico(@RequestBody DatosRegistroTopico datosRegistro) {
        System.out.println("Creando nuevo tópico");
        System.out.println(datosRegistro);
    }

}
