package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) {
        String inputFileName = null;
        String outputFileName = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFileName = reader.readLine();
            outputFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        ArrayList<String> fileContent = new ArrayList<>();
        
        try(BufferedReader readFile = new BufferedReader(new FileReader(inputFileName))){
            while (readFile.ready()) {
                fileContent.add(readFile.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            for(String s : fileContent){
                outputFileWriter.write(s.replaceAll("\\.", "!"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
