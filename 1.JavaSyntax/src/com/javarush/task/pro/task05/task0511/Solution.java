package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        multiArray= new int[a][];

        for (int i = 0; i < a; i++) {
            multiArray[i] = new int[console.nextInt()];
        }

    }
}
