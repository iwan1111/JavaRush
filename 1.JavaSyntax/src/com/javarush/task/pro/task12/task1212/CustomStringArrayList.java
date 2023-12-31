package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишите тут ваш код
        String[] newelements = new String[(int)(capacity*1.5)];
        System.arraycopy(elements, 0, newelements,0, size);
        elements = new String[(int)(capacity*1.5)];
        System.arraycopy(newelements, 0, elements,0, size);
        capacity*=1.5;
        return;

    }

}
