package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;
static{
    readKeyFromConsoleAndInitPlanet();
}
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        switch (string) {
            case Planet.SUN: thePlanet = Sun.getInstance(); break;
            case Planet.EARTH: thePlanet = Earth.getInstance();break;
            case Planet.MOON: thePlanet = Moon.getInstance();break;
            default: thePlanet = null; break;
            }
        }
}
