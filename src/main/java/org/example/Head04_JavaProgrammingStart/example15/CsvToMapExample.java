package org.example.Head04_JavaProgrammingStart.example15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CsvToMapExample {
    public static void main(String[] args) {
        Map<String, Integer> stockMap = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader("./src/main/resources/stock.csv"))){
            String line;
            boolean header = true;
            while((line = br.readLine()) != null){
                if (header) {
                    header = false; // 첫 줄(헤더) 건너뛰기
                    continue;
                }
                String[] fields = line.split(",");
                String key = fields[0];
                int value = Integer.parseInt(fields[1]);
                stockMap.put(key, value);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        System.out.println("CSV로부터 로드된 Map: " + stockMap);
    }
}
