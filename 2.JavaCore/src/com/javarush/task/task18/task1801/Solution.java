package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String filename = in.nextLine();
        FileInputStream fileInputStream = new FileInputStream(filename);
        int maxByte = 0;
        int readByte = 0;
        while(fileInputStream.available()>0){
            readByte = fileInputStream.read();
            if(readByte>maxByte)maxByte=readByte;
        }
        System.out.println(maxByte);
        fileInputStream.close();

    }
}
