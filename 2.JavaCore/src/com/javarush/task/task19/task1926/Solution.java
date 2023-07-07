package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename= bufferedReader.readLine();
        BufferedReader file = new BufferedReader(new FileReader(filename));

        while(file.ready()){
            String str = file.readLine();
            System.out.println(new StringBuilder(str).reverse().toString());
        }
        bufferedReader.close();
        file.close();
    }
}
