package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;

/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String path = args[0];
        File file = new File(path);
        String resultFileAbsolutePath = args[1];
        File resultFile = new File(resultFileAbsolutePath);

        //FileUtils.renameFile(resultFileAbsolute, new File(resultFileAbsolute.getParentFile()+"/allFilesContent.txt"));

        File dest = new File(resultFile.getParentFile() + "/allFilesContent.txt");
        if (FileUtils.isExist(dest)) {
            FileUtils.deleteFile(dest);
        }
        FileUtils.renameFile(resultFile, dest);


        FileOutputStream fos = new FileOutputStream(dest, true);

        vvv(file, fos);
        fos.close();
    }
    public static void vvv(File path, FileOutputStream fos){
        try {

            for (File file : path.listFiles()) {
                if (file.length() <= 50 && !file.isDirectory()) {
                    FileInputStream fis = new FileInputStream(file);

                    fos.write(Files.readAllBytes((Path) fis));
                    fos.write("\n".getBytes(StandardCharsets.UTF_8));

                }
                if (file.isDirectory()) {
                    vvv(file, fos);
                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
