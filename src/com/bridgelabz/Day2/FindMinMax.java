package com.bridgelabz.Day2;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Single digit number");
        double a = scn.nextDouble();
        System.out.println("Enter Single digit number");
        double b = scn.nextDouble();
        System.out.println("Enter Single digit number");
        double c = scn.nextDouble();

        double cal1 = a + (b * c);
        double cal2 = c + (a / b);
        double cal3 = (a % b) + c;
        double cal4 = (a * b) + c;
        double min = cal1, max = cal2;

        if (cal1 > cal2) {
            min = cal2;
            max = cal1;
        } else if (min > cal3) {
            min = cal3;
        } else if (min > cal4) {
            min = cal4;
        } else if (max < cal3) {
            max = cal3;
        } else if (max < cal4) {
            max = cal4;
        } else if (max < cal1) {
            max = cal1;
        }

        System.out.println("Max Num : "+ max +"  Min Num : "+ min );

    }
}
