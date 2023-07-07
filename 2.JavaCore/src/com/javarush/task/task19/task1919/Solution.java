package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        List<String> lines = new ArrayList<String>();
        TreeMap<String, Double> salary = new TreeMap<>();
        String str=null;
        String fio=null;
        Double zp=null;
        Double currentValue=null;

        String[] s = new String[2];

        while(fileReader.ready()){
            s=fileReader.readLine().split(" ");
            fio=s[0];
            zp=Double.parseDouble(s[1]);

            if(salary.containsKey(fio)){
                currentValue = salary.get(fio);
                salary.put(fio, zp + currentValue);
            }
            else{
                salary.put(fio, zp);
            }
        }
        fileReader.close();
        for(String key : salary.keySet()){
            System.out.println(key + " " + salary.get(key));
        }



    }



}
