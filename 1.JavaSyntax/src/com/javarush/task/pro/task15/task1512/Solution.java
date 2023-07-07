package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        //напишите тут ваш код
        outputStream.reset();
        char [] res = result.toCharArray();
        int rl = res.length;
        char [] res2 = new char[rl];

        for (int i = 0; i < rl; i++) {
            res2[i] = res[rl-i-1];
        }

        printSomething(String.valueOf(res2));
        System.out.println(outputStream);

    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}


