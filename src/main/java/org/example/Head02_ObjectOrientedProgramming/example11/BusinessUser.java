package org.example.Head02_ObjectOrientedProgramming.example11;

public class BusinessUser extends User{
    private String companyName;

    public BusinessUser(String userId, String name, String companyName){
        super(userId, name);
        this.companyName = companyName;
    }

    public void printUserInfo(){
        super.printUserInfo();
        System.out.println("회사명" + companyName);
    }
}
