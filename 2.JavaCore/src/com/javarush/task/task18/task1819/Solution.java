package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.Scanner;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename1 = scanner.nextLine();
        String filename2 = scanner.nextLine();
        FileInputStream fileInputStream1 = new FileInputStream(filename1);
        byte[] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer1);
        FileOutputStream fileOutputStream = new FileOutputStream(filename1);
        FileInputStream fileInputStream2 = new FileInputStream(filename2);
        byte[] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer2);
        fileOutputStream.write(buffer2);
        fileOutputStream.write(buffer1);
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();
    }
}
