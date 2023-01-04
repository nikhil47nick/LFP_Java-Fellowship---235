package com.bridgelabz.Day2;

import java.util.Scanner;

public class WhileSumOfNum {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();
        int tot = 0;
        while(num > 0){
            tot = tot + num;
            System.out.print(num + "+");
            num--;
        }
        System.out.print("= "+tot);
    }
}
