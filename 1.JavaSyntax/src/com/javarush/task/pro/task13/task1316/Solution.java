package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest [] jq = JavarushQuest.values();

        for (JavarushQuest jq1: jq)
            System.out.println(jq1.ordinal());

    }
}
