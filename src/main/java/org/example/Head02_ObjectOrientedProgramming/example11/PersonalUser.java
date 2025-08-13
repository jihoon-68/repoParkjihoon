package org.example.Head02_ObjectOrientedProgramming.example11;

public class PersonalUser extends User{
    private String personaEmail;

    public PersonalUser(String userId,String name,String personaEmail) {
        super(userId,name);
        this.personaEmail = personaEmail;
    }

    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("개인 이메일: " + personaEmail);
    }
}
