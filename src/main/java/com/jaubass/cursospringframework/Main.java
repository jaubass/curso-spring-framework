package com.jaubass.cursospringframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Saludo saludo = (Saludo) context.getBean("saludo");
        String texto = saludo.imprimirSaludo();
        System.out.println(texto);

        UserService user = (UserService) context.getBean("userService");
        texto = saludo.imprimirSaludo();
        System.out.println(user.notificationService.imprimirSaludo());

    }
}