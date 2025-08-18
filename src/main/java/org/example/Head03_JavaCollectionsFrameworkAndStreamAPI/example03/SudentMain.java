package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example03;
import java.util.Scanner;
public class SudentMain {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        Boolean run = true;

        while (run){
            System.out.println("=== 메뉴 ===");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 보기");
            System.out.println("4. 학생 점수 조회");
            System.out.println("5. 종료");
            System.out.println("선택: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("이름 입력: ");
                    String studentName = sc.next();
                    System.out.println("나이 입력: ");
                    int studentAge = sc.nextInt();
                    System.out.println("학번 입력: ");
                    int studentId = sc.nextInt();
                    System.out.println("점수 입력: ");
                    int studentScore = sc.nextInt();
                    Student student = new Student(studentName,studentAge,studentId);
                    studentManager.addStudent(student,studentScore);
                    break;
                case 2:
                    System.out.println("이름 입력: ");
                    String deleteName = sc.next();
                    studentManager.removeStudent(deleteName);
                    break;
                case 3:
                    studentManager.printAllStudents();
                    break;
                case 4:
                    System.out.println("학생 이름: ");
                    String searchName = sc.next();
                    studentManager.printScore(searchName);
                    break;
                case 5:
                    run = false;
                    System.out.println("[Info] 프로그램을 종료합니다. ");
                    break;
                default:
                    System.out.println("[Error] 잘못된 입력입니다.");
            }
        }
        sc.close();
    }
}
