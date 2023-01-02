package com.bridgelabz.Day6;

import java.util.ArrayList;
import java.util.Scanner;

public class Binary {

    public static ArrayList<Integer> toBinary(int n){
        int binary1[] = new int[40];
        ArrayList<Integer> binary = new ArrayList<Integer>();
        while(n > 0){
            binary.add(n%2);
            n = n/2;
        }
        return binary;
    }

    public static void nibble(ArrayList<Integer> binary){
        int len = binary.size()/2;
        if(len%2==1){binary.add(0,0);len++;}
        for(int i = 0;i < len;i++){
            int temp = binary.get(i);
            binary.set(i,binary.get(i+len));
            binary.set(i+len,temp);
        }
        printBinary(binary);
        toInteger(binary);
    }

    public static void printBinary(ArrayList<Integer> binary){
        for(int i = binary.size()-1;i >= 0;i--){
            System.out.print(binary.get(i));
        }
        System.out.println("");
    }

    public static void toInteger(ArrayList<Integer> binary){
        int num=0;
        for(int i = binary.size()-1;i >= 0;i--){
            num = (num*2) + binary.get(i);
        }
        System.out.println("Integer Number"+num);
        System.out.println("Number Is "+powerOf2(num)+" Power of 2");
    }

    public static boolean powerOf2(int num){
        int i=0;
        while(num!=1){
            if(num % 2 != 0){
                return false;}
            num/=2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        ArrayList<Integer> binary = new ArrayList<Integer>(toBinary(n));
        printBinary(binary);
        nibble(binary);
    }
}
