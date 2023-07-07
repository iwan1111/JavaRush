package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/


public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String src = scanner.nextLine();
        try {
            List<String> readText = Files.readAllLines(Path.of(src));
            for (String str : readText) {
                System.out.println(str.replaceAll("[,. ]", ""));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


