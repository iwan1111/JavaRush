package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;
        PersonScannerAdapter(Scanner scanner){
            this.fileScanner=scanner;
        }

        @Override
        public Person read() throws IOException {
            String string = this.fileScanner.nextLine();
            String[] pers;
            pers = string.split(" ");

            Date date = new Date(Integer.parseInt(pers[5])- 1900,Integer.parseInt(pers[4])-1,Integer.parseInt(pers[3]));
            new Date();
            return new Person(pers[1],pers[2],pers[0],date);
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
