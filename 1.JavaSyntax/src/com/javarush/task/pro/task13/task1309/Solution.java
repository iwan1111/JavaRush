package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Сергей", 1.);
        grades.put("Сергей1", 1.);
        grades.put("Сергей2", 1.);
        grades.put("Сергей3", 1.);
        grades.put("Сергей4", 1.);

    }
}
