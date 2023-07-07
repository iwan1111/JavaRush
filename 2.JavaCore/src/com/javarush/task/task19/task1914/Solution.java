package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        String[] str;
        str=outputStream.toString().split(" ");
        int a = Integer.valueOf(str[0]);
        int b = Integer.valueOf(str[2]);
        int c=0;
        switch (str[1]){
            case "+": c=a+b; break;
            case "-": c=a-b; break;
            case "*": c=a*b; break;
        }
        System.setOut(consoleStream);
        System.out.println(str[0] + " " + str[1] + " " + str[2] + " " + str[3] + " " + c);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

