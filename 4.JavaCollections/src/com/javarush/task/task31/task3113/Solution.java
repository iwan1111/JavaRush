package com.javarush.task.task31.task3113;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

/* 
Что внутри папки?
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String pathstring = in.nextLine();
        Path path = Paths.get(pathstring);
        if(!Files.isDirectory(path)) {System.out.println(path.normalize() + " - не папка"); return;}
        MyFileVisitor<Path> a = new MyFileVisitor<Path>();
        Files.walkFileTree(Paths.get(pathstring), a);
        System.out.println("Всего папок - " + a.countdir);
        System.out.println("Всего файлов - " + a.countfiles);
        System.out.println("Общий размер - " + a.filessize);


    }

    public static class MyFileVisitor<P> extends SimpleFileVisitor<Path> {

        int countdir=-1;
        int countfiles=0;
        long filessize=0;
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            if(Files.isDirectory(dir))
                countdir++;
            return FileVisitResult.CONTINUE;
        }


        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

                if(Files.isRegularFile(file)){
                  countfiles++;
                  filessize+=Files.size(file);
                  }
                return FileVisitResult.CONTINUE;
        }
    }
}
