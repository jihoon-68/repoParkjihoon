package org.example.Head04_JavaProgrammingStart.example16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ObjectReadExample {
    public static void main(String[] args){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/main/resources/user.ser"))){
            User lode = (User) ois.readObject();
            System.out.println("역직렬화된 객체: " + lode );
        }catch(IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
