package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //напишите тут ваш код
        if(first.next == null){     //добавляем самый первый элемент
            Node newnode = new Node();
            newnode.prev = null;
            newnode.next = null;
            newnode.value = value;

            first.next = newnode;
            first.prev = null;
            first.value = null;
            last.prev = newnode;
            last.next = null;
            last.value = null;

            return;
        }

        if (first.next==last.prev){ // добавляем второй элемент

            Node newnode = new Node();
            newnode.prev = first.next;
            newnode.next = null;
            newnode.value = value;

            last.prev.next=newnode;
            last.prev = newnode;

            return;
        }

        Node newnode = new Node();
        newnode.prev = last.prev;
        newnode.value = value;
        newnode.next = null;

        last.prev.next=newnode;
        last.prev = newnode;


    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
