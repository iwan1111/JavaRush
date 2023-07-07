package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat formatterout = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]){
            case "-c": if(args[2].equals("м")) {
                try {
                    allPeople.add(Person.createMale(args[1], formatter.parse(args[3])));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            } else {try {
                allPeople.add(Person.createFemale(args[1], formatter.parse(args[3])));
            } catch (ParseException e) {
                e.printStackTrace();
            }}

                System.out.println(allPeople.size()-1);break;
            case "-r": System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() +" " + (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)?"м":"ж")+ " " + formatterout.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));break;
            case "-u": allPeople.get(Integer.parseInt(args[1])).setName(args[2]); allPeople.get(Integer.parseInt(args[1])).setSex(args[3].equals("м")?Sex.MALE:Sex.FEMALE);
                try {
                    allPeople.get(Integer.parseInt(args[1])).setBirthDate(formatter.parse(args[4]));
                } catch (ParseException e) {
                    e.printStackTrace();
                } break;
            case "-d": allPeople.get(Integer.parseInt(args[1])).setName(null); allPeople.get(Integer.parseInt(args[1])).setSex(null); allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);break;
        }
    }
}
