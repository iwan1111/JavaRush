package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String filename = in.nextLine();
        FileInputStream fileInputStream = new FileInputStream(filename);
        ArrayList<Character> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int readByte = 0;
        while(fileInputStream.available()>0){

            readByte=fileInputStream.read();
            hashSet.add(readByte);
        }
        fileInputStream.close();

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);


        for (Integer a: treeSet
             ) {
            System.out.print(a + " ");
        }
    }
}
