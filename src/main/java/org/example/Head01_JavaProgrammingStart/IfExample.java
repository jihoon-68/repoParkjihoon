package org.example.Head01_JavaProgrammingStart;

public class IfExample {
    public static void main(String[] args) {
        int score =92;

        if(score>=90){
            System.out.println("A학점");
        } else if (score >=80) {
            System.out.println("B학점");
        }else{
            System.out.println("C학점 이하");
        }
    }
}
