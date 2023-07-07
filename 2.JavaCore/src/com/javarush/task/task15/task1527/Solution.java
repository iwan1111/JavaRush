package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        int first = url.indexOf("?");
        int second = url.indexOf("&", first);
        ArrayList<String> arrayListstring = new ArrayList<String>();
        ArrayList<Double> arrayListdouble = new ArrayList<Double>();
        String param = new String();
        Object val = null;


        String sub = url.substring(first+1, second!=-1?second:(url.length()));
        if(sub.indexOf("=")==-1) {
            arrayListstring.add(sub);
            param = sub;
        }
        else {
            arrayListstring.add(sub.substring(0, sub.indexOf("=")));
            param = sub.substring(0, sub.indexOf("="));
            if (sub.substring(0,sub.indexOf("=")).equals("obj") ) {
                try {
                    val = Double.parseDouble(sub.substring(sub.indexOf("=") + 1));
                } catch (Exception e) {
                    val = sub.substring(sub.indexOf("=") + 1);
                }
            }
        }



       while (second!=-1){
            first = url.indexOf("&", second);
            second = url.indexOf("&", first+1);

           sub = url.substring(first+1, second!=-1?second:(url.length()));

           if(sub.indexOf("=")==-1) {
               arrayListstring.add(sub);
               param = param + " " + sub;
           }
           else {
               arrayListstring.add(sub.substring(0, sub.indexOf("=")));
               param = param + " " + sub.substring(0, sub.indexOf("="));
               if (sub.substring(0,sub.indexOf("=")).equals("obj") ) {
                   try {
                       val = Double.parseDouble(sub.substring(sub.indexOf("=") + 1));
                   } catch (Exception e) {
                       val = sub.substring(sub.indexOf("=") + 1);
                   }
               }
           }

        }

        System.out.println(param);
       if (val != null){
           try{alert((Double) val);}
           catch (Exception e)
           {
               alert((String) val);
           }
       }



    //    for (String str:arrayListstring) {
      //      alert(str.toString());
        //}
        for (double d:arrayListdouble) {
            alert(d);
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
