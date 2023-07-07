package com.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static java.nio.file.Files.exists;
import static java.nio.file.Files.isRegularFile;

/* 
Файловые операции
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        //напишите тут ваш код

                if(exists(filePath)){
                    if(exists(fileNewPath)){
                        Files.delete(filePath);
                    }
                    else{
                        Files.move(filePath, fileNewPath);
                    }

                }
                else {
                    Files.createFile(filePath);
                }

    }
}

