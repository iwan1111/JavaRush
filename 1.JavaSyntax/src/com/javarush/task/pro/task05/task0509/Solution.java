package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i+1)*(j+1);
            }
            System.out.println(MULTIPLICATION_TABLE[i][0] + " " + MULTIPLICATION_TABLE[i][1] + " "
                    + MULTIPLICATION_TABLE[i][2] + " " + MULTIPLICATION_TABLE[i][3] + " " + MULTIPLICATION_TABLE[i][4]
                    + " " + MULTIPLICATION_TABLE[i][5] + " " + MULTIPLICATION_TABLE[i][6] + " " + MULTIPLICATION_TABLE[i][7]
                    + " " + MULTIPLICATION_TABLE[i][8] + " " + MULTIPLICATION_TABLE[i][9]);
        }
    }
}
