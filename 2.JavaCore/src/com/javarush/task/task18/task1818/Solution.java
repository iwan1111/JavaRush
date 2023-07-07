package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename1 = scanner.nextLine();
        String filename2 = scanner.nextLine();
        String filename3 = scanner.nextLine();

        FileOutputStream OutputStream1 = new FileOutputStream(filename1);
        FileInputStream fileReader2 = new FileInputStream(filename2);
        FileInputStream fileReader3 = new FileInputStream(filename3);

        while (fileReader2.available()>0){
            int i;
            i=fileReader2.read();
            OutputStream1.write(i);
        }
        while (fileReader3.available()>0){
            int i;
            i=fileReader3.read();
            OutputStream1.write(i);
        }
        OutputStream1.close();
        fileReader2.close();
        fileReader3.close();
    }
}
