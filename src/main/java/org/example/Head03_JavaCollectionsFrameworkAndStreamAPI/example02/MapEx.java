package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example02;

import java.util.HashMap;
import java.util.Map;
public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> mpairs = new HashMap<>();

        mpairs.put("kim", 1);
        mpairs.put("Lee", 2);
        mpairs.put("Pakr", 3);
        System.out.println(mpairs);

        mpairs.put("kim", 4);
        System.out.println(mpairs);

        int vel = mpairs.get("kim");
        System.out.println(vel);

        mpairs.remove("kim");
        System.out.println(mpairs);

        System.out.println(mpairs.keySet());
    }
}
