package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example03;

import java.util.*;

public class StudentManager {
    private List<Student> students;
    private Set<String> studentNames;
    private Map<String, Integer> scoreMap;

    public StudentManager() {
        students = new ArrayList<>();
        studentNames = new HashSet<>();
        scoreMap = new HashMap<>();
    }

    public void addStudent(Student student, int score) {
        System.out.println("=====학생 등록=====");
        // 중복 이름 체크
        if (studentNames.contains(student.getName())){
            System.out.println("[Error] 이미 존재하는 학생 이름입니다.");
            return;
        }

        // 등록
        students.add(student);
        studentNames.add(student.getName());
        scoreMap.put(student.getName(), score);
        System.out.println("[Info] 새로운 학생이 등록되었습니다: Student "+student);
    }

    public void removeStudent(String name) {
        System.out.println("=====학생 등록 취소=====");
        // 이름을 통해 학생 찾기
        Student target =null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                target = student;
                break;
            }
        }
        if (target != null) {
            students.remove(target);
            studentNames.remove(name);
            scoreMap.remove(name);
            System.out.println("[Info] 학생이 삭제 되었습니다: " + name);
        }else {
            System.out.println("[Error] 해당 이름의 학생을 찾을 수 없습니다.");
        }

    }

    public void printAllStudents() {
        System.out.println("=== 학생 목록 ===");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printScore(String name) {
        Integer score = scoreMap.get(name);
        System.out.println("=====학생 점수 조회=====");
        if (score != null) {
            System.out.println("[Info] " + name + "의 점수: " + score);
        }else {
            System.out.println("[Error] 해당 이름의 학생을 찾을 수 없습니다.");
        }
    }
}
