package com.javarush.task.pro.task09.task0919;

/* 
Разворот строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        //напишите тут ваш код
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            builder.append(string.charAt(string.length()-i-1));
        }
        return builder.toString();
    }
}
