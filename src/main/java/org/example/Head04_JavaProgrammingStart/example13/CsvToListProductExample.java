package org.example.Head04_JavaProgrammingStart.example13;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CsvToListProductExample {
    public static void main(String[] args) {
        /*
        List<Product> products = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("./src/main/resources/products.csv"))){
            String line;
            boolean header = true;
            while((line = br.readLine()) != null){
                if(header){
                    header = false;
                    continue;
                }
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                int price = Integer.parseInt(fields[2]);
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }

        System.out.println("CSV로부터 로드된 Product List: " + products);
        */

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("./src/main/resources/products.csv"))){
            bw.write("오류방지 해더 입니다");
            bw.newLine();
            Product[] products = new Product[] {
                    new Product(4,"Carrot",500),
                    new Product(5,"Potato",200),
                    new Product(6,"Pear",10000),
            };
            for(Product p : products){
                bw.write(p.getId() + "," + p.getName() + "," + p.getPrice());
                bw.newLine();
            }

        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
