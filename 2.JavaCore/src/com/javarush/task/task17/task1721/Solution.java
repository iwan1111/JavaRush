package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();

        try (FileReader reader = new FileReader(file1)) {
            scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                allLines.add(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader(file2)) {
            scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                forRemoveLines.add(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        boolean flag=true;
        for(String s : forRemoveLines){
            if (!allLines.contains(s)) flag=false;
        }
         if(flag){
             for(String s : forRemoveLines){
                allLines.remove(s);
             }
         }
         else {
             allLines.clear();
             throw new CorruptedDataException();
         }

    }
}


