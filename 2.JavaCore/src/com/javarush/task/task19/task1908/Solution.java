package com.javarush.task.task19.task1908;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileBufferReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter fileBufferWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()));

        while(fileBufferReader.ready()){
            String string = fileBufferReader.readLine();
            String[] words = string.split(" ");
            String string2 = new String("");
            for(String word:words){
                try{
                    Integer.parseInt(word);
                    string2 = string2+ word+" ";
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            fileBufferWriter.write(string2);
            }

        bufferedReader.close();
        fileBufferReader.close();
        fileBufferWriter.close();

    }
}
