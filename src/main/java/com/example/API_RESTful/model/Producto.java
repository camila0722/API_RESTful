package com.example.API_RESTful.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Modelo que representa un Producto.
 * Utiliza Lombok para reducir código repetitivo.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    /**
     * Identificador del producto.
     */

    private String id;

    /**
     * Nombre del producto.
     */

    private String nombre;

     /**
     * Precio del producto.
     */

    private double precio;
}
