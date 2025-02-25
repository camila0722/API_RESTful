package com.ejemplo.controller;

import com.example.API_RESTful.controller.ProductoController;
import com.example.API_RESTful.model.Producto;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Pruebas unitarias para el controlador de productos reactivo.
 * Utiliza StepVerifier para validar el flujo reactivo.
 */

@SpringBootTest
public class ProductoControllerTest {

    /**
     * Inyección del controlador de productos.
     */

    @Autowired
    private ProductoController productoController;

    /**
     * Prueba para verificar que el endpoint retorna los productos en el orden esperado.
     */

    @Test
    public void testListaProductos() {
        Flux<Producto> productos = productoController.listarProductos();

        StepVerifier.create(productos)
            .expectNextMatches(p -> p.getNombre().equals("Laptop"))
            .expectNextMatches(p -> p.getNombre().equals("Mouse"))
            .expectNextMatches(p -> p.getNombre().equals("Teclado"))
            .verifyComplete();
    }
}