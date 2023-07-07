package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String[] strings = new String[2];
        TreeMap<String, Double> ved = new TreeMap<>();
        String name=null;
        Double zp=null;
        while (bufferedReader.ready()){
            strings=bufferedReader.readLine().split(" ");
            name = strings[0];
            zp = Double.parseDouble(strings[1]);
            if(ved.containsKey(name)) {ved.put(name, ved.get(name)+zp);}
            else ved.put(name, zp);
        }
        double max = ved.firstEntry().getValue();
        for (double value : ved.values()) {
            if (value > max) {
                max = value;
            }
        }
        TreeSet<String> names = new TreeSet<>();
        for (String name1 : ved.keySet()) {
            if (max == ved.get(name1)) {
                names.add(name1);
            }
        }

        for (String name1 : names) {
            System.out.println(name1);
        }
        bufferedReader.close();

    }
}
