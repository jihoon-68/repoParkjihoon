package org.example.Head04_JavaProgrammingStart.example17;

public class GameMain {
    public static void main(String[] args) {
        GameState gameState = new GameState("park");
        GameState.save(gameState,  "save01.src");
        System.out.println(GameState.load("save01.src"));
    }
}
