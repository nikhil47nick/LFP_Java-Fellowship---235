package com.bridgelabz.Day6;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();
        int tot = 0;

        while(num > 0){
            tot = (tot * 10) + (num % 10);
            num = num/10;
        }
        System.out.print("Reverse Num: "+ tot );
    }
}
