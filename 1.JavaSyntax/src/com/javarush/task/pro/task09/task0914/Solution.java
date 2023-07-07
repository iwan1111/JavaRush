package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int start=0, end=0;
        start=path.indexOf("jdk");
        end=path.indexOf("/",start);
        return path.substring(0, start) + jdk + path.substring(end);
    }
}
