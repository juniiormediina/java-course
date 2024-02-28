package com.bancolombia.rest.product.controller.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Indica que la clase va a funcionar como un rest api
@RestController
// indica el mapeo de la URL (direccion donde se va a alojar el servicio)
@RequestMapping("/api/v1/calculadora")
public class CalculadoraController {

    @GetMapping("/sumar")
    public int sumar(@RequestParam int valor1, @RequestParam int valor2) {
        return valor1 + valor2;
    }

    @GetMapping
    public String returnHi() {
        return "Hi I am from Bancolombia";
    }

}
