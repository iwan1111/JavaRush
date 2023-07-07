package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable{
    public static void main(String[] args) {
        System.out.println(new Solution(4));
        File myFile = new File("notes.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream fis;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(myFile);
            ois = new ObjectInputStream(fis);
        }  catch (IOException e) {
            e.printStackTrace();
        }
        FileOutputStream fos;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(myFile);
            oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Solution savedObject = new Solution(1);
        try {
            oos.writeObject(savedObject);} catch (IOException e) {
            e.printStackTrace();
        }
        Solution loadedObject = new Solution(2);
        try {
            loadedObject = (Solution) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(savedObject.string.equals(loadedObject.string)) System.out.println("Succses!");
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
