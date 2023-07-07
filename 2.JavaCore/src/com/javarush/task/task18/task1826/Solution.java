package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    String fileName = args[1];
    String fileOutputName = args[2];
    FileInputStream fileInputStream = new FileInputStream(args[1]);
    FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
    //-e кодирование - прибавляем 1
    int i=0;
    if(args[0].equals("-e")) {
        while ((i = fileInputStream.read()) != -1) {
            fileOutputStream.write(i + 1);
        }
    }
    if(args[0].equals("-d")) {
        while ((i = fileInputStream.read()) != -1) {
            fileOutputStream.write(i - 1);
        }
    }

    fileInputStream.close();
    fileOutputStream.close();

    }

}
