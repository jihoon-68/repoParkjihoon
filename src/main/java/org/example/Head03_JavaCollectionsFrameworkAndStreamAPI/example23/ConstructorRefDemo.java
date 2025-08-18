package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example23;
@FunctionalInterface
interface PersonFactory{
    Person create(String name, int age);
}
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        // 일반 람다
        // PersonFactory factory1 = (n, a) -> new Person(n, a);

        // 생성자 참조
        PersonFactory factory2 = Person::new;

        // 익명 클래스
//        PersonFactory factory3 = new PersonFactory() {
//            @Override
//            public Person create(String name, int age) {
//                return new Person(name, age);
//            }
//        };

        Person p1 = factory2.create("kim",20);
        System.out.println("Created Person -> name: " + p1.name + ", age: " + p1.age);
    }
}
