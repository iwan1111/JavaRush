package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }
    public static void main(String[] args) {
    }

    public class Thread1 extends Thread{
        @Override
        public void run() {
            try {
                while (true){this.sleep(100);}
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public class Thread2 extends Thread{
        @Override
        public void run() {
            try {
                while (true) {
                    this.sleep(100);
                }
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }

    }
    public class Thread3 extends Thread{
        @Override
        public void run() {
            try {
                while (true) {
                    this.sleep(500);
                    System.out.println("Ура");
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }

    public class Thread4 extends Thread implements Message{

        @Override
        public void run() {
            while (!isInterrupted()) {}
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }
    public class Thread5 extends Thread implements Message{
        boolean b=true;
        String input = new String();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int sum=0;
        @Override
        public void run() {
            while (b) {
                input = scanner.nextLine();
                if(input.equals("N")) {b=false;
                    for(int i = 0; i < arrayList.size(); i++)
                        sum += arrayList.get(i);
                    System.out.println(sum);
                }
                else{ try{
                    arrayList.add(Integer.parseInt(input));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                }
            }
        }

        @Override
        public void showWarning() {
            b=false;
        }
    }


}