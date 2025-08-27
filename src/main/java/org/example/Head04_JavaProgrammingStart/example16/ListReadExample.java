package org.example.Head04_JavaProgrammingStart.example16;

import com.sun.jdi.ClassNotLoadedException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ListReadExample {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/main/resources/user.ser"))){
            List<User> lode = (List<User>) ois.readObject();
            System.out.println("역직렬화된 리스트:");
            for(User u : lode){
                System.out.println(u);
            }

        }catch(IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
