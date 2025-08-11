package org.example.Head01_JavaProgrammingStart;

public class SwitchExample {
    public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            default:
                System.out.println("기타 요일");
        }
    }
}
