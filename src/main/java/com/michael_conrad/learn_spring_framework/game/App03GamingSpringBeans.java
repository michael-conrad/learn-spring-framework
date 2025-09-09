package com.michael_conrad.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            var gameRunner = ctx.getBean(GameRunner.class);
            gameRunner.run();
        }
    }
}
