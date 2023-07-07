package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");

            byte [] b = new byte[text.length()];
            raf.seek(number);
            raf.read(b, 0, text.length());

            String readString = new String(b);
        raf.seek(raf.length());
            if(readString.equals(text)){
                raf.write("true".getBytes(StandardCharsets.UTF_8));
            }
            else{

                raf.write("false".getBytes(StandardCharsets.UTF_8));
            }



        raf.close();
    }
}
