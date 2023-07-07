package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        array = new int[N];

        int min = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            array[i]=console.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (array[i] > min)
                min = array[i];
        }

        System.out.println(min);
    }
}
