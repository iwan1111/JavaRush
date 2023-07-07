package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        FileInputStream finput1 = new FileInputStream(file1);
        byte[] buff = new byte[finput1.available()];
        finput1.read(buff);
        FileOutputStream poutput2 = new FileOutputStream(file2);
        int size = buff.length;

        for (int i = size; i > 0 ; i--) {
            poutput2.write(buff[i-1]);
        }

        finput1.close();
        poutput2.close();


    }
}
