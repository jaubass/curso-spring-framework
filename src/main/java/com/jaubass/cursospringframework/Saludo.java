package com.jaubass.cursospringframework;

import org.springframework.stereotype.Component;

@Component
public class Saludo {

    public String imprimirSaludo() {
        return "Hola Mundo! by Jaubass with Maven and Spring";
    }

}
