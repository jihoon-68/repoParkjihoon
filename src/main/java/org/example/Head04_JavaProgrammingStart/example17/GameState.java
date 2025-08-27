package org.example.Head04_JavaProgrammingStart.example17;

import org.example.Head04_JavaProgrammingStart.example16.User;

import java.io.*;
import java.time.LocalDateTime;

public class GameState implements Serializable {
    private String playerName;
    private int  level;
    private int  experience;
    private int  gold;
    private LocalDateTime saveTime;

    private transient boolean gameOver;
    private transient int fps;

    public GameState(String playerName) {
        this.playerName = playerName;
        this.level = 1;
        this.experience = 0;
        this.gold = 100;
        this.saveTime = LocalDateTime.now();
    }

    public String toString(){
        return playerName;
    }



    public static void save(GameState state, String filename) {
        try(ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream("./src/main/resources/"+filename))){
            oos.writeObject(state);
            System.out.println("게임이 저장되었습니다: " + filename);
        }catch (IOException e){
            System.err.println("저장 실패: " + e.getMessage());
        }
    }

    public static GameState load(String filename) {
        try(ObjectInputStream ois = new  ObjectInputStream(new FileInputStream("./src/main/resources/"+filename))) {
            return (GameState) ois.readObject();
        }catch(IOException | ClassNotFoundException e){
            System.err.println("게임 불러오기 실패: " + e.getMessage());
            return null;
        }
    }


}
