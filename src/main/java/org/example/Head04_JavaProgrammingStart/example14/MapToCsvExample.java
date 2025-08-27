package org.example.Head04_JavaProgrammingStart.example14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapToCsvExample {
    public static void main(String[] args){
        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("apple", 10);
        stockMap.put("banana", 20);
        stockMap.put("cherry", 30);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/stock.csv"))){
            bw.write("key,value");
            bw.newLine();

            for(Map.Entry<String, Integer> entry : stockMap.entrySet()){
                String key = entry.getKey();
                Integer value = entry.getValue();

                if(key.contains(",") || key.contains("\"") || key.contains("\n")) {
                    key = "\"" + key.replace("\"", "\"\"") + "\"";
                }

                bw.write(key + "," + value);
                bw.newLine();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
