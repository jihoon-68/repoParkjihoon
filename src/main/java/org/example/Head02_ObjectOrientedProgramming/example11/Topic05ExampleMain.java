package org.example.Head02_ObjectOrientedProgramming.example11;

public class Topic05ExampleMain {
    public static void main(String[] args) {
        PersonalUser user1 = new PersonalUser("wlgns","ParkJiHoon", "asd@gmail.com");
        user1.printUserInfo();

        BusinessUser user2 = new BusinessUser("jihoom68","박지훈","ㅁㅁㅁ");
        user2.printUserInfo();
    }
}
