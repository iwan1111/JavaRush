package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишите тут ваш код
        int bin=0;

        while (decimalNumber!=0){
            bin = decimalNumber%2;
            decimalNumber = decimalNumber/2;
        }
        return String.valueOf(bin);
    }

    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        int dec=0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            dec= (int) (dec+(int)(binaryNumber.charAt(binaryNumber.length()-i))*Math.pow(2,i));
        }
        return dec;
    }
}
