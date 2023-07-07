package com.javarush.task.pro.task18.task1805;

import java.util.Comparator;

class StringComparator implements Comparator<String>
{
    public int compare (String obj1, String obj2)
    {
        return obj1.length() - obj2.length();
    }
}