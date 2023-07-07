package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код

        Scanner in = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = in.nextLine();


        in.close();

        try (FileInputStream fis = new FileInputStream(path);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
             ArrayList<Integer> data = new ArrayList<Integer>();
             while (br.ready()) {
                 data.add(Integer.parseInt(br.readLine()));
             }
            //data.stream().filter(i->(data.get(i) % 2) == 0).sorted().forEach(s->System.out.println(s));
            data.stream().filter(d->d.intValue()%2==0).sorted().forEach(s->System.out.println(s));

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }
}
