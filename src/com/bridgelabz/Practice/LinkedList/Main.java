package com.bridgelabz.Practice.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.display();
        System.out.println("display");
        l1.addFirst(80);
        l1.display();
        System.out.println("display after add first");
        l1.addAtPosition(30,3);
        l1.display();
        System.out.println("display after add at pos");
        l1.delete(0);
        l1.display();
        System.out.println("display after delete");
    }
}
