package com.bridgelabz.Day6;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scr.nextInt();
        int count = 0;
        for (int i=2;i<=(num/2);i++){
            if (num%i == 0){
                count++;
            }
        }
        if (count == 0 || num ==0 || num == 1 || num == 2)
        {
            System.out.println("Number Is Prime Number");
        }else{
            System.out.println("Number Is not prime Number");
        }
    }
}
