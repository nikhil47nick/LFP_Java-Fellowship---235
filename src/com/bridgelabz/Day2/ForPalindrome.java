package com.bridgelabz.Day2;

import java.util.Scanner;

public class ForPalindrome {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Single digit number");
        int tot = 0;
        int num = scn.nextInt();


        for(int i=num;i > 0;i = i/10){
            tot = (tot * 10) + (i % 10);
        }
        if(num == tot) {
            System.out.print("Number is Palindrome and Reverse Num: " + tot);
        }else{
            System.out.print("Number is not Palindrome and Reverse Num: " + tot);
        }
    }

}
