package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int min = a<b?a:b;
        int nod=1;

        for (int i = 1; i <= min; i++) {
            if(a%i==0 && b%i==0){nod=i;}
        }
        System.out.println(nod);
    }
}
