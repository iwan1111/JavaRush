package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat formatterout = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        int i=0;
        switch (args[0]){
            case "-c":
                synchronized (allPeople){
                i=1;
                while(i+2<args.length) {
                    if (args[i + 1].equals("м")) {
                        try {
                            allPeople.add(Person.createMale(args[i], formatter.parse(args[i + 2])));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            allPeople.add(Person.createFemale(args[i], formatter.parse(args[i + 2])));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println(allPeople.size() - 1);
                    i+=3;
                }
                }
                break;
            case "-i":
                synchronized (allPeople){
                i=1;
                while(i<args.length) {
                    System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE) ? "м" : "ж") + " " + formatterout.format(allPeople.get(Integer.parseInt(args[i])).getBirthDate()));
                    i++;
                }
                }
                break;
            case "-u":
                synchronized (allPeople){
                i=1;
                while(i+3<args.length) {
                    allPeople.get(Integer.parseInt(args[i])).setName(args[i+1]);
                    allPeople.get(Integer.parseInt(args[i])).setSex(args[i+2].equals("м") ? Sex.MALE : Sex.FEMALE);
                    try {
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(formatter.parse(args[i+3]));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    i+=4;
                }
                } break;
            case "-d":
                synchronized (allPeople){
                i=1;
                while(i<args.length) {
                    allPeople.get(Integer.parseInt(args[i])).setName(null);
                    allPeople.get(Integer.parseInt(args[i])).setSex(null);
                    allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                    i++;
                }
                }
                break;

        }
    }

}


///
