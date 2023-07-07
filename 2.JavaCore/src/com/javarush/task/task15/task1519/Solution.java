package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
������ ������ ��� ������ �����
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //������� ��� ��� ���
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        while(!string.equals("exit")){
            try {
                if (string.contains(".")) {

                    print(Double.parseDouble(string));
                } else {if (Integer.parseInt(string) > 0 && Integer.parseInt(string) < 128) {
                    print((short) Integer.parseInt(string));
                } else  {
                    print(Integer.parseInt(string));
                }}
            }
            catch (Exception e){
             print(string);
            }
            string = scanner.nextLine();
        }

    }

    public static void print(Double value) {
        System.out.println("��� ��� Double, �������� " + value);
    }

    public static void print(String value) {
        System.out.println("��� ��� String, �������� " + value);
    }

    public static void print(short value) {
        System.out.println("��� ��� short, �������� " + value);
    }

    public static void print(Integer value) {
        System.out.println("��� ��� Integer, �������� " + value);
    }
}
