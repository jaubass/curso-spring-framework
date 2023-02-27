package com.jaubass.cursospringframework;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService notificationService;

    public UserService (NotificationService notificationService) {
        System.out.println("Ejecutando constructor UserService");
        this.notificationService = notificationService;
    }
}
