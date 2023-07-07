package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        while(bufferedReader.ready()){
            String str;

            str=bufferedReader.readLine();

            String date = str.replaceAll("[^а-яА-Я -]", "");
            String name = str.replaceAll("[^0-9 ]", "");


            name=name.trim();
            date=date.trim();
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
            PEOPLE.add(new Person(name, formatter.parse(date)));
        }
        bufferedReader.close();
    }
}
