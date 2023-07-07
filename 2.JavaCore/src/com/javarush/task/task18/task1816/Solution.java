package com.javarush.task.task18.task1816;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(args[0]);
        int simbol;
        int counter=0;
        while(fileReader.ready()){
            simbol = fileReader.read();

            if ((simbol >= 'A' && simbol <= 'Z') || (simbol >= 'a' && simbol <= 'z')){
                counter++;
            }

        }

        System.out.println(counter);
        fileReader.close();
    }
}
