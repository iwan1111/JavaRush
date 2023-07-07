package com.javarush.task.task18.task1810;

import java.io.*;
import java.util.Scanner;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner scanner = new Scanner(System.in);
        String filename;
        FileInputStream fileInputStream;
        do {
            filename=scanner.nextLine();
            fileInputStream = new FileInputStream(filename);
        }while (fileInputStream.available()>=1000);
        fileInputStream.close();
        throw new DownloadException();
    }

    public static class DownloadException extends Exception {

    }
}
