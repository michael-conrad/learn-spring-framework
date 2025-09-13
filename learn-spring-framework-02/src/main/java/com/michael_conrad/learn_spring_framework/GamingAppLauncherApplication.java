package com.michael_conrad.learn_spring_framework;

import com.michael_conrad.learn_spring_framework.game.GameRunner;
import com.michael_conrad.learn_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            var gameRunner = ctx.getBean(GameRunner.class);
            gameRunner.run();
        }
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
