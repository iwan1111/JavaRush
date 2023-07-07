package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));

        String comma="";
        while (bufferedReader.ready()){
            String[] s = bufferedReader.readLine().split(" ");
            for(String str: s){
                if(str.length()>6)
                {
                    bufferedWriter.write(comma+str);
                    comma=",";
                }
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
