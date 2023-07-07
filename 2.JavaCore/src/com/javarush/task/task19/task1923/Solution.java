package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new FileReader(args[0]));
        List<String> ns = new ArrayList<>();
        String[] buff;
        FileWriter bw = new FileWriter(args[1]);

        while (bufferedReader.ready()){
            buff = bufferedReader.readLine().split(" ");
            for(String s:buff){
                if (s.matches(".*[0-9].*")) {bw.write(s+" ");}
            }
        }
        bw.close();

        bufferedReader.close();
    }
}
