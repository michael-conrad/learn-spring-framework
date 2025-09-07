package com.michael_conrad.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // Launch the Spring application

        var ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // Configure Spring

    }
}
