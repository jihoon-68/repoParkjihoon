package org.example.Head04_JavaProgrammingStart.example16;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "User{" + "name=" + name + ", age=" + age + '}';
    }
}
