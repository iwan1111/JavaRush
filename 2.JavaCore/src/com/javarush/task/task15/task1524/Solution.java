package com.javarush.task.task15.task1524;

/* 
Порядок загрузки переменных
*/

public class Solution {
    static {
        init();//2
    }
    static {
        System.out.println("Static block");//
    }

    {
        System.out.println("Non-static block");//
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";



    public Solution() {
        System.out.println("Solution constructor");//8
        printAllFields(this);//9
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main"); //
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");//5
        System.out.println(obj.i);//7
        System.out.println(obj.name);//6
    }
}
