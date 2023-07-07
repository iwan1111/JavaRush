package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String src = scanner.nextLine();
        try {
            List<String> readText = Files.readAllLines(Path.of(src));
            for (int i = 0; i < readText.size(); i+=2) {

                System.out.println(readText.get(i));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

