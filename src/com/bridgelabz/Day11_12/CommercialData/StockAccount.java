package com.bridgelabz.Day11_12.CommercialData;

import com.bridgelabz.Practice.LinkedList.Node;

import java.io.*;
import java.util.Date;
import java.nio.file.*;
import java.util.Scanner;

public class StockAccount {

    Stock head;


    StockAccount(String fileName) {

        Scanner scr = new Scanner(fileName);


    }

    double valueOf(){
        Stock node = head;
        int total=0;
        while(node.symbol != null){
            total = total + node.amount;
            node = node.next;
        }
        return total;
    }

    void buy(int amount, String symbol){
        Stock node = new Stock();
        Date date = new Date();
        node.symbol = symbol;
        node.amount = amount;
        node.numberOfShares =1;
        node.date = date.getDate();

        int fount=0;
        Stock n = head;
        while(n != null){
            if (n.symbol == symbol) {
                n.numberOfShares++;
                n.amount = n.amount+amount;
                fount =1;
            }else{
                n = n.next;
            }
        }

        if(fount != 1){
            n.next=node;
        }

    }

    void sell(int amount, String symbol){

      Stock n =head,prev = null;

        if (n != null && n.symbol == symbol) {
            if (n.numberOfShares == 1) {
                head = n.next;
            }else{
                n.numberOfShares--;
                n.amount = n.amount-amount;
            }

        }else {
            while (n != null && n.symbol != symbol) {

                prev = n;
                n = n.next;
            }
            if (n.numberOfShares == 1) {
                prev.next = n.next;
            }else{
                n.numberOfShares--;
            }

        }

    }

    void save(String filename) throws IOException {
        FileWriter myWriter = new FileWriter(filename);
        Stock node = head;
        while(node.next != null){
            myWriter.write(node.symbol);
            myWriter.write(node.numberOfShares);
            myWriter.write(node.amount);
            myWriter.write(node.date);
            node = node.next;
        }
        myWriter.write(node.symbol);
        myWriter.write(node.numberOfShares);
        myWriter.write(node.amount);
        myWriter.write(node.date);
    }

    void printReport(){
        Stock node = head;
        while(node.next != null){
            System.out.println("Stock name: "+node.symbol);
            System.out.println("Number of Shares: "+node.numberOfShares);
            System.out.println("Total amount: "+node.amount);
            System.out.println("Date: "+node.date);

            node = node.next;
        }
        System.out.println("Stock name: "+node.symbol);
        System.out.println("Number of Shares: "+node.numberOfShares);
        System.out.println("Total amount: "+node.amount);
        System.out.println("Date: "+node.date);
    }

}
