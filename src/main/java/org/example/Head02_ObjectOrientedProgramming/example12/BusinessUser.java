package org.example.Head02_ObjectOrientedProgramming.example12;

public class BusinessUser extends User {
    private String companyName;
    private String companyNumber;

    public BusinessUser(String userId, String userName,String companyName, String companyNumber) {
        super(userId,userName);
        this.companyName = companyName;
        this.companyNumber = companyNumber;
    }


    @Override
    public void printUserInfo() {
        System.out.println("==========================");
        super.printUserInfo();
        System.out.println("회사명: "+ companyName);
        System.out.println("회사 전화번호: " + companyNumber);
        System.out.println("==========================");
    }

}
