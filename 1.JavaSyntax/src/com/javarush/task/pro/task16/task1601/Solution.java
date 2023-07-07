package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
???? ?? ?? ? ??????????? :)
*/

public class Solution {

    static Date birthDate = new Date(79, 4,8);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {


        Locale rus = new Locale("ru", "RU");
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE", rus);
        return formatter.format(date);


    }
}
