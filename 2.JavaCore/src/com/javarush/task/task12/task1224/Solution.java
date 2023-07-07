package com.javarush.task.task12.task1224;

/* 
�������� ��������
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //�������� ��� ��� ���
        if (o instanceof Cat) return "���";
        if (o instanceof Tiger) return "����";
        if (o instanceof Lion) return "���";
        if (o instanceof Bull) return "���";

        return "��������";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
