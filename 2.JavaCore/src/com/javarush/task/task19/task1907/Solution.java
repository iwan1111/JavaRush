package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedReader fileBufferReader = new BufferedReader(new FileReader(fileName));
        int i=0;
        while(fileBufferReader.ready()){
            String str=fileBufferReader.readLine();
            String[] words = str.split("\\W");
            for(String s:words) {
                 if(s.equals("world")) i++;
            }
        }
        System.out.println(i);
        bufferedReader.close();
        fileBufferReader.close();
    }
}
