package com.jaubass.cursospringframework;

public class UserService {

    NotificationService notificationService;

    public UserService (NotificationService notificationService) {
        System.out.println("Ejecutando constructor NotificationService");
        this.notificationService = notificationService;
    }
}
