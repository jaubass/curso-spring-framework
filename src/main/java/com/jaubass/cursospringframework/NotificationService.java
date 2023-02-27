package com.jaubass.cursospringframework;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public String imprimirSaludo() {
        return "Este es mi primer proyecto con Spring";
    }
}
