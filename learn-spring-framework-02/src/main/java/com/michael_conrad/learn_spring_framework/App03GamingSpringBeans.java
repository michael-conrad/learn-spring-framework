package com.michael_conrad.learn_spring_framework;

import com.michael_conrad.learn_spring_framework.game.GamingConsole;
import com.michael_conrad.learn_spring_framework.game.MarioGame;
import com.michael_conrad.learn_spring_framework.game.PacmanGame;
import com.michael_conrad.learn_spring_framework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class App03GamingSpringBeans {

    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
            var gameRunner = ctx.getBean(GameRunner.class);
            gameRunner.run();
        }
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

    @Bean
    public MarioGame marioGame() {
        return new MarioGame();
    }

    @Bean
    @Primary
    public SuperContraGame superContraGame() {
        return new SuperContraGame();
    }

    @Bean
    public PacmanGame pacmanGame() {
        return new PacmanGame();
    }
}
