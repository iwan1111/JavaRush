package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String filename = bf.readLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        while (bufferedReader.ready()) {
            int counter = 0;
            String string = bufferedReader.readLine();
            String[] splitedReadedString = string.split(" ");
                for (String s : splitedReadedString) {
                    if (words.contains(s)) {
                        counter++;
                    }
                }

            if (counter == 2) {
                System.out.println(string);
            }
        }
        bufferedReader.close();
        bf.close();
    }
}
