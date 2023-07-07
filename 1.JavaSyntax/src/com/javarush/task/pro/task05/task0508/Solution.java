package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        strings = new String[6];
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            strings[i]=console.nextLine();
        }

        for (int i = 0; i < 6; i++) {
            String a = strings[i];
            for (int j = 1; j < 6; j++) {
                 if( a!=null && a.equals(strings[j]) && i!=j)
                 {
                     strings[i]=null;
                     strings[j]=null;
                 }
            }

        }



        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
