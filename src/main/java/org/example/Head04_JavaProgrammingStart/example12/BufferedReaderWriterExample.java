package org.example.Head04_JavaProgrammingStart.example12;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        try(BufferedReader br= new BufferedReader(new FileReader("./src/main/resources/example.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/main/resources/output.txt"))){
            bw.write("Hello World I/O");
            bw.newLine();
            bw.write("Using BufferedWriter for better performance");
            bw.newLine();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
