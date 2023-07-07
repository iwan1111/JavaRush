package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;

/* 
Генератор паролей
*/

public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        byte[] low = "abcdefghijklmnopqrstuvwxyz".getBytes(StandardCharsets.UTF_8);
        byte[] high = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes(StandardCharsets.UTF_8);
        byte[] numbers = "0123456789".getBytes(StandardCharsets.UTF_8);
        byte[] all = new byte[low.length+ high.length+ numbers.length];
        byte[] pwd = new byte[8];
        int count = 0;

        for(int i=0; i< low.length;i++){
            all[count]=low[i];
            count ++;
        }
        for(int i=0; i< high.length;i++){
            all[count]=high[i];
            count ++;
        }
        for(int i=0; i< numbers.length;i++){
            all[count]=numbers[i];
            count ++;
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);

        boolean containsDigit = false;
        boolean containsLowercase = false;
        boolean containsUppercase = false;

        while (!(containsDigit && containsLowercase && containsUppercase)) {
            baos.reset();
            for (int i = 0; i < 8; i++) {
                int rand = (int) (Math.random() * 3);
                switch (rand) {
                    case 0:
                        baos.write(low[(int) Math.random()* low.length]); // lowercase letters
                        containsLowercase = true;
                        break;
                    case 1:
                        baos.write(high[(int) Math.random()* high.length]); // uppercase letters
                        containsUppercase = true;
                        break;
                    case 2:
                        baos.write(numbers[(int) Math.random()* numbers.length]); // digits
                        containsDigit = true;
                        break;
                }
            }
        }

        return baos;
    }


}
