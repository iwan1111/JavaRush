package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String src = scanner.nextLine();
        String dest = scanner.nextLine();

        try(InputStream input=Files.newInputStream(Path.of(src));
            OutputStream output=Files.newOutputStream(Path.of(dest))){
            while (input.available() > 0)
            {
                int byte1 = input.read();
                int byte2 = input.read();
                if(byte2!=-1){
                    output.write(byte2);
                    output.write(byte1);
                }
                else {
                    output.write(byte1);
                }

            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        

    }

}

