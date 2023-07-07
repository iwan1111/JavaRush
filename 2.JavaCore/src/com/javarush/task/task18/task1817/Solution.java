package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        int total=0;
        int spaces=0;
        int ch;
        while (fileReader.ready()){
            ch = fileReader.read();
            total++;
            if(ch==' ') spaces++;
        }


        double round = (double) spaces / total * 100;
        System.out.printf("%.2f", round);

        fileReader.close();

    }
}
