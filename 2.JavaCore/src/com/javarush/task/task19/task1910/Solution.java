package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) {
        String fileInputName = null;
        String fileOutputName = null;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            fileInputName=bufferedReader.readLine();
            fileOutputName=bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> fileContent = new ArrayList<>();
        try(BufferedReader bufferedReaderInput = new BufferedReader(new FileReader(fileInputName))){
            while(bufferedReaderInput.ready()){
                fileContent.add(bufferedReaderInput.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter bufferedWriterOutput = new BufferedWriter(new FileWriter(fileOutputName))){
            for(String str:fileContent){
                bufferedWriterOutput.write(str.replaceAll("\\p{Punct}",""));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
