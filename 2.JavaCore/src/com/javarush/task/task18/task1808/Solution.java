package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.Scanner;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        String file3 = scanner.nextLine();
        FileInputStream finpup1 = new FileInputStream(file1);
        byte[] buff = new byte[finpup1.available()];
        finpup1.read(buff);
        FileOutputStream poutput2 = new FileOutputStream(file2);
        FileOutputStream poutput3 = new FileOutputStream(file3);

        int b = buff.length;
        b = (b+1)/2;

        poutput2.write(buff, 0,b);
        poutput3.write(buff, b, buff.length/2);
        finpup1.close();
        poutput2.close();
        poutput3.close();



    }
}
