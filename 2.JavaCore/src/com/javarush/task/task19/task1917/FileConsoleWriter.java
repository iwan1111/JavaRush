package com.javarush.task.task19.task1917;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

/* 
Свой FileWriter
*/

public class FileConsoleWriter {
    private FileWriter fileWriter;
    public FileConsoleWriter(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName);
       }
       public FileConsoleWriter(String fileName, boolean a) throws IOException {
        fileWriter = new FileWriter(fileName, a);
       }
       public FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
       }
       public FileConsoleWriter(File file, boolean a) throws IOException {
        fileWriter = new FileWriter(file, a);
       }
       public FileConsoleWriter(FileDescriptor fd) throws IOException {
        fileWriter = new FileWriter(fd);
       }




    public void write(char[] cbuf, int off, int len) throws IOException
    {
        fileWriter.write(cbuf, off, len);
        System.out.println(String.valueOf(cbuf,off,len));
        return;
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
        return;
    }
    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
        return;
    }
    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off+len));
        return;
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.println(String.valueOf(cbuf));
        return;
    }

    public void close() throws IOException {
        fileWriter.close();
    }


    public static void main(String[] args) {


    }

}
