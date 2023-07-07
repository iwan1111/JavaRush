package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
���������� ������� Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;
static{
    readKeyFromConsoleAndInitPlanet();
}
    //add static block here - �������� ����������� ���� ���

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - ���������� ������� �5 ���
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
