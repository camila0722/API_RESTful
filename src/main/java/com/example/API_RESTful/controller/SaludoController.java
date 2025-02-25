package com.example.API_RESTful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/*
 * Controlador para manejar el endpoint de saludo
 * Soporta internacionalizacion para devolver mensajes en los dos idiomas
 */

@RestController
@RequestMapping("/api")
public class SaludoController {

    /*
     * Se inyecta el MessageSource para la internacionalizacion
     */
    @Autowired
    private MessageSource messageSource;

    /*
     * Endpoint de tipo GET para obtener el saludo.
     * @param locale Objeto Locale que se obtiene del header "Accept-Language" (opcional).
     * @return Mensaje de saludo en el idioma solicitado.
     */

    @GetMapping("/saludo")
    public String obtenerSaludo(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        // Se obtiene el mensaje correspondiente a la clave "saludo" según el Locale proporcionado.
        return messageSource.getMessage("saludo", null, locale);
    }
}