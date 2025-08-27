package org.example.Head04_JavaProgrammingStart.example16;

import java.io.*;

public class ObjectWriteExample {
    public static void main(String[] args) {
        User user = new User("Alice", 30);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/main/resources/user.ser"))){
            oos.writeObject(user);
            System.out.println("직렬화 완료: user.ser");
            oos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
