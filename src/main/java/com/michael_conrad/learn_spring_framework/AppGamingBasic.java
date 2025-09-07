package com.michael_conrad.learn_spring_framework;

import com.michael_conrad.learn_spring_framework.game.GameRunner;
import com.michael_conrad.learn_spring_framework.game.MarioGame;
import com.michael_conrad.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {
        var game = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
