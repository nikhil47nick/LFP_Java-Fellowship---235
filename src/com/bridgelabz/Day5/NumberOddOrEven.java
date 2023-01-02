package com.bridgelabz.Day5;

import java.util.Scanner;

public class NumberOddOrEven {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();

        if ( num%2==0 ){
            System.out.println("Entered number is Even");
        }else {
            System.out.println("Entered number is Odd");
        }

    }
}
