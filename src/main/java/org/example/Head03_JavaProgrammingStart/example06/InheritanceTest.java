package org.example.Head03_JavaProgrammingStart.example06;

public class InheritanceTest {
    public static void main(String[] args) {
        User pu = new PersonalUser("jihoon","박지휸",26,"밀양");
        pu.printUserInfo();
        System.out.println();
        User bu = new BusinessUser("Park01","홍길동","네이버","010-1234-5678");
        bu.printUserInfo();
    }
}
