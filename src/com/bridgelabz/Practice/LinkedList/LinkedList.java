package com.bridgelabz.Practice.LinkedList;

public class LinkedList {
    Node head;

    public void add(int data){
        Node node = new Node();
        node.data = data;
        node.next=null;

        if(head == null){
            head = node;
        }else {
            Node n = head;
            while (n.next != null){
                n=n.next;
            }
            n.next = node;
        }
    }
    public void delete(int key){

        Node n = head, prev = null;

        if (n != null && n.data == key) {
            head = n.next;

        }else {
            while (n != null && n.data != key) {
                prev = n;
                n = n.next;
            }
            prev.next = n.next;
        }

    }

    public void addFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head=node;

    }

    public void addAtPosition(int data,int pos){
        Node node = new Node();
        node.data = data;

        if(pos == 0) {
            addFirst(data);
        }else{
            Node n = head;
            for (int i = 0; i < pos; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void display(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}
