package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        while(Files.isRegularFile(Path.of(str.toString())) || Files.isDirectory(Path.of(str.toString()))){
            if(Files.isRegularFile(Path.of(str.toString()))){
                System.out.println(str + THIS_IS_FILE);
            }
            if(Files.isDirectory(Path.of(str.toString()))){
                System.out.println(str + THIS_IS_DIR);
            }
            str.delete(0,str.length());
            str.append(scanner.nextLine());
        }
    }
}

