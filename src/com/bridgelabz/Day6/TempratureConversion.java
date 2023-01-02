package com.bridgelabz.Day6;

import java.util.Scanner;

public class TempratureConversion {
    public static void main() {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter temperature");
        double temp = scr.nextDouble();
        System.out.println("Enter 1 for convert to C to F and 2 for F to C");
        int t = scr.nextInt();
        switch (t) {
            case 1 : temp = (temp * 9 / 5) + 32;
            break;
            case 2 : temp = (temp - 32) * (5 / 9);
            break;
            default: break;
        }
        System.out.println("Temperature is : "+temp);
    }
}
