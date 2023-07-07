package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        String type = new String();
        if(o instanceof Cat) type = "Кошка";
        if(o instanceof Bird) type = "Птица";
        if(o instanceof Dog) type = "Собака";
        if(o instanceof Lamp) type = "Лампа";
        System.out.println(type);
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
