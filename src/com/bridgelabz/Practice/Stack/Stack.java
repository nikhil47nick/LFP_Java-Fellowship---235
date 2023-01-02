package com.bridgelabz.Practice.Stack;

public class Stack {

    Node top;
    int size;

    public void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
        size++;
    }

     int getSize(){return size;}

    boolean isEmpty(){return size==0;}

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }
            int temp = top.data;
            top = top.next;
            size--;
            return temp;

    }

}
