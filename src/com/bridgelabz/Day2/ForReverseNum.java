package com.bridgelabz.Day2;

import java.util.Scanner;

public class ForReverseNum {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Single digit number");
        int tot = 0;
        int num = scn.nextInt();


        for(int i=num;i > 0;i = i/10){
            tot = (tot * 10) + (i % 10);
        }

            System.out.print("Reverse Num: " + tot);

    }

}
