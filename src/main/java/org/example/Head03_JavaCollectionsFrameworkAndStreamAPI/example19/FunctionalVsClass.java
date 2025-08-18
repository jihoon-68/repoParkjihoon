package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example19;

class Greeter{
    private final String prefix; // 상태를 가질 수 있음

    public Greeter(String prefix) {
        this.prefix = prefix;
    }

    public void greet(String name) { // 메서드 여러개 가능
        System.out.println(prefix + " " + name);
    }
}



@FunctionalInterface
interface StringAction {
    // 추상 메서드가 단 하나만 있어야 함수형 인터페이스 성립
    void run(String input);

    // default/static 메서드는 몇 개 있어도 상관 없음 -> 메서드 숫자에 카운트되지 않음
    default void info() {
        System.out.println("[Info] StringAction default method");
    }
    static void help() {
        System.out.println("[Help] This is a helper.");
    }
}

// 컴파
@FunctionalInterface
interface Broken {
    //void a();
    void b();
}

public class FunctionalVsClass {
    public static void main(String[] args) {
        // 일반 클래스 사용
        Greeter greeter = new Greeter("Hello");
        greeter.greet("Kim"); // 상태(prefix)를 내부에 유지 가능

        //함수형 인터페이스 구현체 1 - 익명 클래스
        StringAction printUpper1 = new StringAction() {
            @Override
            public void run(String input) {
                System.out.println(input.toUpperCase());
            }
        };

        //함수형 인터페이스 구현체 2 - 람다
        StringAction printUpper2 = s -> System.out.println(s.toUpperCase());

        printUpper1.run("hello");
        printUpper2.run("world");
    }
}