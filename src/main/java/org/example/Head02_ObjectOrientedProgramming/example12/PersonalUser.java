package org.example.Head02_ObjectOrientedProgramming.example12;

public class PersonalUser extends User {
    private int age;
    private String region;

    public PersonalUser(String userId, String userName, int age, String region) {
        super(userId,userName);
        this.age = age;
        this.region = region;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("유저 나이: " +age);
        System.out.println("유저 지역: " +region);
    }
}
