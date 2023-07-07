package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = null;
        String fileName2 = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            fileName1 = bufferedReader.readLine();
            fileName2 = bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileReader fileReader1=null;
        try {
            fileReader1 = new FileReader(fileName1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        FileWriter fileWriter2 = null;
        try {
            fileWriter2 = new FileWriter(fileName2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i=1;
        try {
        while (fileReader1.ready()){
                int data = fileReader1.read(); //читаем один символ (char будет расширен до int)
                if(i%2==0) fileWriter2.write(data);
                i++;
            }
            fileReader1.close();
            fileWriter2.close();

        } catch (IOException e) {
        e.printStackTrace();
        }


    }
}
