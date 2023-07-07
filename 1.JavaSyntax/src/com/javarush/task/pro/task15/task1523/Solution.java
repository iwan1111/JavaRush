package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        //напишите тут ваш код
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        OutputStream output = connection.getOutputStream();
        PrintStream sender = new PrintStream(output);
        sender.println("Привет");

        InputStream input = connection.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        System.out.println(reader);

        while (reader.ready()) {
            System.out.println(reader.readLine());
        }




    }
}

