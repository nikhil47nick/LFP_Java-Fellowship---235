package com.bridgelabz.Practice.Stack;

public class Queue {

    Node front,rear;
    int length;

    public void enQueue(int data){
        Node node = new Node(data);
        if(front == null){
            front = rear = node;
        }else{
            rear.next = node;
            rear = rear.next;
        }
        length++;
    }

    int getLength(){
        return length;
    }

    public void deQueue(){
        if (front != null){
            front = front.next;
            length--;
        }
    }

}
