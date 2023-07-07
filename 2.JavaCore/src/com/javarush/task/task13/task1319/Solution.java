package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код

        Scanner in = new Scanner(System.in);
        String path = in.nextLine();


        StringBuilder outputstring = new StringBuilder();


        try (FileOutputStream fos = new FileOutputStream(path);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw)) {

            while (!outputstring.toString().equals("exit")) {

                outputstring = new StringBuilder(in.nextLine());
                bw.write(String.valueOf(outputstring+"\n"));
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        in.close();
    }
}
