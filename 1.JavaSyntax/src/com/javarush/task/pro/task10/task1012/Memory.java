package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        String [] newarray = new String[array.length];

        for (int i = 0, j=0; i < array.length; i++) {
            if(array[i]!=null)
              {
                 newarray[j]=array[i];
                 j++;
             }


            }
        System.arraycopy(newarray, 0, array, 0, array.length);
        return;

        }
    }

