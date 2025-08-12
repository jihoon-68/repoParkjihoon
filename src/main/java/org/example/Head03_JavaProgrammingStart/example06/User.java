package org.example.Head03_JavaProgrammingStart.example06;

public class User {
    protected String userId;
    protected String userName;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public void printUserInfo() {
        System.out.println("유저 아이디: " + userId);
        System.out.println("유저 아이디: " + userId);
    }
}