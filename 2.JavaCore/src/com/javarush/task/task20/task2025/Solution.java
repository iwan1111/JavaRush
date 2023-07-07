package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Алгоритмы-числа
*/

public class Solution {

    public static long[] getNumbers(long N) {

        List<Long> res = new ArrayList<Long>();
        for(long i=1; i<N; i++) {
            if (check(i)){
                res.add(i);
            }
        }
        if(res.size()==0) return new long[]{(long) 0};
        long[] result = new long[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }

    private static boolean check(long b)
    {
        int M = String.valueOf(b).length();

        String n = Long.toString(b);
        char[] charArray = n.toCharArray();
        ArrayList<Integer> cia = new ArrayList<Integer>();

        for (int i = 0; i<M; i++){
            int c = Character.getNumericValue(charArray[i]);
            cia.add(c);
        }

        Long a = Long.valueOf(0);
        for (Integer c: cia) a += (long) Math.pow(c, M);
        if(a == b){return true;}
        else return false;
    }
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
