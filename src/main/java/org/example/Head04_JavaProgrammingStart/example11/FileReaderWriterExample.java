package org.example.Head04_JavaProgrammingStart.example11;

import java.io.*;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("./src/main/resources/example.txt")){
            int data;
            while ((data = fr.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileWriter fw = new FileWriter("./src/main/resources/output.txt")){
            String content ="Hello File I/O";
            for(char c : content.toCharArray()){
                fw.write(c);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
