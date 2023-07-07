package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String filename = in.nextLine();
        FileInputStream fileInputStream = new FileInputStream(filename);
        ArrayList<Character> arrayList = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int readByte = 0;
        while(fileInputStream.available()>0){

            readByte=fileInputStream.read();
            if(hashMap.containsKey(readByte)) hashMap.put(readByte, hashMap.get(readByte)+1);
            else hashMap.put(readByte, 1);
        }
        fileInputStream.close();
        int maxvalue = Collections.min(hashMap.values());
        List<Integer> maxKey = hashMap.entrySet().stream().filter(entry -> entry.getValue()==maxvalue).map(Map.Entry::getKey).collect(Collectors.toList());
        for (Integer i: maxKey ) {

            System.out.print(i.byteValue() + " ");
        }

    }
}
