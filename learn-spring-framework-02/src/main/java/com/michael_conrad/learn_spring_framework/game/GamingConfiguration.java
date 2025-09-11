package com.michael_conrad.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {
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
