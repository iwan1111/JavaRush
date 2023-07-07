package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Stack;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {

        ArrayList<String> filenames = new ArrayList<>();
        ArrayList<File> folders = new ArrayList<>();

        folders.add(new File(root));

        while(!folders.isEmpty()) {
            File rootF = folders.remove(0);
            File[] listFolder = rootF.listFiles();

            for (File f : listFolder) {
                if (f.isDirectory()) folders.add(f);
                if (f.isFile()) filenames.add(String.valueOf(f));
            }
        }




        return filenames;

    }

    public static void main(String[] args) {

    }
}
