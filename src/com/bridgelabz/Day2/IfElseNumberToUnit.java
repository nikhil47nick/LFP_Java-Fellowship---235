package com.bridgelabz.Day2;

import java.util.Scanner;

public class IfElseNumberToUnit {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Single digit number");
        int num = scn.nextInt();
        if (num < 10 || num == 1) {
            System.out.println("Unit");
        }else if (num == 10 || num < 100) {
            System.out.println("Ten");
        }else if (num == 100 || num < 1000) {
            System.out.println("Hundred");
        }else if (num == 1000 || num < 100000) {
            System.out.println("Thousand");
        }else if (num == 10000 || num < 100000) {
            System.out.println("Ten-Thousand");
        } else {
            System.out.println("Enter value with in Million");
        }

    }
}
