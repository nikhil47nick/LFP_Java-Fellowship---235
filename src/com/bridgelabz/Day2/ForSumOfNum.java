package com.bridgelabz.Day2;

import java.util.Scanner;

public class ForSumOfNum {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();
        int tot = 0;
        for (int i = 1; i <= num; i++) {
            tot = tot + i;
            System.out.print(i + "+");
        }
        System.out.print("= " + tot);
    }
}
