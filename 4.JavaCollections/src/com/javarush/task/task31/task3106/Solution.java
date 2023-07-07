package com.javarush.task.task31.task3106;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* 
Разархивируем файл
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        String resultname = args[0];
        FileOutputStream fos = new FileOutputStream(resultname);
        ArrayList<String> archivename = new ArrayList<String>();
        for(int i=1; i< args.length;i++){
            archivename.add(args[i]);
        }
        ZipInputStream archive;
        for (int i=1; i<args.length;i++){
            try {
                archive = new ZipInputStream(new FileInputStream(archivename.get(i)));
                archive.getNextEntry();

                while(archive.available()==1){
                    fos.write(archive.read());
                }

                archive.closeEntry();
                archive.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
