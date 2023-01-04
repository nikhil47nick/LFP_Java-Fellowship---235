package com.bridgelabz.Day2;

import java.util.Scanner;

public class WhileReverseNum {


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

