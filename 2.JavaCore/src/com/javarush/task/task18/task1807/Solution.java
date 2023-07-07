package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.Scanner;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        // Создаем поток-записи-байт-в-файл
        int count=0;

        while(inputStream.available() > 0) {
            //читаем весь файл одним куском

            //int count = inputStream.read(buffer);
            //outputStream.write(buffer, 0, count);
            int b = inputStream.read();
            if (b == 44) count++;

        }
        System.out.println(count);
        inputStream.close();

    }
}
